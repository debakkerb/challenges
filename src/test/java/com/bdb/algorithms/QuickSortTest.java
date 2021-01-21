package com.bdb.algorithms;

import com.bdb.algorithms.sort.QuickSort;
import com.bdb.algorithms.sort.Sort;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class QuickSortTest {

    @Test
    public void testSort() {
        Sort<Integer> sort = new QuickSort<>();
        Integer[] sortedItems = sort.sort(
                new Integer[]{100, 50, 10, 5, 60},
                Integer::compareTo
        );

        assertThat(new Integer[]{5, 10, 50, 60, 100}, Matchers.arrayContaining(sortedItems));
    }

}