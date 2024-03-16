package Leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        // �������������� ��������� ���������
        int start = 0;

        // �������� �� ������
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            // ���� ������ ��� ���������� � ��� ��������� ��������� ��������� � ��������� �� start �� ������� �������
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                // ��������� ������ ������� ���������
                start = charMap.get(currentChar) + 1;
            }

            // ��������� ��������� ���������� ��������� �������
            charMap.put(currentChar, end);

            // ��������� maxLength, ���� ������� ����� ��������� ��� ������������� �������� ������ maxLength
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

/*3. Longest Substring Without Repeating Characters
Medium
Topics
Companies
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/