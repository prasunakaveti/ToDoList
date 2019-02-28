package com.trainee.ip;

import java.util.Scanner;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

public class StartApplication {
    public static void main(String args[]) {

        System.out.println(">>Welcome to Todo List Application.");
        Processor processor = new Processor();
        processor.inputReader();
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do want to continue (Y/N)? ");
        while ((input = scanner.nextLine()).equalsIgnoreCase("Y")) {

            processor.inputReader();
            System.out.println("Do want to continue (Y/N)? ");
        }
    }
}
