package com.junit;
import com.trainee.ip.Model;
import com.trainee.ip.UpdateTask;
import org.junit.*;
import com.trainee.ip.AddTask;

import java.util.ArrayList;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;

public class UpdateTaskTest {

    @Test
    public void updateTest() {
        UpdateTask  updateTask = new UpdateTask();
        // assert statements
        ArrayList<Model> todoList = new ArrayList<Model>();
        Model model = new Model();
        model.setToDoDescription("Dummy");
        model.setDueDate("2019-03-20");
        model.setProject("Home");
        model.setToDoId(1234);
        todoList.add(model);

        assertEquals(0, updateTask.removeItem(1234, todoList).size());


        ArrayList<Model> todoList2 = new ArrayList<Model>();
        Model model1 = new Model();
        model1.setToDoDescription("Dummy2");
        model1.setDueDate("2019-03-26");
        model1.setProject("Home");
        model1.setToDoId(4444);
        todoList2.add(model1);

        Model model2 = new Model();
        model2.setToDoDescription("Dummy1");
        model2.setDueDate("2019-03-22");
        model2.setProject("Shop");
        model2.setToDoId(3456);
        todoList2.add(model2);

        assertEquals(1, updateTask.removeItem(4444, todoList2).size());
    }
}