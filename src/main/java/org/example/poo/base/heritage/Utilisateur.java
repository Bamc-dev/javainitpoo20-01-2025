package org.example.poo.base.heritage;

public class Utilisateur {

    private String nom;
    private String prenom;

    private int age;


    private static int nbrUtilisateur;

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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age >= 0)
        {
            this.age = age;
        } else {
            System.out.println("Age invalide");
        }
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

    public static int getNbrUtilisateur() {
        return nbrUtilisateur;
    }

    public void afficherInformation()
    {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : "+this.prenom);
        System.out.println("Age : "+this.age);
    }
}
