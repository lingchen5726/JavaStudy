/****************************************************************
** Product	:	HP Subscriber Network Application Policy
** Module	:	FIXME: <RTP/Scheduler, should be your maven project name>
** Date: Mar 9, 2015				
** Author: FIXME: WIN8
** (C) Copyright 2015, Hewlett-Packard Company, All Rights Reserved.
** This software is the proprietary information of HP, Inc.  
** Use is subject to license terms.
*****************************************************************
** Description:   
** FIXME: <A few lines of description of what the program file is about and what it does.> 
** FIXME: <The list of all the class names which have been implemented if multiple classes is implemented in this file.>
****************************************************************/
package java24hours;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * FIXME: <A few lines of description of what class is about and what it does.> 
 *
 * <HR/><B>Modification Block</B>
 * <P>
 * Version: FIXME: 1.0.1 <BR>
 * Author: FIXME: WIN8
 * Date: Mar 9, 2015
 * TAG: <A short name to find out all changed made by this modification.>
 * Comments: Created.
 * Bug fix NO.: <If required>
 * </P>
 * <P>
 * ... Other Modifications following above structure.
 * </P>
 **/

public class PrimeFinder extends JFrame implements Runnable, ActionListener {

    /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = 1L;

    JFrame thisFrame;
    Thread threadPrimeFinder;
    JLabel labelPrimeNumbers;
    JTextField tPrimeNumbers;
    JButton bSearchPrime;
    JTextArea primes;

    JLabel labelCheckNumber;
    JTextField tNumberToBeChecked;
    JButton bCheckPrime;
    ActionListenerCheckPrime acCheckPrime;
    
    
    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param title
     * @throws HeadlessException
     */
    public PrimeFinder() throws HeadlessException {
        super("Prime finder");
        thisFrame = this;
        // TODO Auto-generated constructor stub
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bord = new BorderLayout();
        this.setLayout(bord);
        
        labelPrimeNumbers = new JLabel("Prime numbers to find");
        tPrimeNumbers = new JTextField("400", 10);
        bSearchPrime = new JButton("Search");
        primes = new JTextArea(8, 40);
        bSearchPrime.addActionListener(this);
        JPanel topPanel = new JPanel();
        topPanel.add(labelPrimeNumbers);
        topPanel.add(tPrimeNumbers);
        topPanel.add(bSearchPrime);
        this.add(topPanel, BorderLayout.NORTH);
        
        primes.setLineWrap(true);
        JScrollPane primePane = new JScrollPane(primes);
        this.add(primePane, BorderLayout.CENTER);
        
        //To check whether the input number is prime
        labelCheckNumber = new JLabel("Check whether it's a prime number");
        tNumberToBeChecked = new JTextField("97", 40);
        bCheckPrime = new JButton("Check Prime");
        acCheckPrime = new ActionListenerCheckPrime();
        bCheckPrime.addActionListener(acCheckPrime);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(labelCheckNumber);
        bottomPanel.add(tNumberToBeChecked);
        bottomPanel.add(bCheckPrime);
        this.add(bottomPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        bSearchPrime.setEnabled(false);
        primes.setText("");
        if (null == this.threadPrimeFinder) {
            this.threadPrimeFinder = new Thread(this);
            if (null!=this.threadPrimeFinder) {
                this.threadPrimeFinder.start();
            }
        }
    }

    class ActionListenerCheckPrime implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            int number = Integer.parseInt(tNumberToBeChecked.getText());
            if (isPrime(number)) {
                tNumberToBeChecked.setText(number+" is a prime number");
            } else {
                tNumberToBeChecked.setText(number+" is not a prime number");
            }
            thisFrame.repaint();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        int iPrimeNumbers = Integer.parseInt(this.tPrimeNumbers.getText());
        
        int foundPrimes = 0;
        int candidate = 2;
        primes.append("Found first "+iPrimeNumbers+" prime numbers:\n");
        while (foundPrimes<iPrimeNumbers) {
            if (isPrime(candidate)) {
                primes.append(String.valueOf(candidate)+",");
                foundPrimes++;
            }
            candidate++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.threadPrimeFinder = null;
        bSearchPrime.setEnabled(true);
    }

    public static boolean isPrime(int candidate) {
        // TODO Auto-generated method stub
        double root = Math.sqrt(candidate);
        
        for (int i=2;i<=root;i++) {
            if (0==(candidate%i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new PrimeFinder();
        /*
        if (PrimeFinder.isPrime(Integer.parseInt(args[0]))) {
            System.out.println(args[0]+" is a prime number");
        } else {
            System.out.println(args[0]+" is not a prime number");
        }*/
    }

}
