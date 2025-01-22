package org.example.poo.base.encapsulation;

public class CompteCourant extends CompteBancaire{
    private double decouvert;


    public CompteCourant(double soldeInitial, double decouvert) {
        super(soldeInitial);
        this.decouvert = decouvert;
    }


    @Override
    public void retirer(double montant) {
        if (montant <= getSolde() + decouvert) {
            super.retirer(montant);
        } else {
            System.out.println("Le retrait dépasse la limite autorisée (solde + découvert).");
        }
    }
}
