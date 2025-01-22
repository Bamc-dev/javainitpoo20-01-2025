package org.example.exosFilRouge;

public class Player extends Entity{

    private int health;

    public Player(String nom, double x, double y, int health) {
        super(nom, x, y);
        this.health = health;
    }

    public void move(double dx, double dy)
    {
        System.out.println(super.getNom() + " se déplace de ("+dx+" , "+dy+")");
        setX(super.getX() + dx);
        setY(super.getY() + dy);
        System.out.println("Nouvelle position : ("+super.getX()+", "+super.getY()+")");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void update() {
        super.update();
        System.out.println(super.getNom() + " est en train de jouer avec "+this.health+"points de vie");
    }
}
