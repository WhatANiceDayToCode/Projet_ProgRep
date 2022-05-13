package serveur.InterfaceRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PenduInterface extends Remote {

     public String motAleatoire() throws RemoteException;

    // public int nombreAleatoire(int max) throws RemoteException;

     public String changeMot(String mot, char[] lettres) throws RemoteException;

     public boolean contientCaractere(char[] tab, char c) throws RemoteException;

     public char[] ajouterCaractere(char[] tab, char c) throws RemoteException;
}
