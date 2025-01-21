package org.example.poo.base.polymorphisme;

public class Vendeur extends Utilisateur{
    // un int pour le numeroVendeur
    // getter setter
    // override afficherInformations - rajoute un ligne qui indique le numero du vendeur

    private String idVendeur;

    public Vendeur() {
        super();
    }

    public Vendeur(String nom, String prenom, int age, String idVendeur) {
        super(nom, prenom, age);
        this.idVendeur = idVendeur;
    }

    public String getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(String idVendeur) {
        this.idVendeur = idVendeur;
    }

    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Numero du vendeur : "+this.idVendeur);
    }
}
