package org.example.collections.exos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleToListCollectorToList {
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("Develop Feature X", "In Progress", 1, 8),
                new Task("Fix Bug Y", "Pending", 2, 4),
                new Task("Write Documentation", "Completed", 3, 2),
                new Task("Code Review", "In Progress", 2, 6),
                new Task("Team Meeting", "Pending", 3, 1),
                new Task("Deploy Application", "Completed", 1, 3)
        );

        //Renvoie une liste Immutable
        List<String> taskTitles = tasks.stream()
                .map(Task::getTitle)
                .toList();
        taskTitles.forEach(task -> System.out.println(task));

        //Renvoie une liste mutable
        List<String> taskTitles2 = tasks.stream()
                .map(Task::getTitle)
                .collect(Collectors.toList());
        taskTitles.add("Test");
        taskTitles2.add("Test");
    }
}
