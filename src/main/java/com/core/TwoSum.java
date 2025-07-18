package com.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] nums = {2,7,11,15};
    static int target = 9;

    public static void main(String args[]){
        TwoSum twoSum = new TwoSum();
       // System.out.println(Arrays.toString(twoSum.twoSumBasic(nums,target)));
        System.out.println(Arrays.toString(twoSum.twoSumUsingMap(nums,target)));

    }

    int[] twoSumBasic(int[] numbers, int target1){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length-1; j++){
                if(numbers[i] + numbers[j] == target1){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    int[] twoSumUsingMap(int[] numbers, int target1){
        if(numbers == null || numbers.length <2)
            return new int[]{};
        Map<Integer, Integer> map = new HashMap<>(numbers.length);
        for (int i=0; i<numbers.length; i++) {
            int complement = target1 - numbers[i];
            if(map.containsKey(complement)){
                System.out.println(Arrays.toString(new int[]{map.get(complement),i}));
                return new int[]{map.get(complement),i};
            }
            map.put(numbers[i],i);
            System.out.println(map);
        }
        return null;
    }
}
