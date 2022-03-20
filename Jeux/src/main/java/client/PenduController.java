package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class PenduController {

    // Définition des boutons
    @FXML private Button a;
    @FXML private Button b;
    @FXML private Button btnRetour;
    @FXML private Button c;
    @FXML private Button d;
    @FXML private Button e;
    @FXML private Button f;
    @FXML private Button g;
    @FXML private Button h;
    @FXML private Button i;
    @FXML private Button j;
    @FXML private Button k;
    @FXML private Button l;
    @FXML private Label lblPendu;
    @FXML private Button m;
    @FXML private Button n;
    @FXML private Button o;
    @FXML private Button p;
    @FXML private Button q;
    @FXML private Button r;
    @FXML private Button s;
    @FXML private Button t;
    @FXML private Button u;
    @FXML private Button v;
    @FXML private Button w;
    @FXML private Button x;
    @FXML private Button y;
    @FXML private Button z;

    // Définition des onAction pour chaque bouton
    @FXML
    void onActionA(ActionEvent event) {
        System.out.println("A");
    }

    @FXML
    void onActionB(ActionEvent event) {
        System.out.println("B");
    }

    @FXML
    void onActionC(ActionEvent event) {
        System.out.println("C");
    }

    @FXML
    void onActionD(ActionEvent event) {
        System.out.println("D");
    }

    @FXML
    void onActionE(ActionEvent event) {
        System.out.println("E");
    }

    @FXML
    void onActionF(ActionEvent event) {
        System.out.println("F");
    }

    @FXML
    void onActionG(ActionEvent event) {
        System.out.println("G");
    }

    @FXML
    void onActionH(ActionEvent event) {
        System.out.println("H");
    }

    @FXML
    void onActionI(ActionEvent event) {
        System.out.println("I");
    }

    @FXML
    void onActionJ(ActionEvent event) {
        System.out.println("J");
    }

    @FXML
    void onActionK(ActionEvent event) {
        System.out.println("K");
    }

    @FXML
    void onActionL(ActionEvent event) {
        System.out.println("L");
    }

    @FXML
    void onActionM(ActionEvent event) {
        System.out.println("M");
    }

    @FXML
    void onActionN(ActionEvent event) {
        System.out.println("N");
    }

    @FXML
    void onActionO(ActionEvent event) {
        System.out.println("O");
    }

    @FXML
    void onActionP(ActionEvent event) {
        System.out.println("P");
    }

    @FXML
    void onActionQ(ActionEvent event) {
        System.out.println("Q");
    }

    @FXML
    void onActionR(ActionEvent event) {
        System.out.println("R");
    }

    @FXML
    void onActionS(ActionEvent event) {
        System.out.println("S");
    }

    @FXML
    void onActionT(ActionEvent event) {
        System.out.println("T");
    }

    @FXML
    void onActionU(ActionEvent event) {
        System.out.println("U");
    }

    @FXML
    void onActionV(ActionEvent event) {
        System.out.println("V");
    }

    @FXML
    void onActionW(ActionEvent event) {
        System.out.println("W");
    }

    @FXML
    void onActionX(ActionEvent event) {
        System.out.println("X");
    }

    @FXML
    void onActionY(ActionEvent event) {
        System.out.println("Y");
    }

    @FXML
    void onActionZ(ActionEvent event) {
        System.out.println("Z");
    }

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