package serveur.Pojo;

import serveur.InterfaceRMI.PenduInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class PenduImpl extends UnicastRemoteObject implements PenduInterface {

    public PenduImpl() throws RemoteException {
        super();
    }

    /*
    * Dans cette fonction on récupère les mots du dico
    * On calcule la taille maximale de celui-ci
    * On génère un mot du dico
    * Finalement on retourne celui-ci
     */
    public String motAleatoire() throws RemoteException {
        Dico[] dictionnaire = Dico.values();
        int tailleDico = nombreAleatoire(dictionnaire.length);
        String mot = dictionnaire[tailleDico].toString();
        return mot;
    }

    /*
    * Fonction qui retourne un nombre aléatoire en tenant compte d'un maximum
     */
    public int nombreAleatoire(int max) throws RemoteException {
        Random rand = new Random();
        int n = rand.nextInt(max);
        return n;
    }

    /*
    * Le mot est tout d'abord en liste de caractères
    * On vérifie ensuite si la lettre entrée correspond à la lettre du mot
    * Si elle correspond : on remplace la lettre dans le mot
    * Sinon on laisse le "_ "
    * Ensuite on concatène les caractères du mot
    * Et on l'affiche !
     */
    public String changeMot(String mot, char[] lettres) throws RemoteException {
        String motAffichage = "";
        String lettre = "";
        char[] motLettreParLettre = mot.toCharArray();
        for(int i = 0; i < motLettreParLettre.length; i++){
            lettre = "_ ";
            for(int j = 0; j < lettres.length; j++){
                if(motLettreParLettre[i] == lettres[j]) {
                    lettre = lettres[j] + " ";
                }
            }
            motAffichage += lettre;
        }
        return motAffichage;
    }

    /*
    * Cette fonction vérifie si le mot contient le caractère
    * True si oui
    * False si non
     */
    public boolean contientCaractere(char[] tab, char c) throws RemoteException {
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == c){
                return false;
            }
        }
        return true;
    }

    /*
    * Cette fonction permet d'ajouter un caractère entré à un tableau
     */
    public char[] ajouterCaractere(char[] tab, char c) throws RemoteException {
        char[] tabVide = new char[1];
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == tabVide[0]){
                if(contientCaractere(tab, c)){
                    tab[i] = c;
                }
            }
        }
        return tab;
    }
}
