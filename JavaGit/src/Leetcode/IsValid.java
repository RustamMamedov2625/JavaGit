package Leetcode;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        int countBrackets = 0;
      //  int countCurlyBrackets = 0;
      //  int countSquareBrackets = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                countBrackets++;
            else{
                if(countBrackets == 0) return false;
                countBrackets--;
                if((s.charAt(i - 1) == ')' && s.charAt(i) != '(') || (s.charAt(i - 1) == ']' && s.charAt(i) != '[')  || (s.charAt(i - 1) == '}' && s.charAt(i ) != '{')){
                    return false;
                }
            }
        }
        return countBrackets == 0;
    }
}

/*    public boolean isValid(String s) {
        Stack<Character> stackChar = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{' ){
                stackChar.push(c);
            } else {
                if(stackChar.isEmpty()) return false;
                char top = stackChar.pop();

                if((c == ')' && top != '(') || (c == ']' && top != '[')  || (c == '}' && top != '{')){
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }*/