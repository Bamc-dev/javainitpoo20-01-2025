package org.example.poo.base.heritage;

public class Client extends Utilisateur{

    private String numClient;
    private boolean subscribe;

    public Client() {
        super(); // Appel implicite au constructeur sans paramètre de la classe parent
    }

    public Client(String nom, String prenom, int age, String numClient, boolean subscribe) {
        super(nom, prenom, age);
        this.numClient = numClient;
        this.subscribe = subscribe;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    /*
    Si vous utilisez @Override, le compilateur vérifie que la méthode redifinit bien la méthode de la classe parente.
    Si la méthode n'existe pas dans la classe parente, une erreur de compilation est levée.
    Cela évite les erreurs dues à des fautes de frappe, ou même des inchohérences dans les signatures.
     */
    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Numero du client : " + this.numClient);
        System.out.println("Subscribe : " + (this.subscribe ? "Oui" : "Non"));

    }
}
