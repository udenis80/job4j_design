package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIt implements Iterator<Integer> {
    private final int[] data;
    private int point = 0;

    public ArrayIt(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return point < data.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            System.out.println("next element is empty");
            throw new NoSuchElementException();
        }
        return data[point++];
    }
}