package modele.menu;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MenuImpl extends UnicastRemoteObject implements MenuInterface {

    public MenuImpl() throws RemoteException {
        super();
    }
}
