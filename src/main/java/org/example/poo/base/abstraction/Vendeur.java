package org.example.poo.base.abstraction;

import org.example.poo.base.abstraction.Utilisateur;

public class Vendeur extends Utilisateur {

    private String numeroVendeur;
    private double ventesTotals;

    //Constante défini par le final
    private final double POURCENT_VENDEUR = 0.3;

    public Vendeur(String nom, String prenom, int age, String numeroVendeur) {
        super(nom, prenom, age);
        this.numeroVendeur = numeroVendeur;
    }

    public String getNumeroVendeur() {
        return numeroVendeur;
    }

    public void setNumeroVendeur(String numeroVendeur) {
        this.numeroVendeur = numeroVendeur;
    }

    public double getVentesTotals() {
        return ventesTotals;
    }

    public void setVentesTotals(double ventesTotals) {
        this.ventesTotals = ventesTotals;
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Numero du vendeur : "+this.numeroVendeur);
        System.out.println("Vente total: "+this.ventesTotals);
        System.out.println("Nombre de points : "+this.calculerPoint()+" points");
    }

    @Override
    public double calculerPoint() {
        return this.ventesTotals * POURCENT_VENDEUR;
    }

    public void effectuerVente(double montant)
    {
        if(montant > 0)
        {
            this.ventesTotals += montant;
        }else {
            System.out.println("Je suis le vendeur, pas l'acheteur - Montant invalide");
        }
    }
}
