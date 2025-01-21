package org.example.poo.base.association;


public class Livreur extends Utilisateur {
    private String numVehicule;
    private boolean disponible;

    private Livreur() {
    }

    public Livreur(String nom, String prenom, int age, String numVehicule, boolean disponible) {
        super(nom, prenom, age);
        this.numVehicule = numVehicule;
        this.disponible = disponible;
    }

    public String getNumVehicule() {
        return numVehicule;
    }

    public void setNumVehicule(String numVehicule) {
        this.numVehicule = numVehicule;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public double calculerPoint() {
        return 0;
    }
}

