package com.trainee.ip;
/* *
 * This class processes the File writer and File read operations
 * Created by @ gnanaprasunakaveti on 2019-02-27
 */

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public void writetoFile(ArrayList<Model> toDoList) throws IOException {

        FileWriter fileWriter = new FileWriter("todolist.txt");
        // Creating a text File using FileWriter

        for (Model itemModel : toDoList) {
            fileWriter.write(itemModel.getToDoId() + "::" + itemModel.getToDoDescription() + "::" + itemModel.getDueDate() + " ::" + itemModel.getProject() + "::" + itemModel.getToDoStatus() + "\n");
            // Write list elements separated with delimiter
        }
        fileWriter.close();
        // Releasing resources after writing into file
    }

    public static ArrayList<Model> readFile() throws IOException {
        ArrayList<Model> list = new ArrayList<Model>();
        File f = new File("todolist.txt");
        // Create instance of the file
        BufferedReader b = new BufferedReader(new FileReader(f));
        // BufferedReader reads from file

        String readLine = "";
        while ((readLine = b.readLine()) != null) {
            Model model = new Model();
            if (readLine.contains("::")) {
                String[] arrOfStr = readLine.split("::");
                // Creating an array of strings

                model.setToDoId(Integer.parseInt(arrOfStr[0]));
                model.setToDoDescription(arrOfStr[1]);
                model.setDueDate(arrOfStr[2]);
                model.setProject(arrOfStr[3]);
                model.setToDoStatus(arrOfStr[4]);
                list.add(model);
                // Assign values to the list
            }
        }
        return list;
    }

}
