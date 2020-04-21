package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasksList() {
        List<Task> tasksList = new ArrayList<>();

        LocalDate startDate = LocalDate.of(2020, 05, 4);

        LocalDate decisionDate = LocalDate.of(2020, 05, 5);
        LocalDate voteDate = LocalDate.of(2020, 05, 8);
        LocalDate reconsiderDate = LocalDate.of(2020, 05, 9);
        LocalDate dropDate = LocalDate.of(2020, 05, 10);
        LocalDate happyDayDate = LocalDate.of(2020, 05, 11);
        LocalDate stopDate = LocalDate.of(2020, 05, 11);

        tasksList.add(new Task("Open email box", startDate ,decisionDate ));
        tasksList.add(new Task("Make a decision", decisionDate, voteDate));
        tasksList.add(new Task("Fill the voting buklet", voteDate, reconsiderDate));
        tasksList.add(new Task("Reconsider your choice change", reconsiderDate, dropDate));
        tasksList.add(new Task("Drop your vote buklet to never_see_daylight repository", dropDate, happyDayDate));
        tasksList.add(new Task("Read emails", happyDayDate, stopDate));
        return tasksList;
    }
}
