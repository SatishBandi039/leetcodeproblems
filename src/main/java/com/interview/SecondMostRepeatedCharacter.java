package com.interview;

import java.util.*;
import java.util.stream.Collectors;

public class SecondMostRepeatedCharacter {

    public static void main(String args[]){
        String s = "AAABBCC";
        secondMostRepeatedChar1(s);

//        Map<Character, Integer> map = new HashMap<>();
//        char[] chars = s.toCharArray();
//        for(char c : chars){
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//        List<Map.Entry> entryList = new ArrayList<>(map.entrySet());
//        entryList.stream().sorted((a1, a2) ->  ((int)a2.getValue() - (int)
//                        a1.getValue()))
//                .collect(Collectors.toList());
//        System.out.println(entryList);
//
//        List<Map.Entry> entryList2 = entryList.stream().skip(1).limit(1).collect(Collectors.toList());
//
//        System.out.println(entryList2);
    }

    public static void secondMostRepeatedChar(String str){
        HashSet<Character> chrs = new HashSet<>();
        List<Character> duplicates = str.chars().mapToObj(c-> Character.toLowerCase((char)c))
                .filter( c -> !chrs.add(c)).collect(Collectors.toList());

        if(duplicates.size() >= 2)
            System.out.println("Second duplicate: " + duplicates.get(1));
        else
            System.out.println("Second duplicate not found.");
    }

    public static void secondMostRepeatedChar1(String str){

        Map<Character, Long> map = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()));
        List<Character> duplicates = map.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        if(duplicates.size() >= 2)
            System.out.println("Second duplicate: " + duplicates.get(1));
        else
            System.out.println("Second duplicate not found.");
    }
}

