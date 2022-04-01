/*
    declarer un tableau de 9 cases avec la valeur NULL ou ? dans toutes les cases
    => a chaque clic sur un bouton, assigner la valeure "x" ou "o" dans la case du tableau correspondant puis apeller la fonction verifierSiJeuTermine()


    function verifierSiJeuTermine(){

        If (concatener les valeures de toutes les cases de la meme colone, ou de la meme ligne, ou de la meme diagonale === "xxx"){
            resultat = "joueur 1 gagne";
        }
        else if (concatener les valeures de toutes les cases de la meme colone, ou de la meme ligne, ou de la meme diagonale === "ooo")
            resultat = "joueur 1 perd";
        }
        else{
            if(toutes les cases du tableau sont remplies){
                resultat = égalité;
            }
            else{
                resultat = continuer;
            }
        }
    }
 */

package client.controller;

import client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;











public class MorpionController {

    public boolean monTour = true;

    public ImageView cross_A1;
    public ImageView cross_A2;
    public ImageView cross_A3;

    public ImageView cross_B1;
    public ImageView cross_B2;
    public ImageView cross_B3;

    public ImageView cross_C1;
    public ImageView cross_C2;
    public ImageView cross_C3;



    public ImageView circle_A1;
    public ImageView circle_A2;
    public ImageView circle_A3;

    public ImageView circle_B1;
    public ImageView circle_B2;
    public ImageView circle_B3;

    public ImageView circle_C1;
    public ImageView circle_C2;
    public ImageView circle_C3;



    public int A1 = 2;
    public int A2 = 2;
    public int A3 = 2;

    public int B1 = 2;
    public int B2 = 2;
    public int B3 = 2;

    public int C1 = 2;
    public int C2 = 2;
    public int C3 = 2;

    public String resultat = "";




