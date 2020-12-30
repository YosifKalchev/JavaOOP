package com.netit.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo {

    private String currentUser = "default_user";
    private Map<String, List<String>> userTasks;

    public Todo() {
        userTasks = new HashMap<>();
    }

    public void addTask(String task) {
        if(userTasks.containsKey(currentUser)) {
            List<String> thisUserTasks = userTasks.get(currentUser);
            thisUserTasks.add(task);
        } else {
            List<String> thisUserTasks = new ArrayList<>();
            thisUserTasks.add(task);
            userTasks.put(currentUser, thisUserTasks);
        }
    }

    public void setUser(String userName) {
        currentUser = userName;
    }

    public void printAllTasks() {
        for(String user : userTasks.keySet()) {
            System.out.println("Printing for user " + user);
            List<String> thisUserTasks = userTasks.get(user);
            for (String task : thisUserTasks) {
                System.out.println(task);
            }
        }
    }
}
