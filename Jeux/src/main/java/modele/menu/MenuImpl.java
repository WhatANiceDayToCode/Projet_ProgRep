package modele.menu;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;
import java.util.Scanner;

public class MenuImpl extends UnicastRemoteObject implements MenuInterface {

    public MenuImpl() throws RemoteException {
        super();
    }
}
