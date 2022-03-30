package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NimController implements Initializable {

    @FXML
    private Button btnRetour;

    @FXML
    private Label lblAllumette;

    @FXML
    private Button oneBtn;

    @FXML
    private Button threeBtn;

    @FXML
    private Button twoBtn;

    @FXML
    private Label lblNumJoueur;


    int nbAllumettes ;

    int numJoueur ;

    @FXML
    void btnNumberOnClick(ActionEvent event) {
        Button btnClicked=((Button)event.getSource());
        int numberReduced= Integer.parseInt(btnClicked.getText());

        nbAllumettes-= numberReduced;
        lblAllumette.setText(creerStringAllumette(nbAllumettes));

        if (nbAllumettes <=0){
            switchPlayer();
            lblAllumette.setText("victoire du joueur " + numJoueur);
            oneBtn.setDisable(true);
            twoBtn.setDisable(true);
            threeBtn.setDisable(true);

            switchPlayer();

        }

        switchPlayer();
        lblNumJoueur.setText(String.valueOf(numJoueur));

    }

    // Lorsque le bouton retour est pressé, on retourne au menu
    public void onActionBtnRetour(ActionEvent actionEvent) throws IOException {
        System.out.println("Retour Menu");
        Stage stage = (Stage) btnRetour.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nbAllumettes = 15;
        numJoueur = 1;
        lblAllumette.setText(creerStringAllumette(nbAllumettes));

    }

    //creer le nombre d'allumette
    public String creerStringAllumette(int nbAllumette){
        String stringAllumette = "";
        for (int i = 0; i < nbAllumette; i++) {
            stringAllumette += " | ";
        }
        return stringAllumette;
    }
    public void switchPlayer(){
        numJoueur=numJoueur%2+1;
    }
}
