package client.controller;

import client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import serveur.InterfaceRMI.PenduInterface;
import java.io.IOException;
import java.rmi.Naming;

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
    private Label lblMot;
    @FXML
    private ImageView imageViewPendu;


    /*
    * Définition des onAction pour chaque bouton
    * Ici, il s'agit de désactiver le bouton une fois celui-ci cliqué
    * Notons toutefois que cette solution n'est pas la plus optimale
    * Nous avons donc changé cette façon de faire et laissé ici à titre indicatif
     */
    /*@FXML
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
    */

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
    final int port = 8001;
    private String mot;
    private int nbChancesRestantes;
    private PenduInterface pendu;
    private char[] lettres = new char[26];

    public void initialize() {
        try {
            /* La méthode lookup() va rechercher l'objet dans le registre du serveur et retourner un objet stub.
            * L'objet retourné est de la classe Remote
            * (cette classe est la classe mère de tous les objets distants).
            */
            pendu = (PenduInterface) Naming.lookup("rmi://localhost:" + port + "/pendu");
            // on attribue un nombre de chances, ici, 8
            this.nbChancesRestantes = 8;
            // Ensuite, on indique à l'utilisateur son nombre de chances pour deviner le mot
            this.lblChancesRestantes.setText("Il vous reste " + nbChancesRestantes + " chances restantes");
            // ce champ, il sert à rien pour le moment alors je l'initialise à vide
            // this.lblLettreDejaSaisie.setText("");
            this.mot = pendu.motAleatoire();
            System.out.println(mot);
            this.lblMot.setText(pendu.changeMot(this.mot, this.lettres));
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

    public void verrouillerLettres() {
        a.setDisable(true);
        b.setDisable(true);
        c.setDisable(true);
        d.setDisable(true);
        e.setDisable(true);
        f.setDisable(true);
        g.setDisable(true);
        h.setDisable(true);
        i.setDisable(true);
        j.setDisable(true);
        k.setDisable(true);
        l.setDisable(true);
        m.setDisable(true);
        n.setDisable(true);
        o.setDisable(true);
        p.setDisable(true);
        q.setDisable(true);
        r.setDisable(true);
        s.setDisable(true);
        t.setDisable(true);
        u.setDisable(true);
        v.setDisable(true);
        w.setDisable(true);
        x.setDisable(true);
        y.setDisable(true);
        z.setDisable(true);
    }

    /*
    * Lors du clic sur un bouton du "clavier" affiché à l'écran, on récupère la source de l'évènement
    * Puis, selon le bouton pressé, on récupère son id
    * On désactive le bouton de la lettre pressée grâce à celui-ci
     */

    public void changeMot(ActionEvent event) throws IOException {

        String source = ((Button) event.getSource()).getId();
        char lettre = '0';
        switch(source) {
            case "a":
                lettre = 'a';
                a.setDisable(true);
                break;
            case "b":
                lettre = 'b';
                b.setDisable(true);
                break;
            case "c":
                lettre = 'c';
                c.setDisable(true);
                break;
            case "d":
                lettre = 'd';
                d.setDisable(true);
                break;
            case "e":
                lettre = 'e';
                e.setDisable(true);
                break;
            case "f":
                lettre = 'f';
                f.setDisable(true);
                break;
            case "g":
                lettre = 'g';
                g.setDisable(true);
                break;
            case "h":
                lettre = 'h';
                h.setDisable(true);
                break;
            case "i":
                lettre = 'i';
                i.setDisable(true);
                break;
            case "j":
                lettre = 'j';
                j.setDisable(true);
                break;
            case "k":
                lettre = 'k';
                k.setDisable(true);
                break;
            case "l":
                lettre = 'l';
                l.setDisable(true);
                break;
            case "m":
                lettre = 'm';
                m.setDisable(true);
                break;
            case "n":
                lettre = 'n';
                n.setDisable(true);
                break;
            case "o":
                lettre = 'o';
                o.setDisable(true);
                break;
            case "p":
                lettre = 'p';
                p.setDisable(true);
                break;
            case "q":
                lettre = 'q';
                q.setDisable(true);
                break;
            case "r":
                lettre = 'r';
                r.setDisable(true);
                break;
            case "s":
                lettre = 's';
                s.setDisable(true);
                break;
            case "t":
                lettre = 't';
                t.setDisable(true);
                break;
            case "u":
                lettre = 'u';
                u.setDisable(true);
                break;
            case "v":
                lettre = 'v';
                v.setDisable(true);
                break;
            case "w":
                lettre = 'w';
                w.setDisable(true);
                break;
            case "x":
                lettre = 'x';
                x.setDisable(true);
                break;
            case "y":
                lettre = 'y';
                y.setDisable(true);
                break;
            case "z":
                lettre = 'z';
                z.setDisable(true);
                break;
            default:
                lettre = '0';
                break;
        }

        /*
        * Si la lettre n'est pas 0 :
        * (ce qui signifie qu'un caractère correspond aux lettres de l'alphabet)
        * On vérifie que le mot contient le caractère
        * Et on ajoute ce caractère au tableau de lettres : lettres[]
        * Si le mot ne contient pas le caractère entré, on retire une chance
        * Après l'affichage des différentes images, on affiche le nombre de chances restantes à l'écran,
        * ainsi que le mot mis à jour
         */

        if(lettre != '0'){
            if(pendu.contientCaractere(lettres, lettre)) {
                this.lettres = pendu.ajouterCaractere(this.lettres, lettre);
                if (pendu.contientCaractere(mot.toCharArray(), lettre)) {
                    nbChancesRestantes--;
                    switch (nbChancesRestantes) {

                         /*
                         * Selon le nombre de chances restantes, on affiche l'image correspondante
                         * Jusqu'à ce que celui-ci les aies toutes épuisées
                         * (Les images sont sous forme de lien : les chemins ne fonctionnant pas...)
                          */

                        case 7:
                            Image pendu7 = new Image("https://i.imgur.com/zJf0at5.jpg");
                            imageViewPendu.setImage(pendu7);
                            break;
                        case 6:
                            Image pendu6 = new Image("https://i.imgur.com/Dmen3QE.jpg");
                            imageViewPendu.setImage(pendu6);
                            break;
                        case 5:
                            Image pendu5 = new Image("https://i.imgur.com/LkFiZln.jpg");
                            imageViewPendu.setImage(pendu5);
                            break;
                        case 4:
                            Image pendu4 = new Image("https://i.imgur.com/Ld0VSpH.jpg");
                            imageViewPendu.setImage(pendu4);
                            break;
                        case 3:
                            Image pendu3 = new Image("https://i.imgur.com/NilIn3L.jpg");
                            imageViewPendu.setImage(pendu3);
                            break;
                        case 2:
                            Image pendu2 = new Image("https://i.imgur.com/Ny8lc69.jpg");
                            imageViewPendu.setImage(pendu2);
                            break;
                        case 1:
                            Image pendu1 = new Image("https://i.imgur.com/itr0yoX.jpg");
                            imageViewPendu.setImage(pendu1);
                            break;
                        case 0:
                            Image pendu0 = new Image("https://i.imgur.com/bwSpOJq.jpg");
                            imageViewPendu.setImage(pendu0);
                            break;
                    }
                    this.lblChancesRestantes.setText("Chances restantes : " + nbChancesRestantes);
                }
                this.lblMot.setText(pendu.changeMot(mot, lettres));
            }

            /*
            * Si l'utilisateur a utilisé toutes ses chances (8)
            * > et qu'il n'a pas trouvé le mot :
            * Alors, on affiche le mot en rouge
            * > s'il a trouvé le mot
            * On affiche celui-ci en vert
            * On verrouille toutes les touches car fin de partie
            * Et on affiche l'image du poisson pouce en l'air
             */

            if(nbChancesRestantes == 0) {
                this.lblMot.setText(this.mot);
                this.lblMot.setTextFill(Color.RED);
                verrouillerLettres();
            } else if(!this.lblMot.getText().contains("_")) {
                this.lblMot.setText(this.mot);
                this.lblMot.setTextFill(Color.GREEN);
                Image gagne = new Image("https://i.imgur.com/bJTwFaP.jpg");
                imageViewPendu.setImage(gagne);
                verrouillerLettres();
            }
        }
    }
}
