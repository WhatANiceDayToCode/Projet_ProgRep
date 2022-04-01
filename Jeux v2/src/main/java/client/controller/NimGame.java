package client.controller;
import java.util.Scanner;

public class NimGame {

    public int fetchComputerMove(int left)
    {
        int computerTurn = (int) (Math.random()*3)+1;
        return computerTurn;
    }

    public static void main(String args[]) {
        NimGame ng = new NimGame();
        ng.play();
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vous jouez au jeu des Allumettes UWU ");
        int elementsLeft = 15;
        while (elementsLeft > 0) {
            int computerMove = fetchComputerMove(elementsLeft);
            System.out.println("L'ordi a enlevé  " + computerMove +" allumette.s");
            elementsLeft = elementsLeft - computerMove;
            String match ="";
            for (int i = elementsLeft; i > 0; i--) {

                 match = match + "|";
            }
            System.out.println(match);
            System.out.println(elementsLeft + " restante");
            System.out.println("");
            if (elementsLeft <= 0) {
                System.out.println("***********************");
                System.out.println("L'ordi a gagné!");
                System.out.println("***********************");
                return ;
            }
            System.out.println("C'est votre tour : Entrez (1,2 ou 3) ");
            int personMove = scan.nextInt();
            while (personMove != 1 && personMove != 2 && personMove !=3) {
                System.out.println("Svp choisissez un nombre entre 1 et 3 ");
                personMove = scan.nextInt();
            }
            elementsLeft = elementsLeft - personMove;
            System.out.println("After your move!! the number of elements left: "+elementsLeft);
            System.out.println("");
            if (elementsLeft <= 0) {
                System.out.println("*****************");
                System.out.println("Vous avez gagné!");
                System.out.println("*****************");
                return ;
            }
        }
    }
}