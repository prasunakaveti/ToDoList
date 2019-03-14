package com.trainee.ip;
/* *
 * This class is used to add elements to the ArrayList with Model object
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AddTask {

    public ArrayList<Model> addToDoItem(ArrayList<Model> toDoList) {
        // Since return type of addToDoItem method is ArrayList
        // this method should return ArrayList value
        Random random = new Random();
        // Create instance of Random class
        Model todo = new Model();
        // Create instance of Model class
        Date dueDate = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the task description: ");
        String description = scanner.nextLine();
        //Read task description as a String

        while ("".equals(description) || description == null) {
            System.out.println("Please enter a valid description : ");
            description = scanner.nextLine();
        }
        // Validate user input as not to be empty string or null value
        todo.setToDoDescription(description);
        // Set task description to the Model reference

        System.out.println("Please enter your due date in format yyyy-mm-dd : ");
        String userInputDueDate = scanner.nextLine();
        dueDate = getDateFormat(userInputDueDate);

        while (("".equals(dueDate) || dueDate == null) || dueDate.before(new Date())) {
            System.out.println("Please enter a valid due date in format yyyy-mm-dd : ");
            userInputDueDate = scanner.nextLine();
            dueDate = getDateFormat(userInputDueDate);
        }
        // Validate duedate as not to be before the present date
        todo.setDueDate(userInputDueDate);
        // Set duedate to the Model reference

        System.out.println("Please enter the project name ");
        String projectName = scanner.nextLine();
        while ("".equals(projectName) || projectName == null) {
            System.out.println("Please enter a valid description : ");
            projectName = scanner.nextLine();
        }
        // Validate user inputs with empty string or null values
        todo.setProject(projectName);
        //Set project name to the Model reference

        todo.setToDoId(random.nextInt(10000));
        //Generate random integers in range 0 to 9999
        //Set random number to the Model reference

        todo.setToDoStatus("Open");
        //Set status as Open by default

        toDoList.add(todo);
        //Adding elements of Model reference to ArrayList

        return toDoList;
    }

    private Date getDateFormat(String userInputDueDate) {
        // Since return type of getDateFormat method is Date
        // this method should return Date value
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Formating Date according to "yyyy-MM-dd"
        Date dueDate = null;
        try {
            dueDate = simpleDateFormat.parse(userInputDueDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dueDate;
    }

}
