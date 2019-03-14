package com.junit;
import org.junit.*;
import com.trainee.ip.AddTask;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;

public class AddTaskTest {

    @Test
    public void getDateFormat() {
        AddTask addTaskTest = new AddTask();
        // assert statements

       assertNotSame(new Date(), addTaskTest.getDateFormat("2019-03-10"));

    }
}