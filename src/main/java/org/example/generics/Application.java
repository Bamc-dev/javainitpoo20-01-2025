package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Bibliotheque maBibliotheque = new Bibliotheque(); // Pas de type = Object par défaut
        maBibliotheque.ajouterLivre(new Roman("1984", "George Orwell", 1949, "Dystopie"));

        System.out.println(maBibliotheque.chercherLivreParTitre("1984"));
        Bibliotheque<Roman> romanBibliotheque = new Bibliotheque<>();
        romanBibliotheque.ajouterLivre(new Roman("1984", "George Orwell", 1949, "Dystopie"));
        romanBibliotheque.chercherLivreParTitre("1984").get().getGenre();
        Bibliotheque<Magazine> magazineBibliotheque = new Bibliotheque<>();
        magazineBibliotheque.ajouterLivre(new Magazine("Top Achat", "Arthur Caillol", 2023, 5));
        magazineBibliotheque.chercherLivreParTitre("Top Achat").get().getNumeroEdition();


    }
}
