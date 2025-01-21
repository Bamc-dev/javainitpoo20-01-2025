package org.example.javabase;
import java.util.ArrayList;

/*
Les tableaux dynamique (les collections) permet de créer des tableaux qu'on pourra modifier facilement
C'est à dire la taille du tableau augmenter ou diminuer

Ces tableaux ne peuvent contenir que des types complexes.

package java.util -> ArrayList
 */


public class DynamicArrays {
    public static void main(String[] args) {
        //Généricité
        ArrayList<Integer> listInt = new ArrayList<Integer>();

        System.out.println(listInt.size());

        listInt.add(54);
        listInt.add(175);
        listInt.add(300);

        System.out.println("------- Boucle For ---------");
        for(int i = 0; i<listInt.size();i++)
        {
            System.out.print(listInt.get(i)+ " ");
        }
        System.out.println("\n-------- Boucle Foreach -------");
        for(Integer item : listInt)
        {
            System.out.print(item + " ");
        }
        System.out.println("\n----- Ajout --------");
        listInt.add(1, 19);
        System.out.println("\n-------- Boucle Foreach -------");
        for(Integer item : listInt)
        {
            System.out.print(item + " ");
        }
        System.out.println("---- Suppression ----");
        // Ici on donne l'index pour supprimer
        // Plus tard, nous pouvons directement utilisé les objets
        listInt.remove(1);
        for(Integer item : listInt)
        {
            System.out.print(item + " ");
        }

        //Renvoie un booleen pour savoir la présence de la donnée dans la liste
        if(listInt.contains(19))
        {
            System.out.println("La donnée existe dans le tableau");
        }
        else
        {
            System.out.println("La donnée n'existe pas dans le tableau");
        }

        //Affiche tout les éléments dans la liste
        listInt.forEach(System.out::println);

        //Cela revient à faire
        listInt.forEach(num -> System.out.println(num));
    }
}
