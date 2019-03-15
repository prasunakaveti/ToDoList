package com.junit;
import com.trainee.ip.Model;
import com.trainee.ip.UpdateTask;
import org.junit.*;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;

public class UpdateTaskTest {
    @Test

    public void updateTest() {

        UpdateTask updateTask = new UpdateTask();
        // Create instance of UpdateTask

        // assert statements
        ArrayList<Model> todoList1 = new ArrayList<Model>();
        Model model1 = new Model();
        model1.setToDoDescription("Test Practice");
        model1.setDueDate("2019-03-20");
        model1.setProject("Home");
        model1.setToDoId(1234);
        todoList1.add(model1);

        assertEquals(0, updateTask.removeItem(1234, todoList1).size());

        ArrayList<Model> todoList2 = new ArrayList<Model>();
        Model model2 = new Model();
        model2.setToDoDescription("Dummy2");
        model2.setDueDate("2019-03-26");
        model2.setProject("Home");
        model2.setToDoId(4444);
        todoList2.add(model2);

        Model model3 = new Model();
        model3.setToDoDescription("Dummy1");
        model3.setDueDate("2019-03-22");
        model3.setProject("Shop");
        model3.setToDoId(3456);
        todoList2.add(model3);

        assertEquals(1, updateTask.removeItem(4444, todoList2).size());
    }
}