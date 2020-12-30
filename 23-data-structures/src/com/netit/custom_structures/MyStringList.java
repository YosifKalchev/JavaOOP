package com.netit.custom_structures;

public class MyStringList {

    private String[] data;
    private int lastEmptyCell;

    public MyStringList() {
        data = new String[5];
        lastEmptyCell = 0;
    }

    public void add(String item) {
        data[lastEmptyCell] = item;
        lastEmptyCell++;

        if(data.length == lastEmptyCell) {
            expandArray();
        }
    }

    private void expandArray() {
        String[] biggerArray = new String[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            biggerArray[i] = data[i];
        }
        data = biggerArray;
    }

    public int size() {
        return lastEmptyCell;
    }

    public boolean contains(String item) {
        for (String arrItem : data) {
            if(arrItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        return data[index];
    }

    public void remove(int index) {
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        lastEmptyCell--;
    }
}
