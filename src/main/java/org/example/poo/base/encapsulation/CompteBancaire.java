package org.example.poo.base.encapsulation;

public class CompteBancaire {
    private double solde;


    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }


    public double getSolde() {
        return solde;
    }


    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Solde insuffisant pour retirer " + montant);
        }
    }


    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Le montant du dépôt doit être positif.");
        }
    }
}
