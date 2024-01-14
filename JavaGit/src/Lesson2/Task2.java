package Lesson2;
//https://telegra.ph/Massivy-I-snova-cikly-11-13
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void task1(){
        System.out.println("\nLesson 2 Task 2 exercise 1");
        char[] rustam = {'r', 'u', 's', 't', 'a', 'm'};
        System.out.println("Вариант 1 с циклом");
        for (char symbols : rustam)
            System.out.print(symbols);

        System.out.println("\nВариант 2 со строкой");
        String name = "";
        for(char symbols : rustam)
            name += symbols;

        System.out.println(name);
    }

    public static void task2() throws IOException {
        System.out.println("Lesson 2 Task 2 exercise 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArray = new int[5];
        System.out.println("Введите значения для массива");
        String inputNumbers;
        for (int i = 0; i < numbersArray.length; i++){
            System.out.println("Введите значение для " + i + "элемента");
            inputNumbers = reader.readLine();
            numbersArray[i] = Integer.parseInt(inputNumbers);
        }
        System.out.println("Сумма 0 элемента" + " и " + (numbersArray.length - 1) + " элемента равна: " + (numbersArray[0] + numbersArray[numbersArray.length - 1]));
        for(int i = 1; i < numbersArray.length; i++){
            System.out.println("Сумма " + i + " элемента" + " и " + (i - 1) + " элемента равна: " + (numbersArray[i] + numbersArray[i - 1]));
        }
    }

    public  static void task3(){
        System.out.println("Lesson 2 Task 2 exercise 3");
        int[] numbersArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int sumOfNumbers = 0;
        for (int number : numbersArray)
            sumOfNumbers += number;

        System.out.println("Сумма простых чисел массива равна: " + sumOfNumbers);
    }
}
