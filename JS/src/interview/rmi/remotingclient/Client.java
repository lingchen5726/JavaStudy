package interview.rmi.remotingclient;

import interview.rmi.model.PersonEntity;
import interview.rmi.service.PersonService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class Client {

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
            //For RMISecurityManager
            //System.setSecurityManager(new java.rmi.RMISecurityManager());
            
            PersonService personService = (PersonService)Naming.lookup("rmi://127.0.0.1:6600/PersonService");
            List<PersonEntity> personList=personService.GetList();
            for (PersonEntity person: personList) {
                System.out.println("ID:"+person.getId()+" Age:"+person.getAge()+" Name:"+person.getName());
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
