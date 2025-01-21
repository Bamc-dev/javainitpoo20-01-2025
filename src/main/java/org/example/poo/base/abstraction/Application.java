package org.example.poo.base.abstraction;

public class Application {
    public static void main(String[] args) {
        // C'est une classe abstraite donc impossible d'instancier la classe
        // Utilisateur user = new Utilisateur()

        Client cli = new Client("Henry", "Pierre", 24 ,"GT857F", true);
        cli.afficherInformations();
        cli.effectuerAchat(125);
        cli.effectuerAchat(500);
        cli.afficherInformations();

        System.out.println("\n");

        Vendeur vendeur = new Vendeur("Otto", "Matique", 24, "YU68R");
        vendeur.afficherInformations();
        vendeur.effectuerVente(350);
        vendeur.afficherInformations();
    }
}
