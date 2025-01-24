package org.example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bibliotheque<T extends Livre> {
    private final List<T> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(T livre)
    {
        livres.add(livre);
        System.out.println("Livre ajouté : "+livre);
    }
    public void supprimerLivre(String titre)
    {
        livres.removeIf(livre -> livre.getTitre().equalsIgnoreCase(titre));
        System.out.println("Livre supprimé : "+titre);
    }
    public List<T> listerLivres()
    {
        return new ArrayList<>(livres);
    }
    public Optional<T> chercherLivreParTitre(String titre)
    {
        return livres.stream()
                .filter(livre -> livre.getTitre().equalsIgnoreCase(titre))
                .findFirst();
    }

}
