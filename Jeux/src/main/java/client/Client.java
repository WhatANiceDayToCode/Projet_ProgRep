package client;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.Naming;

import static javafx.application.Application.launch;

public class Client extends Application {

    public static void main (String[] argv) {
        try {
            int port = 8001;
            Naming.lookup("rmi://localhost:"+ port +"/jeux");
            Naming.lookup("rmi://localhost:"+ port +"/pendu");
            System.out.println("------------------------------------------------------");
            System.out.println("                  Connecté au serveur !               ");
            System.out.println("------------------------------------------------------");
            launch();
        } catch (Exception e) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Client exception: " + e);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }

    @Override
    // En langage Java, le mot-clé final indique qu'un élément ne peut être changé dans la suite du programme.
    // Il peut s'appliquer aux méthodes et attributs d'une classe et à la classe elle-même.
    // Aussi, il peut s'appliquer sur les paramètres d'une méthode et sur les variables locales
    public void start(final Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        // changer le titre de la fenêtre à menu
        stage.setTitle("Menu");
        // afficher la scene créée dans scene builder
        stage.setScene(scene);
        stage.show();
        // empêcher de redimensionner la fenêtre
        stage.setResizable(false);
    }
}