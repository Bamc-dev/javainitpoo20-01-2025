package org.example;

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


    }
}
