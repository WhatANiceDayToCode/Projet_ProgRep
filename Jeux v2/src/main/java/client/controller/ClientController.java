package client.controller;

import client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.Naming;

public class ClientController {

    @FXML
    private Button btnAllumettes;

    @FXML
    private Button btnMorpion;

    @FXML
    private Button btnPendu;

    @FXML
    void onActionbtnMorpion(ActionEvent even) throws IOException {
        System.out.println("Début du jeu du Morpion");

        Stage stage = (Stage) btnMorpion.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/Morpion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        /*FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/Morpion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);*/
        stage.setTitle("Jeu du Morpion");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }


    private int port = 8001;
    /*
    * Au clic sur le bouton du pendu, on indique dans la console le début (titre indicatif)
    * Ensuite, on recherche l'objet /pendu dans le registre du serveur (naming.lookup)
    * Si ok on affiche la fenêtre, et on empêche l'utilisateur de changer la taille de la fenêtre
    * Sinon on retourne l'erreur / exception
     */
    @FXML
    void onActionbtnPendu(ActionEvent even) throws Exception {
        System.out.println("Début du jeu du Pendu");
        try {
            Naming.lookup("rmi://localhost:"+ port +"/pendu");
            //PenduInterface pendu = (PenduInterface) Naming.lookup("rmi://localhost:8001"+ "/Pendu");
            Stage stage = (Stage) btnPendu.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/pendu/Pendu.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Jeu du Pendu");
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
        } catch (Exception e) {
            System.out.println("ClientController : " + e);
        }
    }

    @FXML
    void onActionbtnAllumettes(ActionEvent even) throws Exception {
        System.out.println("Début du jeu des Allumettes");
        Stage stage = (Stage) btnAllumettes.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/Nim.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Jeu des Allumettes");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}