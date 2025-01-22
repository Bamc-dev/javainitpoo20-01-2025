package org.example.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        //Création des utilisateurs
        Utilisateur user1 = new Utilisateur("Alex", "Andry", 38);
        Utilisateur user2 = new Utilisateur("Luc", "Harne", 55);
        Utilisateur user3 = new Utilisateur("Melanie", "Mal", 24);
        Utilisateur user4 = new Utilisateur("Didier", "Tétique", 18);
        Utilisateur user5 = new Utilisateur("Mickey", "Mouse", 24);
        Utilisateur user6 = new Utilisateur("Melanie", "Mal", 24);


        System.out.println("---------------------------- Interface List -- Classe ArrayList -----------------");
        List<Utilisateur> users1 = new ArrayList<>();
        users1.add(user1);
        users1.addAll(List.of(user2, user3, user4, user5, user6));
        //Equivalent à
//        users1.add(user2);
//        users1.add(user3);
//        users1.add(user4);
//        users1.add(user5);

        //Affichage classique
        System.out.println("For");
        for (int i = 0; i < users1.size(); i++) {
            System.out.println(users1.get(1));
        }
        System.out.println("Foreach");
        for (Utilisateur utilisateur : users1)
        {
            System.out.println(utilisateur);
        }
        //List.forEach sans méthode référence
        users1.forEach(d->{
            System.out.println(d);
        });
        //List.forEach avec méthode référence
        users1.forEach(System.out::println);

        System.out.println(" ----------- Exemples d'utilisation des Streams ----------");

        //1.Trier les utilisateurs par âge
        System.out.println("1. Trier les utilisateur par âge");
        users1.stream()
                .sorted(Comparator.comparingInt(Utilisateur::getAge)) //A décomposé
                .forEach(System.out::println);
        //equivalence
        users1.stream()
                .sorted(Comparator.comparingInt(user -> user.getAge()))
                .forEach(System.out::println);
        //2. Obtenir les noms de tous les utilisateurs dans une liste
        System.out.println("2. Obtenir les noms de tous les utilisateurs dans une liste");
        List<String> noms = users1.stream()
                .map(Utilisateur::getNom) //Transforme une valeur
                .collect(Collectors.toList());
        noms.forEach(System.out::println);

        //3. Filtrer les utilisateurs de plus de 30 ans
        System.out.println("3. Filtrer les utilisateurs de plus de 30 ans");
        users1.stream()
                .filter(user -> user.getAge() > 30) // Prend un prédicat (donc une valeur soit true soit false)
                .forEach(System.out::println);

        //4 . Vérifier si tous les utilisateurs sont majeurs
        System.out.println("4 . Vérifier si tous les utilisateurs sont majeurs");
        boolean allMajeurs = users1.stream()
                .allMatch(user -> user.getAge()>=18);
        System.out.println("Tous majeurs ? "+allMajeurs);

        //5. Vérifier su au moins un utilisateur à 18 ans
        System.out.println("5. Vérifier su au moins un utilisateur à 18 ans");
        boolean atLeastOne18 = users1.stream()
                .anyMatch(user -> user.getAge() == 18);
        System.out.println("Au moins un utilisateur a 18 ans ? "+atLeastOne18);

        //6 . Obtenir la moyenne d'âge des utilisateurs
        System.out.println("6 . Obtenir la moyenne d'âge des utilisateurs");
        double averageAge = users1.stream()
                .mapToInt(Utilisateur::getAge)
                .average()
                .orElse(0);
        System.out.println("Moyenne d'âge : "+averageAge);

        //7 . Trouver l'utilisateur le plus jeune
        System.out.println("7 . Trouver l'utilisateur le plus jeune");
        users1.stream()
                .min(Comparator.comparingInt(Utilisateur::getAge))
                .ifPresent(user -> System.out.println("Le plus jeune : "+user));

        //8. Grouper les utilisateurs par âge
        System.out.println("8. Grouper les utilisateurs par âge");
        Map<Integer, List<Utilisateur>> usersByAge = users1.stream()
                .collect(Collectors.groupingBy(Utilisateur::getAge));
        usersByAge.forEach((age, users) ->
        {
            System.out.println("Âge : "+age);
            users.forEach(System.out::println);
        });
        //9. Obtenir une chaîne de noms séparés par une virgule
        System.out.println("9. Obtenir une chaîne de noms séparés par une virgule");
        String nomsSepares = users1.stream()
                .map(Utilisateur::getNom)
                .distinct()
                .collect(Collectors.joining(" , "));
        System.out.println(nomsSepares);

        //10. Collecter les utilisateurs dans un Set pour éviter les doublons
        System.out.println("10. Collecter les utilisateurs dans un Set pour éviter les doublons");
        Set<Utilisateur> uniqueUsers = users1.stream()
                .collect(Collectors.toSet());
        uniqueUsers.forEach(System.out::println);

        // Interface Set et HashSet
        System.out.println(" -------------------- Interface Set -- Classe HashSet -----------------");
        Set<Utilisateur> users2 = new HashSet<>(users1);
        users2.forEach(System.out::println);

        //Interface Map et HashMap
        System.out.println("------------ Interface Map -- Classe HashMap ---------------");
        Map<Utilisateur, Integer> mapUsers = new HashMap<>();
        mapUsers.put(user1, 1001);
        mapUsers.put(user2, 1002);
        mapUsers.put(user3, 1003);
        mapUsers.put(user4, 1004);
        mapUsers.put(user5, 1005);
        mapUsers.put(user6, 1006);

        // 11 . Parcourir une Map avec Streams
        System.out.println("11 . Parcourir une Map avec Streams");
        mapUsers.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " - "+ entry.getValue()));

        //12. Filtrer les entrées de la Map ou la valeur est > 1003
        System.out.println("12. Filtrer les entrées de la Map ou la valeur est > 1003");
        mapUsers.entrySet().stream()
                .filter(entry -> entry.getValue()>1003)
                .forEach(entry -> System.out.println(entry.getKey() + " - "+entry.getValue()));

        //13 . Extraire les clés de la Map
        System.out.println("13 . Extraire les clés de la Map");
        mapUsers.keySet().forEach(System.out::println);

        //14. Extraire les valeurs de la map
        System.out.println("14. Extraire les valeurs de la map");
        mapUsers.values().forEach(System.out::println);

        //15. Trouver la clé associée à une valeur spécifique
        System.out.println("15. Trouver la clé associée à une valeur spécifique");
        mapUsers.entrySet().stream()
                .filter(entry -> entry.getValue() == 1005)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
