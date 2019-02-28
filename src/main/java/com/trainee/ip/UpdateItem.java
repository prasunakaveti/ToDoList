package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.util.ArrayList;

public class UpdateItem {

    public void updateStatus(int id, ArrayList<Model> toDoList) {
        for (Model todo : toDoList) {
            int itemId = todo.getToDoId();
            if (itemId == id) {
                todo.setToDoStatus("Done");
            }

        }
    }
}
