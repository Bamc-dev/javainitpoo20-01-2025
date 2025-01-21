package org.example.exos.correction;

import java.util.Random;
import java.util.Scanner;

/**
 *
 */
public class ChiFouMi {

    // Ces commentaires, sont sur une seule ligne

    /*
    Voici un commentaire sur plusieurs
    ligne
     */

    public static void main(String[] args) {
        startGame();
    }

    //JavaDocs
    /**
     * Voici ma fonction checkWin, elle permet de vérifier si l'utilisateur à gagner
     * @param userSymbol Le symbole choisi par le user
     * @param generatedSymbol Le symbole généré par l'ordinateur
     * @return La valeur est vrai  seuelement si l'utilisateur gagne
     */
    public static boolean checkWin(String userSymbol, String generatedSymbol)
    {
        if(userSymbol.equals("Pierre") && generatedSymbol.equals("Ciseaux"))
        {
            return true; // On return true uniquement si userSymbol = Pierre et generatedSymbol egal à Ciseaux
        }
        else if (userSymbol.equals("Ciseaux") && generatedSymbol.equals("Papier"))
        {
            return true;
        }else if (userSymbol.equals("Papier") && generatedSymbol.equals("Pierre"))
        {
            return true;
        }
        return false;
    }

    public static String generateSymbol()
    {
        Random random = new Random();
        switch (random.nextInt(1,3))
        {
            case 1:
                return "Pierre";
            case 2:
                return "Ciseaux";
            default:
                return "Papier";
        }
    }

    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrez un symbole (Papier, Feuille, Ciseaux): ");
        String userSymbol = scanner.nextLine();
        String generatedSymbol = generateSymbol();
        System.out.println("Symbole utilisateur : "+userSymbol);
        System.out.println("Symbole généré : "+generatedSymbol);
        if (generatedSymbol.equals(userSymbol))
        {
            System.out.println("Egalité !");
        }
        else if(checkWin(userSymbol, generatedSymbol))
        {
            System.out.println("Bravo, vous avez gagner !");
        }else
        {
            System.out.println("Perdu !");
        }
    }
}
