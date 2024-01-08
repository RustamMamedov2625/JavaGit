package Lesson1;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Task1 1 tasks from 1.docx
public class Task1 {
    public static void task1_1(){
        System.out.println("Lesson 1 Task 1 exercise 1");
        int i = 0;
        while(i < 10){
            System.out.print("JAVA ");
            i++;
        }
    }

    public static void task1_2(){
        System.out.println("Lesson 1 Task 1 exercise 2");
        for(int i = 0; i < 10; i++)
            System.out.println("JAVA ");
    }
    public static void task1_3(){
        System.out.println("Lesson 1 Task 1 exercise 3");
        int i = 0;
        while(i < 10){
            System.out.println("JAVA");
            i++;
        }
    }
    public static void task1_4(){
        System.out.println("Lesson 1 Task 1 exercise 4");
        int year = 1980;
        while(year < 2021){
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }

    public static void task1_5(){
        System.out.println("Lesson 1 Task 1 exercise 5");
        for(int year = 1980; year < 2021; year += 4)
            System.out.println("Олимпиада " + year + " года");
    }

    public static void task1_6() throws IOException {
        System.out.println("Lesson 1 Task 1 exercise 6");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите цифру от 1 до 9");
        String digit = reader.readLine();
        int k = Integer.parseInt(digit);
        for (int i = 1; i < 10; i++)
            System.out.println(i + " x " + k + " = " + i * k);
    }
}
