package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AddItem {

    public ArrayList<Model>  addToDoItem(ArrayList<Model> toDoList) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your To do item description: ");
        String description = scanner.nextLine();
        System.out.println("Enter your due date in format yyyy-mm-dd : ");
        String userInputDueDate = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dueDate=null;
        try {
           dueDate = simpleDateFormat.parse(userInputDueDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Enter your project name ");
        String projectName = scanner.nextLine();

        Model todo = new Model(); //POJO
        todo.setToDoDescription(description);//adding task description
        todo.setDueDate(simpleDateFormat.format(dueDate));//adding due date
        todo.setToDoId(random.nextInt(10000));//setting randomId
        todo.setProject(projectName);
        todo.setToDoStatus("Open");
        toDoList.add(todo);
        return toDoList;
    }

}
