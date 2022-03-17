package client;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modele.menu.MenuInterface;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static javafx.application.Application.launch;

public class Client extends Application {

    public static void main (String[] argv) {
        try {
            int port = 8001;
            MenuInterface obj = (MenuInterface) Naming.lookup("rmi://localhost:"+ port +"/jeux");
            launch();
        } catch (Exception e) {
            System.out.println("Menu Client exception: " + e);
        }
    }

    /*public static void main(String[] args) {
        setMenuInterface(service, 8000);
        launch();
    }*/

    public static MenuInterface service;
    public static void setMenuInterface(MenuInterface service, int port) {
        try {
            Client.service = (MenuInterface) Naming.lookup("rmi://localhost:"+port+"/jeux");
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            System.out.println("Client erreur : " + e);
        }
    }

    private static final int port = 8000; //port (global)

    @Override
    // En langage Java, le mot-clé final indique qu'un élément ne peut être changé dans la suite du programme.
    // Il peut s'appliquer aux méthodes et attributs d'une classe et à la classe elle-même.
    // Aussi, il peut s'appliquer sur les paramètres d'une méthode et sur les variables locales
    public void start(final Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
}