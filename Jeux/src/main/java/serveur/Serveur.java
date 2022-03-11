package serveur;
import modele.client.ClientImpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main (String[] argv) {
        try {
            int port = 8000;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+ port +"/calculateur", new ClientImpl());
            System.out.println("------------------------------------------------------");
            System.out.println("Server Jeux prêt !");
            System.out.println("------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("------------------------------------------------------");
            System.out.println("Serveur Jeux échec" + e);
            System.out.println("------------------------------------------------------");
        }
    }
}
