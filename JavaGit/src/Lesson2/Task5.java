package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void task1() throws IOException {
        System.out.println("Lesson 2 Task 5 Task 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while(!input.equals("Stop")) {
            System.out.println("Введите город для указания страны или stop для завершения программы");
            input = reader.readLine();
            if (input.equals("Москва") || input.equals("Владивосток") || input.equals("Ростов")) {
                System.out.println("Россия");
            }
            if (input.equals("Рим") || input.equals("Милан") || input.equals("Турин")) {
                System.out.println("Англия");
            }
            if (input.equals("Берлин") || input.equals("Мюнхен") || input.equals("Кёльн")) {
                System.out.println("Германия");
            }
            if (input.equals("Stop")) {
                System.out.println("Программа завершена");
            }
        }
    }

    public static void task2(){

    }

    static public void task3(){

    }
}
