package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class ShowTask {
    public void showToDoList(ArrayList<Model> toDoList) {

        int openCount = 0;
        int closeCount = 0;

        for (Model todo : toDoList) {
            if (todo.getToDoStatus().equalsIgnoreCase("Open")) {
                openCount++;
            }

            if (todo.getToDoStatus().equalsIgnoreCase("Close")) {
                closeCount++;

            }
        }

        Collections.sort(toDoList, new CustomComparator());
        System.out.println("**************** You have " + openCount + " tasks To do  and " + closeCount + " are done! *************: ");

        for (Model todo : toDoList) {
            System.out.println(todo.getToDoId() + "\t" + todo.getToDoDescription() + "\t\t"
                    + todo.getDueDate() + "\t\t" + todo.getProject() + " ---- " + todo.getToDoStatus());
        }

    }

}
