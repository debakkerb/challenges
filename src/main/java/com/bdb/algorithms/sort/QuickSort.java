package com.bdb.algorithms.sort;

import java.util.Comparator;

public class QuickSort<T> implements Sort<T> {
    private T[] items;
    private Comparator<T> comparator;

    @Override
    public T[] sort(T[] items, Comparator<T> comparator) {
        this.items = items;
        this.comparator = comparator;

        quickSort(0, this.items.length - 1);

        return items;
    }

    private void quickSort(int start, int finish) {
        if (start < finish) {
            int pivotIdx = pivot(start, finish);
            quickSort(start, pivotIdx - 1);
            quickSort(pivotIdx + 1, finish);
        }
    }

    private int pivot(int start, int finish) {
        T pivot = this.items[finish];
        int tailIdx = start;

        for (int idx = start; idx < finish; idx++) {
            if (comparator.compare(this.items[idx], pivot) < 0) {
                swap(tailIdx, idx);
                tailIdx++;
            }
        }

        swap(tailIdx, finish);
        return tailIdx;
    }

    private void swap(int idxA, int idxB) {
        T temp = this.items[idxA];
        this.items[idxA] = this.items[idxB];
        this.items[idxB] = temp;
    }
}
