package com.core;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String args[]) {
        RomanToInteger romanToInteger = new RomanToInteger();
       // romanToInteger.romanToInt("LVI");
        romanToInteger.romanToInt("IVL");

    }

        public int romanToInt(String s) {
            Map<Character, Integer> romanValues = new HashMap<>();
            romanValues.put('I',1);
            romanValues.put('V',5);
            romanValues.put('X',10);
            romanValues.put('L',50);
            romanValues.put('C',100);
            romanValues.put('D',500);
            romanValues.put('M',1000);

            int result = 0;
            int prevValue = 0;

            // Iterate through the string from right to left
            for (int i = s.length() - 1; i >= 0; i--) {
                int currValue = romanValues.get(s.charAt(i));
                System.out.println("current value is "+currValue);

                if (currValue >= prevValue) {
                    result += currValue;
                    System.out.println(i+"element  is greaterthan or equal to "+result);
                }
                // If current value is less than previous value,
                // subtract it from result (handles cases like IV, IX, etc.)
                else {
                    result -= currValue;
                    System.out.println(i+"element  is lessthan or equal to"+result);
                }

                prevValue = currValue;
            }
            System.out.println("actual value is "+result);
            return result;


            }

}
