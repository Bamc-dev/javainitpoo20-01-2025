package org.example.poo.base.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class App_bad {
    public static void main(String[] args) {
        List<Object> utilisateurs = new ArrayList<Object>();

        Client client1 = new Client("Alex", "Andry", 38, "25SZE", false);
        Vendeur vendeur1 = new Vendeur("Luc", "Harne", 55, "EFT87");
        Vendeur vendeur2 = new Vendeur("Melanie", "Mal", 24, "FE25A");
        Client client2 = new Client("Mickey", "Mouse", 18, "100AA", true);
        Livreur livreur1 = new Livreur("Donald", "Duck", 19, "M087F", true);

        utilisateurs.add(client1);
        utilisateurs.add(vendeur1);
        utilisateurs.add(vendeur2);
        utilisateurs.add(client2);
        utilisateurs.add(livreur1);

        //Traitement metier
        //Afficher les informations de chaque utilisateur
        for (Object user : utilisateurs)
        {
            if (user instanceof Client) {
                ((Client) user).afficherInformation();
            } else if (user instanceof Vendeur) {
                ((Vendeur) user).afficherInformation();
            } else if (user instanceof Livreur) {
                ((Livreur) user).afficherInformation();
            }
        }

    }
}
