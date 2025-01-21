package org.example.poo.base.interfaces.model;

public abstract class Utilisateur {

    private String nom;
    private String prenom;

    private int age;
    private static  int nbrUtilisateur;

    public Utilisateur()
    {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.setAge(0);
        nbrUtilisateur++;
    }

    public Utilisateur(String nom, String prenom, int age) {
        this(nom, prenom);
        this.setAge(age);
    }

    public Utilisateur(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNbrUtilisateur() {
        return nbrUtilisateur;
    }

    public static void setNbrUtilisateur(int nbrUtilisateur) {
        nbrUtilisateur = nbrUtilisateur;
    }
    public void afficherInformations()
    {
        System.out.println("Nom : "+this.nom);
        System.out.println("Prenom : "+this.prenom);
        System.out.println("Age: "+this.age);
    }
    public abstract double calculerPoint();
}
