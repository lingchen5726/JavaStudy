package java24hours;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SquareRootClient {

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
        try {
            URL url = new URL("http://127.0.0.1:5335/service?wsdl");
            //If the package of the implService is a.b.c, then the URI should be http://c.b.a
            QName qname = new QName("http://java24hours/", "SquareRootServerImplService");
            Service svc = Service.create(url, qname);
            SquareRootServer srs = svc.getPort(SquareRootServer.class);
            double d = 625D;
            System.out.println("Square root of d is: "+srs.getSquareRoot(d));
            System.out.println("Current time is: "+srs.getTime());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
