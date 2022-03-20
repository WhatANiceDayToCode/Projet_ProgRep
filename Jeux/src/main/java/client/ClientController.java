package client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
    void onActionbtnAllumettes(ActionEvent event) {
        System.out.println("Début du jeu des Allumettes");
    }

    @FXML
    void onActionbtnPendu(ActionEvent event) {
        System.out.println("Début du jeu du Pendu");
    }

}e