package org.example.javabase;

import java.util.Scanner;

public class CastingAndWrappers {
    public static void main(String[] args) {

        int intNumber = 100;
        long myLong = intNumber;
        System.out.println("Int to long " + myLong);

        float floatNumber = intNumber; // Un int peut être converti en float automatiquement
        System.out.println("Int to float "+floatNumber);

        double doubleNumber = 99.99;
        int otherInt = (int) doubleNumber; // Cast explicite
        // int otherIntOfDouble = doubleNumber; Ne marche pas car il y a une perte de données, ont doit lui dire que l'on peut "perdre de la donnée"
        System.out.println("Double to int " + otherInt);

        long largeNumber = 1_000_000_000_000L;
        int longToInt = (int) largeNumber;
        System.out.println("Long to int "+ longToInt);

        char letter = 'A';
        int myValue = (int) letter;
        System.out.println("Char to int (ASCII) : "+myValue);

        int charToInt = 66;
        char charValue = (char) charToInt;
        System.out.println("Int to char (ASCII): "+charValue);

        // ------------------------------------------------------
        //Wrappers
        System.out.println("-------------------WRAPPERS-----------------------");

        //Autoboxing : Conversion automatique de types primitifs en objets
        Integer boxedInt = 15;
        Double boxedDouble = doubleNumber;
        System.out.println("Boxed Integer : "+boxedInt);
        System.out.println("Boxed Double " + boxedDouble);

        //Unboxing : Conversion automatique d'objets en types primitifs
        int unboxedInt = boxedInt;
        double unboxedDouble = boxedDouble;
        System.out.println("Unboxed int : "+unboxedInt);
        System.out.println("Unboxed double "+unboxedDouble);

        String numberString = "42";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("Parsed Integer "+parsedInt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        // int userNumber = Integer.parseInt(scanner.next()); // scanner.nextInt() est equivalent à cette ligne
        //System.out.println(userNumber);

        double parsedDouble = Double.parseDouble("456.78"); // scanner.nexDouble()
        System.out.println("Parsed Double "+parsedDouble);

        System.out.println("Integer Max : "+Integer.MAX_VALUE);
        System.out.println("Integer Min : "+Integer.MIN_VALUE);
        System.out.println("Double Max : "+Double.MAX_VALUE);
        System.out.println("Double Min : "+Double.MIN_VALUE);

        // Vérification la valeur max avec autoboxing
        Integer maxInt = Integer.MAX_VALUE;
        System.out.println("Max Integer using wrapper "+maxInt);

        try{
            int invalidParse = Integer.parseInt("abc"); // ici cela nous lève une exception
            System.out.println("Parsed invalid string : "+invalidParse); // Interruption du bloque, la suite du programme est stopé
        }catch (NumberFormatException e)
        {
            System.out.println("Erreur : conversion impossible"); // On passe par ce bloque
        }

    }

}
