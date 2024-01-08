package Codewars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*System.out.println("¬ведите строку дл€ Task1");
        System.out.println( Task1.camelCase(new String(reader.readLine())) );
        */
        System.out.println("¬ведите строку дл€ Task2");
        System.out.println(Task2.reverseWords(new String(reader.readLine())));
    }
}
