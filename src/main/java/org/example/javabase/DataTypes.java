package org.example.javabase;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        //Déclaration et utilisation des différents types de variables
        boolean isTrue = true;
        boolean isFalse = false;

        //Cette fonction, intérragie avec le système, afin d'afficher dans la console, ce qui est passez en paramètre
        System.out.println("Ici la valeur de la variable "+isTrue);

        int number = 54;
        System.out.println("Number : "+number);

        short medium = 3200;

        //Plus utilisé en BDD
        long thatBig = 10000000000L;

        float pi = 3.14f;

        double piDouble = 3.141;

        char initial = 'B'; // Attention ne pas utiliser " pour un char mais '

        // Ici instanciation et Affectation du string
        String myString = "Hello World!";
        System.out.println(myString);

        //Utilisation de la concatenation
        String concat = "1 - " + myString + " 2 ";
        System.out.println(concat);

        System.out.println(myString.length());
        System.out.println(myString.toUpperCase());

        System.out.println("Entrez un message : ");

        // Instanciation du scanner (objet permettant de récupérer les données dans la console)
        Scanner myScanner = new Scanner(System.in);
        // Utilisation du scanner. Ici on lit la valeur nextLine() qui représente la ligne rentrez de l'utilisateur. Et on l'utilise directement dans le
        //sout afin de l'afficher
        System.out.println(myScanner.nextLine());
    }
}
