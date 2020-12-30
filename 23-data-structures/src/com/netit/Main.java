package com.netit;

import com.netit.custom_structures.MyGenericList;
import com.netit.custom_structures.MyLinkedStringList;
import com.netit.custom_structures.MyStringList;
import com.netit.todo.Todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
//        testInternalAlgorithms();
        MyGenericList<Float> list = new MyGenericList<>();
        list.add(3.4f);
        list.add(4f);
        list.add(5.5f);
        System.out.println(list.sum());

//        MyGenericList objList = new MyGenericList();
//        objList.add(new Todo());
//        String o = (String) objList.get(0);
    }

    private static void testInternalAlgorithms() {
        List<String> texts = new ArrayList<>();

        texts.add("bla");
        texts.add("proba");
        texts.add("edno dvre");
        texts.add("edno tri");
        texts.add("edno 4ri");
        texts.add("edno 4ri");
        texts.add("edno 4ri");

        texts.remove(1);
        System.out.println(texts.contains("bla"));

        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }

        Collections.sort(texts);

        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }

        Collections.reverse(texts);

        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }
    }

    private static void testMap() {
        Todo todoProgram = new Todo();
        todoProgram.addTask("Clean stove");
        todoProgram.addTask("123");
        todoProgram.addTask("345");
        todoProgram.setUser("Teo");
        todoProgram.addTask("teo's task 1");
        todoProgram.addTask("teo's task 2");
        todoProgram.addTask("teo's task 3");
        todoProgram.setUser("pesho");
        todoProgram.addTask("pesho task");
        todoProgram.setUser("Teo");
        todoProgram.addTask("teo last task");

        todoProgram.printAllTasks();
    }

    private static void testLinkedList() {
        MyLinkedStringList list = new MyLinkedStringList();

        list.add("asd");
        list.add("asd2");
        list.add("as3d");
        list.add("asd4");
        list.add("asd5");
        list.add("asd6");

        System.out.println(list.size());
    }

    private static void testMyList() {
        MyStringList texts = new MyStringList();

        texts.add("bla");
        texts.add("proba");
        texts.add("edno dvre");
        texts.add("edno tri");
        texts.add("edno 4ri");
        texts.add("edno 4ri");
        texts.add("edno 4ri");

        texts.remove(1);
        System.out.println(texts.contains("bla"));

        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }

//        for (String text : texts) {
//            System.out.println(text);
//        }
    }
}
