package org.example.poo.base.interfaces.repository;

import org.example.poo.base.interfaces.model.Client;
import org.example.poo.base.interfaces.model.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class GestionUtilisateurImplV1 implements IGestionUtilisateur{
    @Override
    public void addUser(Utilisateur user) {
        System.out.println("SQL - Requète d'insertion dans une base de données");
    }

    @Override
    public void deleteUser(Utilisateur user) {
        System.out.println("SQL - Requète de suppresion dans une base de données");

    }

    @Override
    public void updateUser(Utilisateur user) {
        System.out.println("SQL - Requète de mise à jour dans une base de données");
    }

    @Override
    public Utilisateur getUser(int id) {
        System.out.println("SQL - Requète de selection dans une base de données");
        return new Client();
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        System.out.println("SQL - Requète de selection dans une base de données");
        return new ArrayList<Utilisateur>();
    }
}
