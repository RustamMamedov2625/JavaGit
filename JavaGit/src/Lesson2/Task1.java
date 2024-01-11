package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://telegra.ph/Cikly-11-13
public class Task1 {
    public  static  void task1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String inputNumber = reader.readLine();
        int number = Integer.parseInt(inputNumber);
        int result = 1;
        for(int i = 1; i <= number; i++)
            result *= i;

        System.out.println("Факториал числа" + number + "равен: " + result);
    }

    public static void task2() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String inputNumber = reader.readLine();
        int number = Integer.parseInt(inputNumber);
        int result = 0;

        while(number % 10 != 0){
            result += (number % 10);
            number /= 10;
        }
        System.out.println("Сумма цифр данного числа равна: " + result);
    }

    public static void task3() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину прямоугольника: ");
        String inputLength = reader.readLine();
        int length = Integer.parseInt(inputLength);

        System.out.println("Введите ширину прямоугольника: ");
        String inputWidth = reader.readLine();
        int width = Integer.parseInt(inputWidth);
        System.out.println("Прямоугольник построен: ");
        for(int i = 0; i < length; i++ ){

            if(i == 0 || i == length - 1) {
                System.out.print(" ");
                for (int j = 0; j < width; j++)
                    System.out.print("-");
                System.out.print(" ");
                System.out.println("");
            }
            else {
                System.out.print("|");
                for (int j = 0; j < width; j++)
                    System.out.print(" ");
                System.out.print("|");
                System.out.println("");
            }

        }
    }

    public static void task4() throws IOException{

    }
}
