package org.example.exosFilRouge;

import org.example.exosFilRouge.exceptions.NegativHealthException;
import org.example.exosFilRouge.exceptions.UnrespectedMaxHealthException;

public class Monster extends NPC{
    private int damage;
    public Monster(String nom, double x, double y, int damage) {
        super(nom, x, y);
        this.damage = damage;
    }

    public void attack(Player target)
    {
        try{
            target.setHealth(target.getHealth()-damage);
            System.out.println(this.getNom() + " attacks " + target.getNom() + " for "+this.damage+" damage!");
        }catch (UnrespectedMaxHealthException | NegativHealthException e)
        {
            e.printStackTrace();
        }

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
