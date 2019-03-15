package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UpdateTask {

    public ArrayList<Model> updateStatus(int id, ArrayList<Model> toDoList) {
        for (Model todo : toDoList) {
            int itemId = todo.getToDoId();
            if (itemId == id) {
                if (!todo.getToDoStatus().equalsIgnoreCase("Done")) {
                    todo.setToDoStatus("Done");
                } else {
                    System.out.println("The task was already completed!");
                }
            }
        }
        return toDoList;

    }

    public ArrayList<Model> removeItem(int id, ArrayList<Model> toDoList) {
        for (Model todo : toDoList) {
            int itemId = todo.getToDoId();
            if (itemId == id) {
                toDoList.remove(todo);
                break;
            }
        }
        return toDoList;

    }

    public ArrayList<Model> updateTask(ArrayList<Model> toDoList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you item ID to proceed : ");
        String id = scanner.nextLine();

        // Please write a simple date format to validate due date!
        for (Model todo : toDoList) {
            int itemId = todo.getToDoId();

            if (itemId == Integer.parseInt(id)) {
                String previousDate=todo.getDueDate();
                String previousDescription=todo.getToDoDescription();
                String previousProject=todo.getProject();

                System.out.println("Please enter you task description : ");
                String description = scanner.nextLine();
                if ("".equals(description) || description == null) {
                    todo.setToDoDescription(previousDescription);
                }
                else{
                    todo.setToDoDescription(description);
                }

                // Updating the  new task description  only if it is not null

                System.out.println("Please enter your due date in format yyyy-mm-dd : ");
                String  dueDate= scanner.nextLine();
                if("".equals(dueDate) || dueDate == null){
                    todo.setDueDate(previousDate);
                }
                else {
                    todo.setDueDate(dueDate);
                }
                //Updating new DueDate only if it is not null

                System.out.println("Please enter the project : ");
                String project = scanner.nextLine();

                if (project ==null ||project==""){
                    todo.setProject(previousProject);
                }
                else{
                    todo.setProject(project);
                }
                //Updating new project only if it is not null
            }
        }
        return toDoList;

    }
}
