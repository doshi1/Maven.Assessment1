package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public boolean countPalindromes(String input){

        String reverse = "";
        int length = input.length();

        for(int i = length - 1; i >= 0; --i) {
            reverse = reverse + input.charAt(i);
        }

        if (reverse.equals(input));
        return true;
    }



}
