package Lesson1;
// Task from URL below:
//https://telegra.ph/Konsolnyj-vvodvyvod-Arifmeticheskie-operacii-operacii-prisvoeniya-Uslovnye-vyrazheniya-11-11
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void task1() throws IOException {
        System.out.println("Lesson 1 Task 4 exercise 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите значение а");
        String inputA = reader.readLine();
        double a = Double.parseDouble(inputA);
        System.out.println("¬ведите значение b");
        String inputB = reader.readLine();
        double b = Double.parseDouble(inputB);

        double c = b * a * (a + b) / (a * a);
        System.out.println(c);

        int intA = (int) a;
        int intB = (int) b;
        c = b * a * (a + b) / (a * a);
        System.out.println(c);

    }

    public static void task2() throws IOException{
        System.out.println("Lesson 1 Task 4 exercise 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите значение а");
        String inputA = reader.readLine();
        int a = Integer.parseInt(inputA);
        System.out.println("¬ведите значение b");
        String inputB = reader.readLine();
        int b = Integer.parseInt(inputB);

        boolean comparisonResult = a * a * a > b * b;
        System.out.println(comparisonResult);
    }

    public  static void task3(){
        System.out.println("Lesson 1 Task 4 exercise 1");
        int a = 1;
        int b = a++;
        b += a++;

        System.out.println(b);
    }
}
