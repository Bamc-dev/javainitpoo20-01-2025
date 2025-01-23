package org.example.serialization;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVExample {
    public static void main(String[] args) {
        Set<Task> tasks = new HashSet<>();
        tasks.add(new Task("Manger", "Se préparer un bon repas", false, 3));
        tasks.add(new Task("Refaire son CV", "Corriger les fautes d'orthographe", true, 3));
        tasks.add(new Task("Tache 3", "Description de la tache 3", false, 3));

        String csvFilePath = "tasks.csv";
        String separator = ",";

        try {
            SerializationToolsWithoutJackson.serializeToCSV(tasks, csvFilePath, separator);
            System.out.println("Les taches ont été sauvegardées dans le CSV");

            Set<Task> loadedTasks = SerializationToolsWithoutJackson.deserializeFromCSV(csvFilePath, separator);
            System.out.println("Les taches ont bien été chargées");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
