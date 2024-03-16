package Leetcode;

public class RangeBitwiseAnd {
    public static int rangeBitwiseAnd(int left, int right){
        int result = left;
        for(int i = left + 1; i <= right; i++){
            result = result & i;
            if(result == 0)
                return 0;
        }
        return result;
    }
}

//https://leetcode.com/problems/bitwise-and-of-numbers-range/description/?envType=daily-question&envId=2024-02-21
/*
Difficult: Medium
Given two integers left and right that represent the range [left, right],
 return the bitwise AND of all numbers in this range, inclusive.

Example 1:

Input: left = 5, right = 7
Output: 4
Example 2:

Input: left = 0, right = 0
Output: 0
Example 3:

Input: left = 1, right = 2147483647
Output: 0


Constraints:

0 <= left <= right <= 231 - 1


*/