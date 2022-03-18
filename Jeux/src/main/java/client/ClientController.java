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
        System.out.println("début du jeu du morpion");
    }

}