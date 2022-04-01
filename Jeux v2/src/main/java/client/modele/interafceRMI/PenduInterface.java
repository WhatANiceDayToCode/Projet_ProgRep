package client.modele.interafceRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PenduInterface extends Remote {
    public String motAleatoire()throws RemoteException;
    public int randInt(int max) throws RemoteException;
}
