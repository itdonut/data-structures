package org.example.impl.dynamic_array;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray <T> implements Iterable<T> {
    private T[] array;
    private int length = 0;
    private int capacity = 0;

    public DynamicArray() {
        this(16);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Wrong capacity { %d } of the array".formatted(capacity));
        }
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public T get(int index) {
        if (index > this.length) {
            throw new IllegalArgumentException("Index { %d } is out of bound".formatted(index));
        }
        return this.array[index];
    }

    public void set(int index, T element) {
        if (index > this.length) {
            throw new IllegalArgumentException("Index { %d } is out of bound".formatted(index));
        }
        this.array[index] = element;
    }

    public int size() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void clear() {
        for (int i = 0; i < this.capacity; i++) {
            this.array[i] = null;
        }
        this.length = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
