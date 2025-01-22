package org.example.exosFilRouge;

import org.example.exosFilRouge.exceptions.InvalidMovementException;
import org.example.exosFilRouge.exceptions.NegativHealthException;
import org.example.exosFilRouge.exceptions.UnrespectedMaxHealthException;

public class Player extends Entity{
    private int health;
    private static final int MAX_HEALTH = 100;

    public Player(String nom, double x, double y, int health) {
        super(nom, x, y);
        try {
            this.setHealth(health);
        }catch (UnrespectedMaxHealthException | NegativHealthException e)
        {
            e.printStackTrace();
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws UnrespectedMaxHealthException, NegativHealthException {
        if(health>MAX_HEALTH)
        {
            throw new UnrespectedMaxHealthException();
        }
        if (health<0)
        {
            throw new NegativHealthException();
        }
        this.health = health;
    }

    public void move(double dx, double dy) throws InvalidMovementException {
        if((super.getX() + dx < -10 || super.getX() + dx > 10)
                || (super.getY() + dy < -10 || super.getY() + dy > 10))
        {
            throw new InvalidMovementException();
        }
        System.out.println(super.getNom() + " se déplace de ("+dx+" , "+dy+")");
        setX(super.getX() + dx);
        setY(super.getY() + dy);
        System.out.println("Nouvelle position : ("+super.getX()+", "+super.getY()+")");
    }

    @Override
    public void update() {
        super.update();
        System.out.println(super.getNom() + " est en train de jouer avec "+this.health+"points de vie");
    }
}
