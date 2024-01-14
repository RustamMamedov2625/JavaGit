package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        String inputNumber = reader.readLine();
        int number = Integer.parseInt(inputNumber);
        System.out.println("Факториал числа " + number + " равен: " + calculateFactorial(number));
    }

    public  static int calculateFactorial(int number){
        if(number == 0)
            return 1;
        return number * calculateFactorial(number - 1);
    }
}
