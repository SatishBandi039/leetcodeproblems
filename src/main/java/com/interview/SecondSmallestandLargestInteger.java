package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestandLargestInteger {

    public static void main(String args[]){

        List< Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

        List< Integer > ascNums = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(ascNums);
        Integer secondSmallest = ascNums.stream().skip(1).findFirst().orElse(0);
        System.out.println(secondSmallest);
    //    Integer secondSmallest1 = nums.stream().distinct().sorted().skip(1).findFirst().orElse(0)

        Integer secondLargestInteger = nums.stream().distinct().sorted((a,b) -> Integer.compare(b,a)).skip(1).findFirst().orElse(0);
        System.out.println(secondLargestInteger);
    }
    
}
