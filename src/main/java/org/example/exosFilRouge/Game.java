package org.example.exosFilRouge;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 100);
        NPC npc1 = new NPC("Goblin", 5, 5);
        NPC npc2 = new NPC("Orc", -3, 2);

        player.render();
        npc1.render();
        npc2.render();

        System.out.println("\n--- Mise à jour des entités ---");
        player.update();
        npc1.update();
        npc2.update();

        System.out.println("\n--- Déplacement du joueur ---");
        player.move(2, 3);
        System.out.println("Player movement X : "+player.getX()+ ", Y : "+player.getY());
        player.update();
    }
}
