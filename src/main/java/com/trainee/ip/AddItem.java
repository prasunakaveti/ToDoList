package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AddItem {

    public ArrayList<Model>  addToDoItem(ArrayList<Model> toDoList) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your To do item description: ");
        String description = scanner.nextLine();

        Model todo = new Model(); //POJO
        todo.setToDoDescription(description);//adding task description
        todo.setToDoId(random.nextInt(10000));//setting randomId
        todo.setToDoStatus("Open");
        toDoList.add(todo);
        return toDoList;
    }

}
