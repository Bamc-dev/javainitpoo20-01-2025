package org.example.poo.base.encapsulation;

public class BanqueHeritage {
    public static void main(String[] args) {
        CompteCourant compteCourant = new CompteCourant(1000, 500);

        compteCourant.retirer(1200);
        compteCourant.deposer(300);

        System.out.println("Solde du compte courant : " + compteCourant.getSolde());
    }

}
