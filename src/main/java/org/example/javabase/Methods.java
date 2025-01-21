package org.example.javabase;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Appel des différentes méthodes
        greet(); //Appel de méthode sans paramètres

        int sumResult = add(5,10); //Méthode avec retour dans l'affectation de variable
        System.out.println("Sum "+sumResult);

        double area = calculateCircleArea(4.5); // Méthode avec un retour en double
        System.out.println("Circle Area : "+area);

        printMessage("Hello World!");

        System.out.println("Maximum value : "+ findMax(10,5,25));

        Integer myInt = 15;
        System.out.println(myInt);
        //Appel méthode récursive
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5 : "+factorialResult);

        displayInfo("Alice");
        displayInfo("Bob", 25);
        System.out.println(displayInfo("Rayan", 19, 'M'));

    }

    //Méthode sans retour et sans paramètre
    public static void greet()
    {
        System.out.println("Hello World!");
    }
    //Méthode avec paramètres et retour d'une valeur
    public static int add(int a, int b)
    {
        return a + b;
    }

    //Méthode avec retour de type double
    public static double calculateCircleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    //Méthode avec un paramètre String qui affiche un message
    public static void printMessage(String message)
    {
        System.out.println(message);
    }

    // Méthode statique avec plusieurs paramètres qui retourne le max
    // Celle ci se nomme findMax() (Le but est de trouvé entre 3 nombres quel est le max)
    public static int findMax(int a, int b, int c)
    {
        int max = a;
        if(b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }
        return max;
    }

    // Méthode récursive (calcul de factorielle)
    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Méthodes surchargées
    //Méthodes qui à le même nom, mais pas les même paramètre.
    //La surcharge peut aussi changer le type de retour si besoin
    public static void displayInfo(String name)
    {
        System.out.println("Name : "+name);
    }

    public static void displayInfo(String name, int age)
    {
        System.out.println("Name : "+name+ ", Age : "+age);
    }

    public static String displayInfo(String name, int age, char gender)
    {
        return "Name : "+name+ ", Age : "+age+", Genre : "+gender;
    }
}
