package com;




import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args){

        String[] fruits = {"Mango", "Banana", "Mango", "Apples", "Berries"};

       List<String> fruitsList = Arrays.asList(fruits);
        Map<String, Long> fruitsMap = fruitsList.stream()
              .collect(Collectors.groupingBy(fruit -> fruit, LinkedHashMap::new,
                      Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e2,e1) -> e1, LinkedHashMap::new));

        System.out.println(fruitsMap);

        Map<String, Long> sorted = fruitsMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

//        List<Map.Entry<String, Long>> entryList = new ArrayList<>(fruitsMap.entrySet());
//
//        entryList.sort(Map.Entry.comparingByValue());
//
//        Map<String, Long> linkMap = new LinkedHashMap<>();
//
//        for(Map.Entry<String, Long> entry :entryList){
//            linkMap.put(entry.getKey(), entry.getValue());
//        }

//        Optional<String>  fruit = fruitsMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
//        if(fruit.isPresent()) {
//            System.out.println(fruit);
//        }
//        System.out.println(entryList);
//        System.out.println(linkMap);

        System.out.println(sorted);

    }


}