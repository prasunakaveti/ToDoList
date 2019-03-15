package com.trainee.ip;

import java.io.IOException;
import java.util.Scanner;
/* *
 *This is the main class of "To Do List" application.
 * User can add, update and remove task list to the File
 * User can get the sorted list from file using due date
 * Created by @ gnanaprasunakaveti on 2019-02-27
 */

public class StartApplication {
    public static void main(String args[]) {

        System.out.println("*********Welcome to the Todo List Application!*********");
        Processor processor = new Processor();
        try {
            processor.inputReader();
            String input;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your operation is completed successfully! ");
            System.out.println("Do you want to continue ( Y/N ) ? ");
            System.out.println("Please enter Y to proceed ");

            while ((input = scanner.nextLine()).equalsIgnoreCase("Y")) {
                processor.inputReader();
                System.out.println("Please enter Y to continue ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
