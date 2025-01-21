package org.example.poo.base.association;

public abstract class Utilisateur {

    private String nom;
    private String prenom;

    private int age;
    private Adresse adresse;
    private TypeUtilisateur typeUtilisateur;
    private static  int nbrUtilisateur;

    public Utilisateur()
    {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.setAge(0);
        nbrUtilisateur++;
        typeUtilisateur = TypeUtilisateur.CLIENT;
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

    public Utilisateur(String nom, String prenom, int age, Adresse adresse) {
        this(nom, prenom, age);
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom.length() >= 2)
        {
            this.nom = nom;
        }else{
            System.out.println("Nom invalide");
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if(nom.length() >= 2)
        {
            this.prenom = prenom;
        }else{
            System.out.println("Prenom invalide");
        }
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public TypeUtilisateur getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public void afficherInformations()
    {
        System.out.println("Nom : "+this.nom);
        System.out.println("Prenom : "+this.prenom);
        System.out.println("Age: "+this.age);
        System.out.println("Adresse : "+ this.adresse.toString()); //this.adresse.toString()
        System.out.println("TypeUtilisateur : "+ typeUtilisateur);
    }
    public abstract double calculerPoint();
}
