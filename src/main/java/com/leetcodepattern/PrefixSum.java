package com.leetcodepattern;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String args[]){
        int arr[] ={10, 20, 10, 5, 15};

        int prefixsum[] = buildPrefixSum(arr);
        System.out.println(Arrays.toString(prefixsum));

    }

    public static int[] buildPrefixSum(int[] numbers){

        int n = numbers.length;
        int[] prefixsum = new int[n];
        prefixsum = numbers;

        for(int i=1; i<numbers.length; i++){
            prefixsum[i] = prefixsum[i-1] + numbers[i];
        }
        return  prefixsum;
    }
}
