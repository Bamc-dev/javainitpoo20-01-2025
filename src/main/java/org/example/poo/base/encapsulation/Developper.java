package org.example.poo.base.encapsulation;

public class Developper extends Employee{


    public Developper(String name, double salary) {
        super(name, salary);
    }
    private void donnerUnePrime(double prime)
    {
        this.salary += prime;
    }
}
