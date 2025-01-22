package org.example.poo.base.encapsulation;

import java.util.ArrayList;

public class Banque {
    private ArrayList<CompteBancaire> comptes;

    public Banque() {
        comptes = new ArrayList<>();
    }

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
        System.out.println("Compte ajouté avec solde : " + compte.getSolde());
    }

    public void afficherSoldes() {
        System.out.println("Soldes des comptes dans la banque :");
        for (CompteBancaire compte : comptes) {
            System.out.println("Solde : " + compte.getSolde());
        }
    }
}
