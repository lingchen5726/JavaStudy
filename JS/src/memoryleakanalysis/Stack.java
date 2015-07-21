/****************************************************************
** Product	:	HP Subscriber Network Application Policy
** Module	:	FIXME: <RTP/Scheduler, should be your maven project name>
** Date: Feb 28, 2015				
** Author: FIXME: WIN8
** (C) Copyright 2015, Hewlett-Packard Company, All Rights Reserved.
** This software is the proprietary information of HP, Inc.  
** Use is subject to license terms.
*****************************************************************
** Description:   
** FIXME: <A few lines of description of what the program file is about and what it does.> 
** FIXME: <The list of all the class names which have been implemented if multiple classes is implemented in this file.>
****************************************************************/
package memoryleakanalysis;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * FIXME: <A few lines of description of what class is about and what it does.> 
 *
 * <HR/><B>Modification Block</B>
 * <P>
 * Version: FIXME: 1.0.1 <BR>
 * Author: FIXME: WIN8
 * Date: Feb 28, 2015
 * TAG: <A short name to find out all changed made by this modification.>
 * Comments: Created.
 * Bug fix NO.: <If required>
 * </P>
 * <P>
 * ... Other Modifications following above structure.
 * </P>
 **/

public class Stack implements Runnable{

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
        Stack s = new Stack("MemoryLeakTest");
        Thread t = new Thread(s);
        t.start();
    }

    private String name;
    private Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY = 4;
    private static int i=0;
    
    public Stack(String name) {
        this.name = name;
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    
    public void push(Object e) {
        ensureCapacity();
        elements[size++]=e;
    }
    
    public Object pop() {
        if (0==size) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity() {
        // TODO Auto-generated method stub
        if (elements.length==size) {
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    } 
    
    private void intendedLeak(Stack testStack) {
        this.i++;
        for (int j=0;j<DEFAULT_INITIAL_CAPACITY+1;j++) {
            String strElement = String.valueOf(i)+":String_"+String.valueOf(j);
            testStack.push(strElement);
            System.out.println(i+"_push"+j+"testStack's size is: "+testStack.size);
        }
        for (int j=0;j<DEFAULT_INITIAL_CAPACITY;j++) {
            testStack.pop();
            System.out.println(i+"_pop"+j+"testStack's size is: "+testStack.size);
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        Stack testStack = new Stack("");
        for (int loop=0;loop<1000;loop++) {
            intendedLeak(testStack);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
