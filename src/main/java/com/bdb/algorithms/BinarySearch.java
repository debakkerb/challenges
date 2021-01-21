package com.bdb.algorithms;

import java.util.Comparator;

public class BinarySearch<T> {
    private final T[] items;
    private final Comparator<T> comparator;

    public BinarySearch(T[] items, Comparator<T> comparator) {
        this.items = items;
        this.comparator = comparator;
    }

    public int search(T item) {
        int left = 0;
        int right = items.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            T temp = items[middle];

            int compare = comparator.compare(temp, item);

            if (compare == 0) {
                return middle;
            }

            if (compare < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

}
