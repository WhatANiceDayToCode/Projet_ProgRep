package modele.menu;

import serveur.InterfaceRMI.PenduInterface;
import serveur.Pojo.Dico;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class PenduImpl extends UnicastRemoteObject implements PenduInterface {
    public PenduImpl() throws RemoteException {
        super();
    }

    /*public String motAleatoire() throws RemoteException {
        //On récupère toutes les valeurs du dictionnaire.
        Dico[] dictionnaire = Dico.values();
        //On créer un entier aléatoire de la taille du dictionnaire.
        int entierAleatoire = randInt(dictionnaire.length);
        //On génère le mot aléatoirement et on le retourne.
        String mot = dictionnaire[entierAleatoire].toString();
        return mot;
    }

    public int randInt(int max) throws RemoteException {
        Random rand = new Random();
        int n = rand.nextInt(max);
        return n;
    }*/
}
