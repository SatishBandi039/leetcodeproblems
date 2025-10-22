package com.twopointerspattern;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};

//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
        System.out.println("after moving the zeros "+ Arrays.toString(moveZeroes(nums)));

    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
//                nums[i] = nums[j];
//                if (i != j) nums[j] = 0;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return nums;
    }

}
