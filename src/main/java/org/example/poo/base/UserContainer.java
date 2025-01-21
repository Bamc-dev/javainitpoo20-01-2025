package org.example.poo.base;

public class UserContainer {
    public static void main(String[] args) {
        Utilisateur user1 = new Utilisateur();
        System.out.println(user1.getPrenom());
        user1.setAge(-4);
        System.out.println(user1.getAge());

        System.out.println("Age de "+user1.getPrenom()+ " "+ user1.getAge() + " ans");
        Utilisateur user2 = new Utilisateur("Jean", "Luc", 28);
        System.out.println("Age de "+user2.getPrenom()+ " "+ user2.getAge() + " ans");

        Utilisateur user3 = new Utilisateur("Donald", "Dingo", -5);
        System.out.println("Nombre utilisateur : " + Utilisateur.getNbrUtilisateur());
        System.out.println(user3);

    }
}
