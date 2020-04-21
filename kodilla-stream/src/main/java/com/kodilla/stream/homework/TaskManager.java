package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
//
//        TaskRepository.getTasksList()
//            .stream()
////            .filter(t -> t.getDeadline().equals(getCompareDate()))
//            .map(t -> t.getName())
//            .forEach(tx -> System.out.println(tx));

        List<String> tasksOutOfDate = TaskRepository.getTasksList()
                .stream()
                .filter(t -> t.getDeadline().equals(getCompareDate()))
                .map(TaskManager::getTask)
                .collect(Collectors.toList());
        System.out.println(tasksOutOfDate);
    }
    private static LocalDate getCompareDate() {
        return LocalDate.of(2020,05,10);
    }
    public static String getTask(Task task) {
        return task.getName();
    }

}
