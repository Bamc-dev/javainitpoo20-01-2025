package org.example.serialization;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SerializationToolsWithoutJackson {
    public static void serializeToCSV(Set<Task> tasks, String path, String separator) throws IOException {
        // Utiliser le 'BufferedWriter' pour écrire dans le fichier
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write("Title"+separator+"Description"+separator+"Completed"+separator+"Priority");
            writer.newLine();

            for(Task task : tasks)
            {
                writer.write(task.getTitle()+separator+task.getDescription()+separator+task.isCompleted()+separator+task.getPriority());
                writer.newLine();
            }
        }
    }

    public static Set<Task> deserializeFromCSV(String path, String separator) throws IOException {
        Set<Task> tasks = new HashSet<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null)
            {
                if(isHeader){
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(separator);
                if(data.length != 4)
                {
                    throw new IllegalArgumentException("Format incorrect dans le fichier CSV : "+line);
                }

                String title = data[0].trim();
                String description = data[1].trim();
                boolean isCompleted = Boolean.parseBoolean(data[2].trim());
                int priority = Integer.parseInt(data[3].trim());

                tasks.add(new Task(title, description, isCompleted, priority));
            }
        }
        return tasks;
    }
}
