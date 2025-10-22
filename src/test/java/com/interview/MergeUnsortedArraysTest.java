package com.interview;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeUnsortedArraysTest {

    @Test
    void testMergeSortAsc() {
        int[] a = {5, 1, 8};
        int[] b = {7, 3, 9};

        int[] expectedAsc = {1, 3, 5, 7, 8, 9};

        int[] mergeSortAsc = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .toArray();

        assertArrayEquals(expectedAsc, mergeSortAsc, "Ascending merge sorted array");
    }

    @Test
    void testMergeSortDsc() {
        int[] a = {5, 1, 8};
        int[] b = {7, 3, 9};

        int[] expectedDsc = {9, 8, 7, 5, 3, 1};

        int[] mergeSortDsc = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        assertArrayEquals(expectedDsc, mergeSortDsc, "Descending merge sorted array");
    }
}
