package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
     ArrayList<Model> toDoList = new ArrayList<Model>();
    public void inputReader() {
        System.out.println(">>Please choose your option to proceed ");
        System.out.println("(1) Show Task List  ");
        System.out.println("(2) Add New Task");
        System.out.println("(3) Edit Task (update status as done)");

        ShowItem showItem = new ShowItem();
        AddItem addItem = new AddItem();
        UpdateItem updateItem= new UpdateItem();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();


        if (option == 1) {
            showItem.showToDoList(toDoList); //Show task list
        } else if (option == 2) {
            toDoList=addItem.addToDoItem(toDoList); //add task
        } else if (option == 3) {
            System.out.println("Please enter you item id to update status: ");
            int id = scanner.nextInt();

            updateItem.updateStatus(id,toDoList); //update task status
        } else {
            System.exit(0);
        }

    }
}
