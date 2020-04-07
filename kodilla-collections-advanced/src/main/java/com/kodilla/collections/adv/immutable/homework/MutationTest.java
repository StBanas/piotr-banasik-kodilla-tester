/* poniżwj zrzut z ekranu dotza dania Task
Mimo zabezpieczeń  "protected" i "final" na zmiennych title i duration
można przeprowadzić wywołania na obiekcie "task"  */






package com.kodilla.collections.adv.immutable.homework;

public class MutationTest {
    public static void main(String[] args) {

        Task task = new Task("Mr", 125);

        TaskHacked taskHacked = (TaskHacked) task;
        taskHacked.modifyTitle( "newTitle");
        System.out.println(task.getTitle());
        task.
    }
}
