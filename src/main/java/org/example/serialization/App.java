package org.example.serialization;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Task> tasks = new HashSet<>();
        tasks.add(new Task("Acheter du lait", "Aller à l'épicerie pour acheter du lait", false, 2));
        tasks.add(new Task("Révision Java", "Étudier les Streams et les Collections", false, 1));
        tasks.add(new Task("Nettoyer la maison", "Passer l'aspirateur et ranger les chambres", true, 3));
        tasks.add(new Task("Faire du sport", "30 minutes de course à pied", false, 2));

        String binPath = "tasks.bin";
        String jsonPath = "tasks.json";
        String xmlPath = "tasks.xml";
        try {
            //Sérialisation binaire
            SerializationTool.serializeToBin(tasks, binPath);
            System.out.println("Sérialization binaire");

            Set<Task> loadedTasksFromBin = SerializationTool.deserializeFromBin(binPath);
            System.out.println("Taches chargées depuis le fichier binaire : "+loadedTasksFromBin);

            SerializationTool.serializeToJSON(tasks, jsonPath); // Nécéssite un constructeur par défaut dans la classe
            System.out.println("Sérialisation JSON effectuée.");

            // Reflection - Principe que jackson utilise
            // Aptitude à un programme de connaitre le contenu de ses classes
//            System.out.println("----------------WARNING, ne pas prendre en compte ----------------");
//            Class<Task> taskClass = Task.class;
//            Object reflectionTask = taskClass.getDeclaredConstructor().newInstance();
//            System.out.println(reflectionTask);
//            Field title = reflectionTask.getClass().getDeclaredField("title");
//            title.setAccessible(true);
//            title.set(reflectionTask, "J'ai cassé la logique");
//            System.out.println(reflectionTask);
//            System.out.println("------------------------------------------------------------------");
            //

            Set<Task> loadedTasksFromJson = SerializationTool.deserializeFromJSON(jsonPath);
            System.out.println("Tâches chargées depuis le fichier JSON : "+loadedTasksFromJson);

            SerializationTool.serializeToXML(tasks, xmlPath);
            System.out.println("Sérialisation XML effectuée.");

            Set<Task> loadedTasksFromXML = SerializationTool.deserializeFromXML(xmlPath);
            System.out.println("Taches chargés depuis le fichier XML : "+loadedTasksFromXML);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();}
//        catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        }
    }
}
