package Codewars;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
6kyu Break camelCase
* Complete the solution so that the function will break up
  camel casing, using a space between words.
* Example
  "camelCasing"  =>  "camel Casing"
  "identifier"   =>  "identifier"
  ""             =>  ""
* */
public class Task1 {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        char character;
        for(int i = 0; i < input.length(); i++){
            character = input.charAt(i);
            if(Character.isUpperCase(character))
                result.append(" ");
            result.append(character);
        }
        return result.toString();
    }
}
