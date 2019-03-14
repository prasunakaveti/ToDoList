package com.trainee.ip;
/* *
 * This class processes the file write and file read operations
 * Created by @ gnanaprasunakaveti on 2019-02-27
 */

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public void writetoFile(ArrayList<Model> toDoList) throws IOException {

        FileWriter fileWriter = new FileWriter("todolist.txt");
        for (Model itemModel : toDoList) {
            fileWriter.write(itemModel.getToDoId() + "::" + itemModel.getToDoDescription() + "::" + itemModel.getDueDate() + " ::" + itemModel.getProject() + "::" + itemModel.getToDoStatus() + "\n");
        }
        fileWriter.close();
    }

    public static ArrayList<Model> readFile() throws IOException {
        ArrayList<Model> list = new ArrayList<Model>();
        File f = new File("todolist.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";
        while ((readLine = b.readLine()) != null) {
            Model model = new Model();
            if (readLine.contains("::")) {
                String[] arrOfStr = readLine.split("::");
                model.setToDoId(Integer.parseInt(arrOfStr[0]));
                model.setToDoDescription(arrOfStr[1]);
                model.setDueDate(arrOfStr[2]);
                model.setProject(arrOfStr[3]);
                model.setToDoStatus(arrOfStr[4]);
                list.add(model);
            }
        }
        return list;
    }

}
