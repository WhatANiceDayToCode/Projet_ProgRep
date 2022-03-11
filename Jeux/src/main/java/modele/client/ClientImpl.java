package modele.client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl extends UnicastRemoteObject implements ClientInterface {

    public ClientImpl() throws RemoteException {
        super();
    }
}
