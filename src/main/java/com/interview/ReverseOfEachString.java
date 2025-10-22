package com.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOfEachString {

    public static void main(String args[]){

        String input = "Java 8 Rocks";

        String reversedWords = Arrays.stream(input.split(" "))
                .map(word -> new StringBuffer(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reversedWords);
    }
}
