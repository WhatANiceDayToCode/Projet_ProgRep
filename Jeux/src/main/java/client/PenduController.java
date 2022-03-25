package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import serveur.InterfaceRMI.PenduInterface;

import java.io.IOException;
import java.rmi.Naming;

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
    // Définition des labels
    @FXML private Label lblChancesRestantes;
    @FXML private Label lblLettreDejaSaisie;
    @FXML private Label lblPendu;
    @FXML private ImageView imageViewPendu;

    // Définition des onAction pour chaque bouton
    @FXML
    void onActionA(ActionEvent event) {
        System.out.println("A");
        // = System.out.print(a.getText());
        a.setDisable(true);
    }

    @FXML
    void onActionB(ActionEvent event) {
        System.out.println("B");
        b.setDisable(true);
    }

    @FXML
    void onActionC(ActionEvent event) {
        System.out.println("C");
        c.setDisable(true);
    }

    @FXML
    void onActionD(ActionEvent event) {
        System.out.println("D");
        d.setDisable(true);
    }

    @FXML
    void onActionE(ActionEvent event) {
        System.out.println("E");
        e.setDisable(true);
    }

    @FXML
    void onActionF(ActionEvent event) {
        System.out.println("F");
        f.setDisable(true);
    }

    @FXML
    void onActionG(ActionEvent event) {
        System.out.println("G");
        g.setDisable(true);
    }

    @FXML
    void onActionH(ActionEvent event) {
        System.out.println("H");
        h.setDisable(true);
    }

    @FXML
    void onActionI(ActionEvent event) {
        System.out.println("I");
        i.setDisable(true);
    }

    @FXML
    void onActionJ(ActionEvent event) {
        System.out.println("J");
        j.setDisable(true);
    }

    @FXML
    void onActionK(ActionEvent event) {
        System.out.println("K");
        k.setDisable(true);
    }

    @FXML
    void onActionL(ActionEvent event) {
        System.out.println("L");
        l.setDisable(true);
    }

    @FXML
    void onActionM(ActionEvent event) {
        System.out.println("M");
        m.setDisable(true);
    }

    @FXML
    void onActionN(ActionEvent event) {
        System.out.println("N");
        n.setDisable(true);
    }

    @FXML
    void onActionO(ActionEvent event) {
        System.out.println("O");
        o.setDisable(true);
    }

    @FXML
    void onActionP(ActionEvent event) {
        System.out.println("P");
        p.setDisable(true);
    }

    @FXML
    void onActionQ(ActionEvent event) {
        System.out.println("Q");
        q.setDisable(true);
    }

    @FXML
    void onActionR(ActionEvent event) {
        System.out.println("R");
        r.setDisable(true);
    }

    @FXML
    void onActionS(ActionEvent event) {
        System.out.println("S");
        s.setDisable(true);
    }

    @FXML
    void onActionT(ActionEvent event) {
        System.out.println("T");
        t.setDisable(true);
    }

    @FXML
    void onActionU(ActionEvent event) {
        System.out.println("U");
        u.setDisable(true);
    }

    @FXML
    void onActionV(ActionEvent event) {
        System.out.println("V");
        v.setDisable(true);
    }

    @FXML
    void onActionW(ActionEvent event) {
        System.out.println("W");
        w.setDisable(true);
    }

    @FXML
    void onActionX(ActionEvent event) {
        System.out.println("X");
        x.setDisable(true);
    }

    @FXML
    void onActionY(ActionEvent event) {
        System.out.println("Y");
        y.setDisable(true);
    }

    @FXML
    void onActionZ(ActionEvent event) {
        System.out.println("Z");
        z.setDisable(true);
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

    private int port = 8001;
    private int nbChancesRestantes;
    private PenduInterface penduInterface;
    public void initialize() {
        try {
            this.nbChancesRestantes = 8;
            this.lblChancesRestantes.setText("Il vous reste " + nbChancesRestantes + " chances restantes");
            penduInterface = (PenduInterface) Naming.lookup("rmi://localhost:"+ port +"/pendu");
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}