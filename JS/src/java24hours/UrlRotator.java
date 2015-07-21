package java24hours;

import java.awt.Button;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UrlRotator extends JFrame implements Runnable, ActionListener {
    /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = 1L;
    Thread rotator;
    boolean flag = false;
    HashMap<String, URI> mapSiteURIs = new HashMap<String, URI>();
    String current = "";
    int totalSites = 0;
    JLabel siteLabel = new JLabel("Current site:");
    JTextField tCurSite;
    
    public UrlRotator(HashMap<String, String> mapNameLink) {
        super("URL Rotator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 100);
        FlowLayout flo = new FlowLayout();
        this.setLayout(flo);
        sitesInit(mapNameLink);
        tCurSite = new JTextField(20);
        this.add(siteLabel);
        this.add(tCurSite);
        Button bVisit = new Button("Stop Rorating");
        bVisit.addActionListener(this);
        this.add(bVisit);
        setVisible(true);
        this.setAlwaysOnTop(true);
        this.flag = true;
        start();
    }
    
    private void start() {
        // TODO Auto-generated method stub
        if (null==rotator) {
            rotator = new Thread(this);
            rotator.start();
        }
    }

    private void sitesInit(HashMap<String, String> mapNameLink) {
       for (Entry<String,String> entry:mapNameLink.entrySet()) {
            URI uri = null;
            try {
                uri = new URI(entry.getValue());
            } catch (URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            mapSiteURIs.put(entry.getKey(), uri);
        }
    }
    
    private URI getURI(String string) {
        // TODO Auto-generated method stub
        URI uri = null;
        try {
            new URI(string);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return uri;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (true==flag) {
            flag = false;
        }
    }

    private void whileFlagFor() {
        Desktop desktop = Desktop.getDesktop();
        while (true == flag) {
            for (Entry<String,URI> entry : mapSiteURIs.entrySet()) {
                tCurSite.setText(entry.getKey());
                repaint();
                try {
                    desktop.browse(entry.getValue());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    desktop = null;
                }
            } 
        }
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //Thread thisThread = Thread.currentThread();
        whileFlagFor(); 
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
        HashMap<String, String> mapNameLink = new HashMap<String, String>();
        mapNameLink.put("Google", "http://www.google.com");
        mapNameLink.put("Baidu", "http://www.baidu.com");
        mapNameLink.put("Youtube", "http://www.youtube.com");

        new UrlRotator(mapNameLink);
    }

}
