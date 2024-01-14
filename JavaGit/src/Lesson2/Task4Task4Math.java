package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4Task4Math {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        String inputNumber = reader.readLine();
        int number = Integer.parseInt(inputNumber);
        System.out.println("Выражение числа " + number + " равно: " + calculateMathExpression(number));
    }

    public static double calculateMathExpression(int number){
        if(number < 0){
            System.out.println("Ошибка, число " + number + " меньше 0");
            return 0D;
        }else if(number == 0D)
            return 0;
        return Math.pow(number + calculateMathExpression(number - 1),  0.5);
    }
}
