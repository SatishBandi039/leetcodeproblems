package org.example;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args){

        String[] fruits = {"Mango", "Banana", "Mango", "Apples", "Berries"};

        List<String> fruitsList = Arrays.asList(fruits);
        Map<String, Long> fruitsMap = fruitsList.stream().collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));

        System.out.println(fruitsMap);
    }
}
