package client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

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

    @FXML
    void onActionbtnAllumettes(ActionEvent event) throws IOException {
        System.out.println("Début du jeu des Allumettes");
    }

    @FXML
    void onActionbtnPendu(ActionEvent even) throws Exception {
        System.out.println("Début du jeu du Pendu");


        Stage stage = (Stage) btnPendu.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/Pendu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Jeu du Pendu");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

}