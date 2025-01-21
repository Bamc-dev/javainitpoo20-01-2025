package org.example.poo.base.interfaces.repository;

import org.example.poo.base.interfaces.model.Utilisateur;

import java.util.List;

public interface IGestionRoles {

    void addRole(Utilisateur user, String role);
    void removeRole(Utilisateur user, String role);
    List<String> getRoles(Utilisateur user);
}
