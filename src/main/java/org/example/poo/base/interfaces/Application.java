package org.example.poo.base.interfaces;

import org.example.poo.base.interfaces.model.Client;
import org.example.poo.base.interfaces.repository.GestionUtilisateurAvecRoles;
import org.example.poo.base.interfaces.repository.GestionUtilisateurImplV1;
import org.example.poo.base.interfaces.repository.GestionUtilisateurImplV2;
import org.example.poo.base.interfaces.repository.IGestionUtilisateur;

public class Application {
    public static void main(String[] args) {
        //V1 qui est l'implémentation
        GestionUtilisateurImplV1 v1 = new GestionUtilisateurImplV1();

        //Déclaration que l'on veut une classe qui implémente cet interface
        IGestionUtilisateur v2 = new GestionUtilisateurImplV2();

        IGestionUtilisateur v3 = new GestionUtilisateurAvecRoles();
        v1.addUser(new Client());
    }
}
