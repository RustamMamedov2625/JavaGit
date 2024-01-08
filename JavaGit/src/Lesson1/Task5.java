package Lesson1;
//Task 5 from URL below:
// https://telegra.ph/Preobrazovanie-tipov-uslovnye-konstrukcii-i-nemnogo-o-strokah-11-11
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Task5 {
    public static void task1 ()throws IOException {
        System.out.println("Lesson 1 Task 5 exercise 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите число a");
        String inputA = reader.readLine();
        int a = Integer.parseInt(inputA);
        System.out.println("¬ведите число b");
        String inputB = reader.readLine();
        int b = Integer.parseInt(inputB);

        System.out.println(a % 2 == 0 ? a * b : a / b);

        String output = a == b ? "„исла равны!" : "";
        System.out.println(output);
    }

    public static void task2() throws IOException{
        System.out.println("Lesson 1 Task 5 exercise 2");
        System.out.println("Paragraph 1");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if(input.equals("Hi"))
            System.out.println("Hello \n");
        else if(input.equals("Bye"))
            System.out.println("Good bye\n");
        else if(input.equals("How are you"))
            System.out.println("How are you doing \n");
        else
            System.out.println("Unknown message\n");

        System.out.println("Paragraph 2");
        switch (input){
            case "Hi":
                System.out.println("Hello\n");
                break;
            case "Bye":
                System.out.println("Goodbye\n");
                break;
            case "How are you":
                System.out.println("How are you doing\n");
                break;
            default:
                System.out.println("Unknown message \n");
                break;
        }
    }

    public static void task3(){
        System.out.println("Lesson 1 Task 5 exercise 3");

        String surname = "Mamedov";
        String name = "Rustam";
        String patronymic = "Nuraddin oglu";


        System.out.println("Paragraph 1");
        System.out.println(surname + " " + name + " " + patronymic + "\n");

        System.out.println("Paragraph 2");
        System.out.printf("%s %s %s\n\n", surname, name, patronymic);

    }

    public static void task4() throws IOException{
        System.out.println("Lesson 1 Task 5 exercise 4");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите число a");
        String inputA = reader.readLine();
        int a = Integer.parseInt(inputA);
        System.out.println("¬ведите число b");
        String inputB = reader.readLine();
        int b = Integer.parseInt(inputB);

        if(a % 2 == 0 || b % 3 == 0)
            System.out.println("a > b " + (a > b));
        if(a % 2 == 0 && a % 3 == 0) {
            if (Math.pow(a, b) < Integer.MIN_VALUE || Math.pow(a, b) > Integer.MAX_VALUE)
                System.out.println("–езультат выражени€ слишком большой!");
            else
                System.out.println(Math.pow(a, b));
        }
    }

}
