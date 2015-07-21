package interview.rmi.serviceImpl;

import interview.rmi.model.PersonEntity;
import interview.rmi.service.PersonService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

public class PersonServiceImpl extends UnicastRemoteObject implements PersonService {

    public PersonServiceImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = -4765548836667949300L;

    @Override
    public List<PersonEntity> GetList() throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("Get Person Start!");
        List<PersonEntity> personList=new LinkedList<PersonEntity>();  
        
        PersonEntity person1=new PersonEntity();  
        person1.setAge(25);
        person1.setId(0);
        person1.setName("Leslie");
        personList.add(person1);
        
        PersonEntity person2=new PersonEntity();  
        person2.setAge(25); 
        person2.setId(1);
        person2.setName("Rose"); 
        personList.add(person2);  
        
        return personList;
    }

}