    public void verifierSiJeuTermine() {

        // verification de la partie (joueur)
        // verification des colonnes
        if(A1 == 0 && A2 == 0 && A3 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        else if(B1 == 0 && B2 == 0 && B3 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        else if(C1 == 0 && C2 == 0 && C3 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        // verification des lignes
        else if(A1 == 0 && B1 == 0 && C1 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        else if(A2 == 0 && B2 == 0 && C2 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        else if(A3 == 0 && B3 == 0 && C3 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        // verification des diagonales
        else if(A1 == 0 && B2 == 0 && C3 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        else if(A3 == 0 && B2 == 0 && C1 == 0){
            resultat = "Le joueur 1 gagne !";
        }
        // verification de la partie (ordinateur)
        // verification des colonnes
        else if(A1 == 1 && A2 == 1 && A3 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        else if(B1 == 1 && B2 == 1 && B3 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        else if(C1 == 1 && C2 == 1 && C3 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        // verification des lignes
        else if(A1 == 1 && B1 == 1 && C1 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        else if(A2 == 1 && B2 == 1 && C2 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        else if(A3 == 1 && B3 == 1 && C3 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        // verification des diagonales
        else if(A1 == 1 && B2 == 1 && C3 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        else if(A3 == 1 && B2 == 1 && C1 == 1){
            resultat = "Le joueur 2 gagne !";
        }
        //sinon il faut verifier si la grille n'est pas pleine (si oui alors partie continue, sinon egalite)
        else if(A1 == 2 || B1 == 2 || C1 == 2 || A2 == 2 || B2 == 2 || C2 == 2 || A3 == 2 || B3 == 2 || C3 == 2){
            resultat = "La partie continue";
        }
        else{
            resultat = "Il y a égalité !";
        }
        System.out.println(resultat);

        if (resultat == "Le joueur 1 gagne !" || resultat == "Le joueur 2 gagne !" || resultat == "Il y a égalité !"){
            //desactive tous les boutons pour figer la grille de jeu
            btnCaseA1.setDisable(true);
            btnCaseA2.setDisable(true);
            btnCaseA3.setDisable(true);

            btnCaseB1.setDisable(true);
            btnCaseB2.setDisable(true);
            btnCaseB3.setDisable(true);

            btnCaseC1.setDisable(true);
            btnCaseC2.setDisable(true);
            btnCaseC3.setDisable(true);

            //rend visible la partie "victoire" correspondant a la fin réel de la partie
            affichageResultat.setVisible(true);
            affichageResultat.setText(resultat);
        }
    }



    // Show a Information Alert without Header Text
    private void showAlertRegleDuJeu() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Règles du jeu");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("RÈGLE DU JEU :\n" +
                "\n" +
                "Deux joueurs posent tour à tour un rond, pour l'un, une croix, pour l'autre, " +
                "dans une grille de 3 cases par 3. " +
                "Le but du jeu est d'obtenir un alignement " +
                "(en ligne, colonne ou diagonale) de ses trois signes. " +
                "Une fois posés les signes ne peuvent plus être déplacés.\n");

        alert.showAndWait();
    }

    @FXML
    private Label affichageTour;

    @FXML
    private Label affichageResultat;

    @FXML
    private Button btnAccueil;

    @FXML
    private Rectangle btnCaseA1;

    @FXML
    private Rectangle btnCaseA2;

    @FXML
    private Rectangle btnCaseA3;

    @FXML
    private Rectangle btnCaseB1;

    @FXML
    private Rectangle btnCaseB2;

    @FXML
    private Rectangle btnCaseB3;

    @FXML
    private Rectangle btnCaseC1;

    @FXML
    private Rectangle btnCaseC2;

    @FXML
    private Rectangle btnCaseC3;

    @FXML
    private Button btnReglesDuJeu;

    @FXML
    private Button btnRejouer;

    @FXML
    private MenuButton menuButtonModeDeJeu;

    @FXML
    private CheckBox caseACocher;

    @FXML
    void onActionBtnAccueil(ActionEvent event) throws IOException {
        System.out.println("Retour Menu");
        Stage stage = (Stage) btnAccueil.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    @FXML
    void onActionBtnReglesDuJeu(ActionEvent event) {
        showAlertRegleDuJeu();
    }

    @FXML
    void onActionBtnRejouer(ActionEvent event) throws IOException {
        System.out.println("Début du jeu du Morpion");

        Stage stage = (Stage) btnRejouer.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/Morpion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Jeu du Morpion");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    @FXML
    void onMouseClickedBtnCaseA1(MouseEvent event) throws IOException {

        if (monTour == true){
            cross_A1.setVisible(true);
            monTour = false;
            A1 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_A1.setVisible(true);
            monTour = true;
            A1 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseA1.setDisable(true);
        btnCaseA1.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseA2(MouseEvent event) throws IOException {
        if (monTour == true){
            cross_A2.setVisible(true);
            monTour = false;
            A2 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_A2.setVisible(true);
            monTour = true;
            A2 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseA2.setDisable(true);
        btnCaseA2.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseA3(MouseEvent event) {
        if (monTour == true){
            cross_A3.setVisible(true);
            monTour = false;
            A3 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_A3.setVisible(true);
            monTour = true;
            A3 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseA3.setDisable(true);
        btnCaseA3.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseB1(MouseEvent event) {
        if (monTour == true){
            cross_B1.setVisible(true);
            monTour = false;
            B1 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_B1.setVisible(true);
            monTour = true;
            B1 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseB1.setDisable(true);
        btnCaseB1.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseB2(MouseEvent event) {
        if (monTour == true){
            cross_B2.setVisible(true);
            monTour = false;
            B2 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_B2.setVisible(true);
            monTour = true;
            B2 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseB2.setDisable(true);
        btnCaseB2.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseB3(MouseEvent event) {
        if (monTour == true){
            cross_B3.setVisible(true);
            monTour = false;
            B3 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_B3.setVisible(true);
            monTour = true;
            B3 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseB3.setDisable(true);
        btnCaseB3.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseC1(MouseEvent event) {
        if (monTour == true){
            cross_C1.setVisible(true);
            monTour = false;
            C1 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_C1.setVisible(true);
            monTour = true;
            C1 = 1;affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseC1.setDisable(true);
        btnCaseC1.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseC2(MouseEvent event) {
        if (monTour == true){
            cross_C2.setVisible(true);
            monTour = false;
            C2 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_C2.setVisible(true);
            monTour = true;
            C2 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseC2.setDisable(true);
        btnCaseC2.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseClickedBtnCaseC3(MouseEvent event) {
        if (monTour == true){
            cross_C3.setVisible(true);
            monTour = false;
            C3 = 0;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
        else{
            circle_C3.setVisible(true);
            monTour = true;
            C3 = 1;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }

        btnCaseC3.setDisable(true);
        btnCaseC3.setVisible(false);
        caseACocher.setDisable(true);
        verifierSiJeuTermine();
    }

    @FXML
    void onMouseEnteredBtnCaseA1(MouseEvent event) throws IOException {
        //System.out.println("EnteredBtnCaseA1");
        btnCaseA1.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseA2(MouseEvent event) {
        //System.out.println("EnteredBtnCaseA2");
        btnCaseA2.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseA3(MouseEvent event) {
        //System.out.println("EnteredBtnCaseA3");
        btnCaseA3.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseB1(MouseEvent event) {
        //System.out.println("EnteredBtnCaseB1");
        btnCaseB1.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseB2(MouseEvent event) {
        //System.out.println("EnteredBtnCaseB2");
        btnCaseB2.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseB3(MouseEvent event) {
        //System.out.println("EnteredBtnCaseB3");
        btnCaseB3.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseC1(MouseEvent event) {
        //System.out.println("EnteredBtnCaseC1");
        btnCaseC1.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseC2(MouseEvent event) {
        //System.out.println("EnteredBtnCaseC2");
        btnCaseC2.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseEnteredBtnCaseC3(MouseEvent event) {
        //System.out.println("EnteredBtnCaseC3");
        btnCaseC3.setFill(Paint.valueOf("#00ffda"));

    }

    @FXML
    void onMouseExitedBtnCaseA1(MouseEvent event) {
        //System.out.println("ExitedBtnCaseA1");
        btnCaseA1.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseA2(MouseEvent event) {
        //System.out.println("ExitedBtnCaseA2");
        btnCaseA2.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseA3(MouseEvent event) {
        //System.out.println("ExitedBtnCaseA3");
        btnCaseA3.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseB1(MouseEvent event) {
        //System.out.println("ExitedBtnCaseB1");
        btnCaseB1.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseB2(MouseEvent event) {
        //System.out.println("ExitedBtnCaseB2");
        btnCaseB2.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseB3(MouseEvent event) {
        //System.out.println("ExitedBtnCaseB3");
        btnCaseB3.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseC1(MouseEvent event) {
        //System.out.println("ExitedBtnCaseC1");
        btnCaseC1.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseC2(MouseEvent event) {
        //System.out.println("ExitedBtnCaseC2");
        btnCaseC2.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onMouseExitedBtnCaseC3(MouseEvent event) {
        //System.out.println("ExitedBtnCaseC3");
        btnCaseC3.setFill(Paint.valueOf("#0084ff"));

    }

    @FXML
    void onActionMenuButtonModeDeJeu(ActionEvent event) {

    }

    public void onMouseClickedCaseACocher(MouseEvent mouseEvent) {
        if(caseACocher.isSelected() == true){
            monTour = true;
            affichageTour.setText("C'est au tour de : Joueur 1");
        }
        else{
            monTour = false;
            affichageTour.setText("C'est au tour de : Joueur 2");
        }
    }
}

