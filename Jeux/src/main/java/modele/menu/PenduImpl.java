package modele.menu;

import serveur.InterfaceRMI.PenduInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PenduImpl extends UnicastRemoteObject implements PenduInterface {
    public PenduImpl() throws RemoteException {
        super();
    }
}
