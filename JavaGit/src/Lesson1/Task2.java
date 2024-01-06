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


    }

    public static void task1_2() throws IOException{
        System.out.println("Lesson 1 Task 2 exercise 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число а");
        String numberA = reader.readLine();
        int a = Integer.parseInt(numberA);
        System.out.println("Введите число b");
        String numberB = reader.readLine();
        int b = Integer.parseInt(numberB);
        if(a >= b)
            System.out.println("Некорректный ввод");
        else {
            for(int i = a; i < b; ++i){
                if(i % 5 == 0 && i % 10 != 0)
                    System.out.print(i + " ");
            }
        }

    }

    public static void task1_3() throws IOException{
        System.out.println("Lesson 1 Task 2 exercise 3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число а");
        String numberA = reader.readLine();
        int a = Integer.parseInt(numberA);
        System.out.println("Введите число b");
        String numberB = reader.readLine();
        int b = Integer.parseInt(numberB);
        if(a >= b)
            System.out.println("Некорректный ввод");
        else {
            int i = a;
            while( i < b){
                ++i;
                if(i % 5 == 0 && i % 10 != 0)
                    System.out.print(i + " ");
            }
        }

    }
    public static void task1_4(){
        System.out.println("Lesson 1 Task 2 exercise 4");
        System.out.println("Введите число x");
        Scanner scanner = new Scanner(System.in);
        String stringX = scanner.nextLine();
        double x = Double.parseDouble(stringX);
        double y;
        if(x >= 5){
            y = (x * x - 10)/x + 7;
        }
        else if(x > -3 && x < 5){
            y = (x + 3)*(x * x - 2);
        }
        else y = 420;

        System.out.println("Значение y равно: " + y);
    }


}
