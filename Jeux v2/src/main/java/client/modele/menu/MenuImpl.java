package client.modele.menu;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MenuImpl extends UnicastRemoteObject implements Remote {

    public MenuImpl() throws RemoteException {
        super();
    }
}
