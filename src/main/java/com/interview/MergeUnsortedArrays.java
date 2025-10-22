package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeUnsortedArrays {

    public static void main(String args[]){

        int[] a = {5,1,8};
        int[] b = {7,3,9};

        int[] mergeSortAsc = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted().toArray();

        System.out.println(Arrays.toString(mergeSortAsc));

//        Details of the issue:
//        Comparator.reverseOrder() works for objects that are Comparable, but IntStream works with primitive int values and does not accept a comparator argument in its sorted() method.
//
//                The sorted() method on IntStream only accepts no arguments and sorts in natural ascending order.
//
//                To use Comparator.reverseOrder(), you must first convert (box) the IntStream to Stream<Integer> which is an object stream of Integers.
//
//        After sorting the boxed stream, you must convert it back to an int[] by unboxing.

        int[] mergeSorDsc = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(mergeSorDsc));
    }
}
