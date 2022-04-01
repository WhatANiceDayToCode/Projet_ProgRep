package serveur;
import client.modele.menu.MenuImpl;
import serveur.Pojo.PenduImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

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
