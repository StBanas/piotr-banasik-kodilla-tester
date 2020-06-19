package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//
//import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
//
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Test:Check The List";
    private static final String DESCRIPTION = "Test: This Is Description";

    @Test
    public void testTaskListRepositoryFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
//
       // When
        List<TaskList> readTaskLists = taskListRepository.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteAll();//   deleteById(id);
    }
//
}
//
//
