package com.netit.custom_structures;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class MyGenericList<T extends Number> {

    private Object[] data;
    private int lastEmptyCell;

    public MyGenericList() {
        data = new Object[5];
        lastEmptyCell = 0;
    }

    public void add(T item) {
        data[lastEmptyCell] = item;
        lastEmptyCell++;

        if(data.length == lastEmptyCell) {
            expandArray();
        }
    }

    public double sum() {
        Optional<Number> reduce = Arrays
                .stream(data)
                .filter(Objects::nonNull)
                .map(o -> (Number) o)
                .reduce((number, number2) -> number.doubleValue() + number2.doubleValue());
        return reduce.get().doubleValue();
    }

    private void expandArray() {
        Object[] biggerArray = new Objects[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            biggerArray[i] = data[i];
        }
        data = biggerArray;
    }

    public int size() {
        return lastEmptyCell;
    }

    public boolean contains(T item) {
        for (Object arrItem : data) {
            if(arrItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void remove(int index) {
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        lastEmptyCell--;
    }
}
