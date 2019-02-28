package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.util.ArrayList;

public class ShowItem {
    public void showToDoList(ArrayList<Model> toDoList) {
        System.out.println("**************** Your open To do Items *************: ");
        for (Model todo : toDoList)
            System.out.println(todo.getToDoId() + "/t " + todo.getToDoDescription() + " --- " + todo.getToDoStatus());

    }
}
