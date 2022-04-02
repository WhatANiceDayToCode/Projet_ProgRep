package serveur;

import client.modele.menu.MenuImpl;
import serveur.Pojo.PenduImpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
* RMI signifie Remote Method Invocation.
* Il s'agit d'un mécanisme qui permet à un objet résidant dans un système (JVM)
* d'accéder à / invoquer un objet exécuté sur une autre JVM.
* RMI est utilisé pour créer des applications distribuées,
* il fournit une communication à distance entre les programmes Java.
 */
public class Serveur {
    public static void main (String[] argv) {
        try {
            // Affichage à titre indicatif
            System.out.println("------------------------------------------------------");
            System.out.println("             Server Jeux en préparation...            ");
            System.out.println("------------------------------------------------------");
            int port = 8001;
            LocateRegistry.createRegistry(port);

            // Test utilisation fonction rmi (mot aléatoire)
            // PenduImpl penduImpl = new PenduImpl();
            // System.out.println(penduImpl.motAleatoire());

            // Création des différentes routes
            Naming.rebind("rmi://localhost:"+ port +"/jeux", new MenuImpl());
            Naming.rebind("rmi://localhost:"+ port +"/pendu", new PenduImpl());

            // Affichage à titre indicatif
            System.out.println("------------------------------------------------------");
            System.out.println("                  Server Jeux prêt !                  ");
            System.out.println("------------------------------------------------------");
        } catch (Exception e) {
            // Affichage à titre informatif
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Serveur Jeux échec" + e);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }
}
