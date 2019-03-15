package com.trainee.ip;
/* *
 * This class controls processing of Todolist application
 * User can do the operation with input choice
 * User can add and update and remove task details into ArrayList
 * User write changes to File using File Writer
 *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
    ArrayList<Model> toDoList = new ArrayList<Model>();

    // Creating an ArrayList with Model object

    boolean showCalled = false;

    public void inputReader() throws IOException {
        System.out.println("Please choose your option to proceed !");
        System.out.println("(1) Show Task List  ");
        System.out.println("(2) Add New Task");
        System.out.println("(3) Please enter ID to update status(as done) ");
        System.out.println("(4) Edit Task(update task description, due date and project )");
        System.out.println("(5) Please enter ID to remove your task!");
        // User is allowed to choose an option to proceed

        ShowTask showTask = new ShowTask();
        // Creating instance of classe ShowTask
        AddTask addTask = new AddTask();
        // Creating instance of classe AddTask
        UpdateTask updateTask = new UpdateTask();
        // Creating instance of classe UpdateTask

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        FileHandler fileHandler = new FileHandler();
        // Creating instance of FileHandler

        if (option == 1) {
            try {
                showCalled = true;
                toDoList = fileHandler.readFile();

                showTask.showToDoList(toDoList);
                // Shows task list
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (option == 2) {

            if (!showCalled) {
                toDoList = fileHandler.readFile();
            }

            toDoList = addTask.addToDoItem(toDoList);
            // Adds task to list

            fileHandler.writetoFile(toDoList);
            // Writes list to File

        } else if (option == 3) {
            System.out.println("Please enter you item ID to update status to done: ");
            int id = scanner.nextInt();
            updateTask.updateStatus(id, toDoList);
            // Update task status as Done

            fileHandler.writetoFile(toDoList);
            // Write updated list values to File

        } else if (option == 4) {
            if (!toDoList.isEmpty()) {
                updateTask.updateTask(toDoList);
                // update values of list
                fileHandler.writetoFile(toDoList);
                // Write updated list values to File

            } else {
                System.out.println("Something went wrong: ");
                // Displays error message
            }
        } else if (option == 5) {
            System.out.println("Please enter you item ID to remove : ");
            int id = scanner.nextInt();
            updateTask.removeItem(id, toDoList);
            // Remove task with given Id

            fileHandler.writetoFile(toDoList);
            // Remove list from file
        } else {
            System.exit(0);
            // Quit application
        }

    }
}
