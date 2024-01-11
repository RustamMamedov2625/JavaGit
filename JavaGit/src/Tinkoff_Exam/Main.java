package Tinkoff_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значения для задачи 1");
        System.out.println(Task1.encryptPassword(new String(reader.readLine())));
        */
        Task2.foldBooks(5, new int[]{5, 4, 4, 5, 5});
    }
}
