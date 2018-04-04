package com.example.huyle.lab5;

/**
 * Created by Huy Le on 4/4/18.
 */
public class ToDoData {
    int ToDoID;
    String ToDoTaskDetails, ToDoTaskPrority, DueTo;

    public int getToDoID() {
        return ToDoID;
    }

    public void setToDoID(int toDoID) {
        ToDoID = toDoID;
    }

    public String getToDoTaskDetails() {
        return ToDoTaskDetails;
    }

    public void setToDoTaskDetails(String toDoTaskDetails) {
        ToDoTaskDetails = toDoTaskDetails;
    }

    public String getToDoTaskPrority() {
        return ToDoTaskPrority;
    }

    public void setToDoTaskPrority(String toDoTaskPrority) {
        ToDoTaskPrority = toDoTaskPrority;
    }

    public String getDueTo() {return DueTo; }

    public void setDueTo (String dueTo) {DueTo = dueTo; }



    @Override
    public String toString() {
        return "ToDoData {id-" + ToDoID + ", taskDetails-" + ToDoTaskDetails + ", priority-" + ToDoTaskPrority + ", Due to" + DueTo + "}";
    }

}
