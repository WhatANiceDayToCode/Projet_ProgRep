package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import serveur.InterfaceRMI.PenduInterface;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class PenduController {
    // Définition des boutons
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
    // Définition des labels
    @FXML
    private Label lblChancesRestantes;
    @FXML
    private Label lblLettreDejaSaisie;
    @FXML
    private Label lblMot;
    @FXML
    private ImageView imageViewPendu;


    /* Définition des onAction pour chaque bouton
     * Ici, il s'agit de désactiver le bouton une fois celui-ci cliqué
     * Notons toutefois que cette solution n'est pas la plus optimale
     */
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

    // Déclarations complémentaires nécessaires pour la suite
    private int port = 8001;
    private String mot;
    private int nbChancesRestantes;
    private PenduInterface pendu;
    private char[] lettres = new char[26];

    public void initialize() {
        try {
            pendu = (PenduInterface) Naming.lookup("rmi://localhost:" + port + "/pendu");
            // on attribue un nombre de chances, ici, 8
            this.nbChancesRestantes = 8;
            // Ensuite, on indique à l'utilisateur son nombre de chances pour deviner le mot
            this.lblChancesRestantes.setText("Il vous reste " + nbChancesRestantes + " chances restantes");
            this.lblLettreDejaSaisie.setText("Ce champs est inutile");
            this.lblMot.setText("Mot à deviner");
            Image pendu8 = new Image("pendu/8.jpg");
            imageViewPendu.setImage(pendu8);
            //this.mot = penduInterface.motAleatoire();
            //this.lblPendu.setText(penduInterface.changeMot(this.mot, this.lettres));
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

    public void actualiseMot(ActionEvent event) throws RemoteException {
        String source = ((Button) event.getSource()).getId();
        char lettre = '0';
        switch (source) {
            case "a":
                lettre = 'a';
                break;
            case "b":
                lettre = 'b';
                break;
            case "c":
                lettre = 'c';
                break;
            case "d":
                lettre = 'd';
                break;
            case "e":
                lettre = 'e';
                break;
            case "f":
                lettre = 'f';
                break;
            case "g":
                lettre = 'g';
                break;
            case "h":
                lettre = 'h';
                break;
            case "i":
                lettre = 'i';
                break;
            case "j":
                lettre = 'j';
                break;
            case "k":
                lettre = 'k';
                break;
            case "l":
                lettre = 'l';
                break;
            case "m":
                lettre = 'm';
                break;
            case "n":
                lettre = 'n';
                break;
            case "o":
                lettre = 'o';
                break;
            case "p":
                lettre = 'p';
                break;
            case "q":
                lettre = 'q';
                break;
            case "r":
                lettre = 'r';
                break;
            case "s":
                lettre = 's';
                break;
            case "t":
                lettre = 't';
                break;
            case "u":
                lettre = 'u';
                break;
            case "v":
                lettre = 'v';
                break;
            case "w":
                lettre = 'w';
                break;
            case "x":
                lettre = 'x';
                break;
            case "y":
                lettre = 'y';
                break;
            case "z":
                lettre = 'z';
                break;
            default:
                lettre = '0';
                break;
        }
    }
}
        /*if(lettre != '0')

    {
        if (!pendu.contientChar(lettres, lettre)) {
            this.lettres = pendu.ajouterChar(this.lettres, lettre);
            if (!pendu.contientChar(mot.toCharArray(), lettre)) {
                nbChancesRestantes--;
                switch (nbChancesRestantes) {
                    case 7:
                        Image pendu8 = new Image("vue/poisson/8.jpg");
                        imageViewPendu.setImage(pendu8);
                        break;
                    case 6:
                        Image pendu7 = new Image("vue/poisson/7.jpg");
                        imageViewPendu.setImage(pendu7);
                        break;
                    case 5:
                        Image pendu6 = new Image("vue/poisson/6.jpg");
                        imageViewPendu.setImage(pendu6);
                        break;
                    case 4:
                        Image pendu5 = new Image("vue/poisson/5.jpg");
                        imageViewPendu.setImage(pendu5);
                        break;
                    case 3:
                        Image pendu3 = new Image("vue/poisson/4.jpg");
                        imageViewPendu.setImage(pendu3);
                        break;
                    case 2:
                        Image pendu2 = new Image("vue/poisson/3.jpg");
                        imageViewPendu.setImage(pendu2);
                        break;
                    case 1:
                        Image pendu1 = new Image("vue/poisson/2.jpg");
                        imageViewPendu.setImage(pendu1);
                        break;
                    case 0:
                        Image pendu0 = new Image("vue/poisson/1.jpg");
                        imageViewPendu.setImage(pendu0);
                        break;
                }
                this.lblChancesRestantes.setText("Chances restantes : " + nbChancesRestantes);
            }
            //this.motAleatoire.setText(pendu.changeMot(mot, lettres));
        }
    }
            /*if(nbChance == 0){
                this.motAleatoire.setText("Perdu! Le mot était " + this.mot);
                this.motAleatoire.setTextFill(Color.RED);
            } else if(!this.motAleatoire.getText().contains("_")){
                this.motAleatoire.setText("Gagné! Le mot était " + this.mot);
                this.motAleatoire.setTextFill(Color.GREEN);
            }
        }
    }
}*/

    /*public void recommencerPartie() throws RemoteException {
        this.mot = penduInterface.motAleatoire();
        this.nbChancesRestantes = 8;
        this.lettres = new char[26];
        this.lblPendu.setText(penduInterface.changeMot(this.mot, this.lettres));
        this.lblPendu.setTextFill(Color.BLACK);
        this.lblChancesRestantes.setText("Chances restantes : " + this.nbChancesRestantes);
        //Image pendu0 = new Image("vue/icones/pendu8.jpg");
        //image_pendu.setImage(pendu0);
    }
}*/