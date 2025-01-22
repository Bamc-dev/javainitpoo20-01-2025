package org.example.exosFilRouge;

import org.example.exosFilRouge.exceptions.InvalidMovementException;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 5);
        NPC seller = new Seller("Goblin", 5, 5, List.of("Epee", "Bouclier", "Arc"));
        Monster monster = new Monster("Orc", -3, 2, 10);
        Scene scene = new Scene(List.of(player, seller, monster));
        scene.renderAllEntity();

        //Interaction
        System.out.println("----- Interactions -------");
        seller.interact();
        monster.interact();
        monster.attack(player);

        System.out.println("\n--- Déplacement du joueur ---");

        try {
            player.move(11, 11);
        } catch (InvalidMovementException e) {
            e.printStackTrace();
        }

        System.out.println("Player movement X : "+player.getX()+ ", Y : "+player.getY());
        player.update();

        scene.renderAllEntity();
        player.update();
    }
}
