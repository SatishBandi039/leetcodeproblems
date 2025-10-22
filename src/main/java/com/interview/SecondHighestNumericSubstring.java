package com.interview;

import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SecondHighestNumericSubstring {
    public static void main(String[] args) {
        String[] input = {"ab12cd", "cd34df", "df56de"};

        // Extract all numeric substrings
        List<Integer> numbers = Arrays.stream(input)
                .flatMap(s -> {
                    Matcher matcher = Pattern.compile("\\d+").matcher(s);
                    List<String> nums = new ArrayList<>();
                    while (matcher.find()) {
                        System.out.println("matcher.group "+matcher.group());
                        nums.add(matcher.group());
                    }
                    return nums.stream();
                })
                .map(Integer::parseInt)
                .distinct() // remove duplicates if any
                .collect(Collectors.toList());

        // Find second highest number
        Integer secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest); // Output: 34
    }
}
