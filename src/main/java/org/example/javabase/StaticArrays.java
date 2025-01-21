package org.example.javabase;

/*
Tableau : Un ensemble d'éléments typés
Ici, nous verrons les tableaux statiques. Donc on ne peut pas modifier sa taille.

Utiliser un tableau statique, c'est si uniquement la taille des données est connue et ne change pas.
Pour les tableaux dynamiques, c'est pour données à taille variable.
Les tableaux dynamique offrent des méthodes pratiques (add, remove, sort et des streams)
Ce qui n'est pas le cas avec les tableaux statique
 */
public class StaticArrays {
    public static void main(String[] args) {
        //1 Dimension --> [x, y, z]


        //1 - Si on connait les differents elements du tableau
        double[] notes = {12, 7, 16.3, 6.7};

        //Un tableau commence à l'indice 0
        System.out.println("Premier element du tableau : "+notes[0]); //12
        System.out.println("Deuxième element du tableau : "+notes[1]); //7

        //System.out.println(notes[4]);

        System.out.println("Taille du tableau : "+notes.length);//Return la taille du tableau
        double[] prix = new double[4]; // Tableau on déclare un tableau, et on l'instancie, avec une taille de 10

        System.out.println(prix[2]);

        //Boucles

        System.out.println("Les boucles");

        System.out.println("--------- For --------------");
        //Boucles for
        for(byte i = 0; i<notes.length; i++)
        {
            System.out.println(i + " : "+notes[i]);
        }
        System.out.println("--------- Foreach ------------");
        //Boucles Foreach
        for (double note :
                notes) {
            System.out.println(note);
        }

        System.out.println("------------- Boucle For vs Boucle Foreach -------------");
        //Modification avec la boucle for
        System.out.println("Modification avec For");
        for (int i = 0; i < prix.length; i++) {
            prix[i] = 47.2;
            System.out.println(prix[i]);
        }

        System.out.println("Modification avec forEach");
        //Modification avec la boucle forEach
        for (double note : notes) {
            note *= 2;
            System.out.println(note);
        }

        System.out.println("Affichage de notes");
        //Pas enregistrer lors de l'appel de nouveau pour le tableau
        for (double note: notes) {
            System.out.println(note);
        }

        //Foreach est bon pour l'affichage, mais inutile par la modification des données
        //For peut modifier les données
        System.out.println("-------- While ------------");
        int i = 0;
        while (i<notes.length) //Tant que la condition est vrai, on éxécute le code
        {
            System.out.println(notes[i]);
            i++;
        }

        System.out.println("--------- Do While ----------");
        int f = 0;
        do {
            System.out.println(notes[f]);
            f++;
        }while (f<notes.length);

        System.out.println("---------------- Tableau à deux dimensions --------------");
        int[][] scores = {
                {5, 25, 78, 24}, //row1 (0)
                {80, 6, 18, 74}, //row2 (1)
                {37, 65, 44} //row3 (2)
        };
        System.out.println("Score[1][2] : " + scores[1][2]);

        //[0, 0] = 5
        //[2, 1] = 65
        //[1, 3] = 74

        for (int j = 0; j < scores.length; j++) {
            System.out.print("[");
            for (int k = 0; k < scores[j].length; k++) {
                System.out.print(scores[j][k]);
                if(k < scores[j].length - 1)
                {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        System.out.println("---------- Utilisation Foreach -----------");
        for(int[] ligne: scores)
        {
            System.out.print("[");
            int count = 0; // Compteur pour savoir si c'est le dernier element
            for(int col: ligne)
            {
                System.out.print(col);
                if(count<ligne.length - 1)
                {
                    System.out.print(", ");
                }
                count++;
            }
            System.out.println("]");

        }
    }
}
