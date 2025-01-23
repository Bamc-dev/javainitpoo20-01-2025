package org.example.collections.exos;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("Develop Feature X", "In Progress", 1, 8),
                new Task("Fix Bug Y", "Pending", 2, 4),
                new Task("Write Documentation", "Completed", 3, 2),
                new Task("Code Review", "In Progress", 2, 6),
                new Task("Team Meeting", "Pending", 3, 1),
                new Task("Deploy Application", "Completed", 1, 3)
        );

        System.out.println("1 ---------------");
        tasks.stream()
                .filter(task->task.getStatus().equals("Completed"))
                .forEach(System.out::println);

        System.out.println("2 ---------------");
        tasks.stream()
                .filter(task -> task.getPriority() == 1)
                .forEach(System.out::println);

        System.out.println("3 --------------");
        tasks.stream()
                .sorted(Comparator.comparingInt(Task::getDuration))
                .forEach(System.out::println);

        System.out.println("4 ------------");
        tasks.stream().
                sorted(Comparator.comparing(Task::getStatus)
                        .thenComparing(Task::getPriority))
                .forEach(System.out::println);

        System.out.println("5 -------------");
        List<String> taskTitles = tasks.stream()
                .map(Task::getTitle)
                        //.collect(Collectors.toList());
                .toList(); //.collect(Collectors.toList()) (A check différence entre les deux)
        taskTitles.forEach(System.out::println);

        System.out.println(" 6 -----------");
        tasks.stream()
                .filter(task -> task.getDuration() > 5)
                .map(Task::getTitle)
                .forEach(title -> System.out.println("6 - Tâches dont la durée est > à 5 heures: " + title));

        System.out.println("7 ------------");
        int totalDuration = tasks.stream()
                .mapToInt(Task::getDuration)
                .sum();
        System.out.println(totalDuration);
        // Trouvez la durée moyenne des taches ayant une priorité de 2
        System.out.println(" 8 -----------");
        OptionalDouble averageDurtoin = tasks.stream()
                .filter(task -> task.getPriority() == 2)
                .mapToInt(task -> task.getDuration())
                .average();
        System.out.println(averageDurtoin.getAsDouble());
        System.out.println(" 9 ------------");
        boolean inProgresTask = tasks.stream()
                .anyMatch(task -> task.getStatus().equals("In Progress")); // Au moins un element remplie cette condition
        System.out.println("In progress task"+inProgresTask);

        System.out.println("10 -----------");
        tasks.stream()
                .filter(task -> task.getDuration() < 3)
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("11 ----------");
        Map<String, List<Task>> tasksByStatus = tasks.stream()
                .collect(Collectors.groupingBy(Task::getStatus));
        tasksByStatus.forEach((status, taskList) -> System.out.println(status + ": " + taskList));
        System.out.println("12 ---------");
        Map<Integer, Long> taskCountByPriority = tasks.stream()
                .collect(Collectors.groupingBy(Task::getPriority, Collectors.counting()));
        System.out.println("12 - Comptez le nombre total de tâches pour chaque priorité: " + taskCountByPriority);
        System.out.println("13 ----------");
        tasks.stream()
                .filter(task -> task.getDuration() > 4)
                .collect(Collectors.toList()) //.toList()
                .forEach(System.out::println);
        System.out.println("14 ----------- ");
        String taskTitles2 = tasks.stream()
                .map(Task::getTitle)
                .distinct()  //Permet d'enlever tout les doublons
                .collect(Collectors.joining(", "));
        System.out.println(taskTitles);
        System.out.println("15 ----------------");
        List<Task> threeShortestTasks = tasks.stream()
                .sorted(Comparator.comparingInt(Task::getDuration))
                .limit(3)
                .toList();
        System.out.println(threeShortestTasks);
        System.out.println("16 -------------");
        tasks.stream()
                .filter(task -> task.getPriority() == 1 || task.getDuration() < 2) // &&, ||,
                .forEach(System.out::println);

//        Task{title='Develop Feature X', status='In Progress', priority=1, duration=8}
//        Task{title='Team Meeting', status='Pending', priority=3, duration=1}
//        Task{title='Deploy Application', status='Completed', priority=1, duration=3}
        System.out.println("17 -----------");
        tasks.stream()
                .max(Comparator.comparingInt(Task::getDuration))
                .ifPresent(System.out::println);
        //System.out.println(longestTask);

        System.out.println("18 -----------");
        Map<Boolean, List<Task>> tasksByPriority = tasks.stream()
                .collect(Collectors.partitioningBy(task -> task.getPriority() == 1));
        System.out.println("Tâches avec priorité 1 :");
        tasksByPriority.get(true).forEach(task -> System.out.println(" - " + task));
        // Sout des autres tâches
        System.out.println("Autres tâches (priorité différente de 1) :");
        tasksByPriority.get(false).forEach(task -> System.out.println(" - " + task));

        System.out.println("19 ----------");
        System.out.println(tasks.stream()
                .collect(Collectors.toMap(
                        task -> task,
                        task -> task.getDuration() * task.getPriority()
                )));
        System.out.println("20 ----------");
        Map<String, Integer> taskDurationMap = tasks.stream()
                .collect(Collectors.toMap(
                        Task::getTitle,
                        Task::getDuration));
        taskDurationMap.forEach((title, duration) -> {
            System.out.println("Titre : " + title + ", Durée : " + duration + " heures");
        });
    }
}
