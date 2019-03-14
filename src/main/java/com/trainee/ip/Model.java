package com.trainee.ip;
/* *
 * Model class is a POJO(Plain Old Java Object) class
 * Model object works as a Database model for this application
 * It holds task attributes and getter and setter methods
 * Each task has Integer Id,
 * task Description,status, due date and project name are String type
 * Created by @ gnanaprasunakaveti on 2019-02-27
 */

public class Model {
    private int toDoId;
    private String toDoDescription;
    private String toDoStatus;
    private String dueDate;
    private String project;

    //All instance variables should be private in POJO

    public int getToDoId() {
        return toDoId;
    }

    public void setToDoId(int toDoId) {
        this.toDoId = toDoId;
    }

    public String getToDoDescription() {
        return toDoDescription;
    }

    public void setToDoDescription(String toDoDescription) {
        this.toDoDescription = toDoDescription;
    }

    public String getToDoStatus() {
        return toDoStatus;
    }

    public void setToDoStatus(String toDoStatus) {
        this.toDoStatus = toDoStatus;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    //All getter and setter methods are public in POJO
}
