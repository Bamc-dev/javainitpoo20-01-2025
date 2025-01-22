package org.example.exosFilRouge;

import java.util.ArrayList;
import java.util.List;

public class Seller extends NPC{
    private List<String> inventory;

    public Seller(String nom, double x, double y, List<String> inventory) {
        super(nom, x, y);
        this.inventory = new ArrayList<>();
    }

    public void showInventory()
    {
        System.out.println(this.getNom() + " : Voici mon inventaire");
        inventory.forEach(System.out::println);
    }

    @Override
    public void interact() {
        System.out.println(this.getNom()+" : Bonjour Voyageur");
        showInventory();

    }

    @Override
    public void update() {
        System.out.println(this.getNom() + " Attend pour des acheteurs");
    }
}
