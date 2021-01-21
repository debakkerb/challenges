package com.bdb.algorithms.sort;

import java.util.Comparator;

public interface Sort<T> {
    T[] sort(T[] items, Comparator<T> comparator);
}
