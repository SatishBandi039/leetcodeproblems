package com.interview;

import java.util.*;
import java.util.stream.Collectors;

public class MostRepeatedNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 3, 1, 4, 4, 4);

        Map<Integer, Long> map = numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        System.out.println("key value pair for list is "+map);

        Optional<Integer> mostRepeated = numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

        System.out.println("Most repeated number: " + mostRepeated.orElse(null));
    }
}
