package modele.menu;
import java.rmi.Remote;

public interface MenuInterface extends Remote {
}

// utilisée dans le client pour MenuInterface obj = (MenuInterface) Naming.lookup("rmi://localhost:"+ port +"/jeux");
// Ne pas supprimer
