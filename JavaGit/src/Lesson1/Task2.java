package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {

    public static void task1_1(){
        System.out.println("Lesson 1 Task 2 exercise 1");
        System.out.println("Введите число этажей");
        Scanner scanner = new Scanner(System.in);
        String floorsNumbers = scanner.nextLine();
        int floors = Integer.parseInt(floorsNumbers);
        if(floors < 0)
            System.out.println("Ошибка ввода");
        else if(floors > 0 && floors < 5)
            System.out.println("Малоэтажный дом");
        else if(floors > 4 && floors < 9)
            System.out.println("Среднеэтажный дом");
        else if(floors > 8)
            System.out.println("Многоэтажный дом");

        scanner.close();
    }

    public static void task1_2() throws IOException{
        System.out.println("Lesson 1 Task 2 exercise 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberA = reader.readLine();
        System.out.println("Введите число а");
        int a = Integer.parseInt(numberA);
        System.out.println("Введите число b");
        String numberB = reader.readLine();
        int b = Integer.parseInt(numberB);
        reader.close();
        if(a >= b)
            System.out.println("Некорректный ввод");
        else {
            for(int i = a; i < 10; ++i){
                if(i % 5 == 0 && i % 10 != 0)
                    System.out.println(i);
            }
        }
        reader.close();
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
        reader.close();
        for (int i = 1; i < 10; i++)
            System.out.println(i + " x " + k + " = " + i * k);
        reader.close();
    }

}
