package com.twopointerspattern;

import java.util.Arrays;

public class TwoSumSortedArray {

    public static void main(String args[]){
        int[] nums = {2,8,11,15};
    System.out.println(twoSum(nums,9));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println(numbers[left+1]+ " "+ numbers[right+1]);
                System.out.println(Arrays.toString(new int[]{left + 1, right + 1}));
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target)
                left++;
            else
                right--;
        }

        return new int[0];
    }

}
