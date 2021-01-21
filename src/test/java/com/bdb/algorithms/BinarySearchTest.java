package com.bdb.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private Integer[] items = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    private BinarySearch<Integer> binarySearch = new BinarySearch<>(items, Integer::compareTo);

    @Test
    public void testSearch() {
        assertEquals(3, binarySearch.search(40));
    }

    @Test
    public void testSearch_notFound() {
        assertEquals(-1, binarySearch.search(120));
    }

    @Test
    public void testSearch_lowerBound() {
        assertEquals(0, binarySearch.search(10));
    }

    @Test
    public void testSearch_upperBound() {
        assertEquals(9, binarySearch.search(100));
    }
}
