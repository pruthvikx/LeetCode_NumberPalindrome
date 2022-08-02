package com.company;

public class Solution {
    public boolean isPalindrome(int x){
        int temp;
        int sum = 0;
        int remainder;

        temp = x;

        if (x < 0){
            return false;
        }

        while (x != 0){
            remainder = x % 10;
            sum = (sum * 10) + remainder;
            x /= 10;
        }
        if (temp == sum){
            return true;
        }
        return false;
    }
}
