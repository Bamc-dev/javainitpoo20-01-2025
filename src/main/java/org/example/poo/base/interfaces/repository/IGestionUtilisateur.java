package org.example.poo.base.interfaces.repository;

// Une interface permet de definir un niveau d'abstraction, en specifiant ce que les objets doivent faire
// sans se soucier comment ils le font.
// Cela permet de concevoir des composants qui sont independant
// de l'implementation (Couplage faible entre les composants)


import org.example.poo.base.interfaces.model.Utilisateur;

import java.util.List;

public interface IGestionUtilisateur {
    /*
    Liste des fonctionnalités
    on doit pouvoir :
    - Créer un utilisateur
    - Supprimer un utilisateur
    - Mettre à jour un utilisateur
    - Recuperer un utilisateur
    - Recuperer la liste des utilisateurs
     */
     void addUser(Utilisateur user);
     void deleteUser(Utilisateur user);
     void updateUser(Utilisateur user);
     Utilisateur getUser(int id);
     List<Utilisateur> getAllUsers();
     //Default
     default void printMyFunction()
     {
         System.out.println("Hello, that my print function from my Interface");
     }



}
