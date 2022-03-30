package client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.rmi.Naming;

public class ClientController {

    @FXML
    private Button btnAllumettes;

    @FXML
    private Button btnMorpion;

    @FXML
    private Button btnPendu;

    @FXML
    void onActionbtnMorpion(ActionEvent event) {
        System.out.println("Début du jeu du Morpion");
    }


    private int port = 8001;
    @FXML
    void onActionbtnPendu(ActionEvent even) throws Exception {
        System.out.println("Début du jeu du Pendu");
    try {
        Naming.lookup("rmi://localhost:"+ port +"/pendu");

        Stage stage = (Stage) btnPendu.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/pendu/Pendu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Jeu du Pendu");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    } catch (Exception e) {
        System.out.println("ClientController : " + e);
    }

    }
    @FXML
    void onActionbtnAllumettes(ActionEvent even) throws Exception {
        System.out.println("Début du jeu des Allumettes");


        Stage stage = (Stage) btnAllumettes.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/Nim.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Jeu des Allumettes");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}