package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4Task1 {
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            System.out.println("¬ведите строку дл€ конкатенации или \"Exit\" дл€ выхода.");
            input = reader.readLine();
            if(input.equals("Exit"))
                break;
            concatenateString(input);
        }
        System.out.println(result.toString());
    }

    public static String concatenateString(String string){
        result.append(string);
        result.append(" ");
        return result.toString().trim();
    }
}
