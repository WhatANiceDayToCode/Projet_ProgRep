package client;

import client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PenduController {

    @FXML
    private Button a;

    @FXML
    private Button b;

    @FXML
    private Button btnRetour;

    @FXML
    private Button c;

    @FXML
    private Button d;

    @FXML
    private Button e;

    @FXML
    private Button f;

    @FXML
    private Button g;

    @FXML
    private Button h;

    @FXML
    private Button i;

    @FXML
    private Button j;

    @FXML
    private Button k;

    @FXML
    private Button l;

    @FXML
    private Label lblPendu;

    @FXML
    private Button m;

    @FXML
    private Button n;

    @FXML
    private Button o;

    @FXML
    private Button p;

    @FXML
    private Button q;

    @FXML
    private Button r;

    @FXML
    private Button s;

    @FXML
    private Button t;

    @FXML
    private Button u;

    @FXML
    private Button v;

    @FXML
    private Button w;

    @FXML
    private Button x;

    @FXML
    private Button y;

    @FXML
    private Button z;

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

    /*@FXML
    void onActionBtnRetour(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnRetour.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }*/

}