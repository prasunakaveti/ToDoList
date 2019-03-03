package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-02-27
 *
 */

import java.util.Date;

public class Model {
    private int toDoId;
    private String toDoDescription;
    private String toDoStatus;
    private String dueDate;
    private String project;

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
}
