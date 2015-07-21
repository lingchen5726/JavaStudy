package interview.rmi.service;

import interview.rmi.model.PersonEntity;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PersonService extends Remote {
    public List<PersonEntity> GetList() throws RemoteException;
}
