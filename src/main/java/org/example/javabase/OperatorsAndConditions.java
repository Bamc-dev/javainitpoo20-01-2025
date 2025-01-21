package org.example.javabase;

import java.util.Scanner;

public class OperatorsAndConditions {
    public static void main(String[] args) {
        // **** OPERATORS ****

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Addition : " + (a + b)); // 13
        System.out.println("Soustraction : " + (a - b)); // 7
        System.out.println("Division : " + ((float)a / b)); // Uniquement l'entier si il n'y a pas le casting
        System.out.println("Multiplication : "+ (a * b)); // 30
        System.out.println("Modulo : " + (a % b)); // Reste de la division

        // 2. Comparaison (Valeur booleenne, donc true or false)
        System.out.println("Is a equal to b ?" + (a == b));
        System.out.println("Is a not equal to b ?" + (a != b));
        System.out.println("Is a greater than b ?" + (a > b)); // Supériorité
        System.out.println("Is a less than or equal to b ?" +( a <= b)); // A gauche  greater or less a droite toujours le égal

        // 3. Logical operators
        boolean x = true, y = false;
        System.out.println("x AND y "+ (x && y)); // Return false
        System.out.println("x OR y " + (x || y)); // Return true
        System.out.println("NOT x: " + ( !x )); //prend l'inverse de la valeur dans ce cas la ça va être false


        // 4. Bitwise Operators
        // Le binaire base de deux valeurs : 0,1
        // Pour 5 on va avoir : 0101 -> 0 x 2^3, 1 x 2^2, 0 x 2^1, 1 x 2^0 ( = 1)
        // 11111 = 31
        int c = 5, d = 7; // 5 = 0101 , 7 = 0111
        System.out.println("Bitwise AND : "+ (c & d)); // 0101 & 0111 = 0101 (5)
        System.out.println("Bitwise OR : "+ (c | d)); // 0101 | 0111 = 0111 (7)
        System.out.println("Bitwise XOR : " + (c^d)); // 0101 ^ 0111 = 0010 (2)

        // 5. Assignment Operators
        int e = 10; //Assignation avec le égal
        e += 5; //On reprend la valeur initial, on lui ajoute 5. Equivalent de e = e + 5 (Peut se faire avec + - * /) (Beaucoup présent dans les boucles)
        System.out.println("After += 5 : " + e);
        int f = 10;
        f /= 2;
        System.out.println("After /= f : "+f);

        // 6. Increment and Decrement Operators (Used in loop)
        int i = 10;
        System.out.println("Post-increment : "+(i++)); // Display d and increment (10)
        System.out.println("After : "+(i)); // 11
        System.out.println("Pre-increment "+(++i)); // Increment, after display (12)

        System.out.println("Decrement : "+(--i)); // 11


        // ------------ Conditions -----------
        int number = 20;
        //If else
        if(number > 0)
        {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is Zero");
        }

        //Exercice interval
        //Saisir = Entrée utilisateur
        //Saisir un nombre et dire s'il fait parti de l'interval -4 (exclus) et 9 (inclus) ==>
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        //int userInput = input.nextInt();
        int userInput = 5;
        if (userInput > -4 && userInput <= 9)
        {
            System.out.println(userInput+" est inclus dans l'intervalle ]-4, 9]");
        }
        else
        {
            System.out.println("Ne fait pas partie de l'intervalle");
        }

        //Switch case
        //Utilisé pour des conditions "à la carte"
        System.out.println("Numéro de jour : ");
        //int jour = input.nextInt();
        int jour = 4;
        switch (jour)
        {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Veuillez saisir le nombre de jours entre 1 et 7");
        }

        switch (jour)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Jour de travail");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Veuillez saisir le nombre de jours entre 1 et 7");

        }

        //Nouvelle syntaxe (java 14) : permet d'écrire des instructions plus compact et lisible
        switch (jour)
        {
            case 1 -> {
                System.out.println("Lundi");
                System.out.println("Debut de la semaine");
            }
            case 2 ->{
                System.out.println("Mardi");
            }
            case 3 ->{
                System.out.println("Mercredi");
            }
            case 4 ->
            {
                System.out.println("Jeudi");
            }
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Veuillez saisir le numero du jours entre 1 et 7");
        }
        switch (jour)
        {
            case 1,2,3,4,5 -> System.out.println("Jour de travail");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("\"Veuillez saisir le numero du jours entre 1 et 7\"");
        }

        //Ternaire
        int age = 19;
        String message;
        char genre = 'F';

        //Si vrai, on prend la valeur de gauche, et on affecte à message, si faux, on prend la valeur de droite
        message = (age >= 18) ? "majeur" : "mineur";

        message = (age >= 18)
                ? ((genre == 'F') ? "majeur et une femme" : "majeur et un homme")
                : ((genre == 'F') ? "mineur et une fille" : "mineur et un garçon");
        System.out.println(message);

    }
}
