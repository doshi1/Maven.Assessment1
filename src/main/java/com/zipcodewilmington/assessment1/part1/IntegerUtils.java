package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int result = 0;
        for(int i =0 ; i <= n; i++)
            result+= i;
        return result;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int result = 1;
        for(int i =1 ; i <= n; i++)
            result*= i;
        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        /*String str1 = Integer.toString(val);
        Integer int1 = Integer.parseInt(str1);
        String reverse = "";
        int length = str1.length();

        for(int i = length - 1; i >= 0; --i) {
            reverse = reverse + str1.charAt(i);
        }

        return int1; */
        int rev_num = 0;
        while (val > 0)
        {
            rev_num = rev_num*10 + val%10;
            val = val/10;
        }
        return rev_num;
    }
}
