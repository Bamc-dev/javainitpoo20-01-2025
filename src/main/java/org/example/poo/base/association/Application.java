package org.example.poo.base.association;

public class Application {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("1 rue capitol", "Toulouse", 31000);
        Utilisateur client = new Client("Otto", "Matique", 52, adresse, "SS887DD", true);
        client.afficherInformations();

        System.out.println();
        System.out.println(client);
        System.out.println("------- Test enum ------------");
        if(client.getTypeUtilisateur() == TypeUtilisateur.CLIENT)
        {
            System.out.println("Vous pouvez acceder à la liste des produits et effectuer des achats");
        } else if (client.getTypeUtilisateur() == TypeUtilisateur.ADMIN) {
            System.out.println("Vous avez accès à toutes les ressources (modif, suppresion, add");
        } else if (client.getTypeUtilisateur() == TypeUtilisateur.VENDEUR) {
            System.out.println("Vous pouvez ajouter des produits");
        }

    }
}
