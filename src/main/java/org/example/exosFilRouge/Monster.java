package org.example.exosFilRouge;

public class Monster extends NPC{
    private int damage;
    public Monster(String nom, double x, double y, int damage) {
        super(nom, x, y);
        this.damage = damage;
    }

    public void attack(Player target)
    {
        System.out.println(this.getNom() + " attacks " + target.getNom() + " for "+this.damage+" damage!");
        target.setHealth(target.getHealth()-damage);
    }

    @Override
    public void interact() {
        System.out.println(this.getNom() + "fait un bruit de monstre");
    }

    @Override
    public void update() {
        super.update();
        this.wander();
        this.render();
    }
}
