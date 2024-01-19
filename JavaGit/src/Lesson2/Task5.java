package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void task1() throws IOException {
        System.out.println("Lesson 2 Task 5 Task 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while(!input.equals("Stop")) {
            System.out.println("Введите город для указания страны или stop для завершения программы");
            input = reader.readLine();
            switch (input) {
                case "Москва":
                case "Владивосток":
                case "Ростов": {
                    System.out.println("Россия");
                    break;
                }
                case "Рим":
                case "Милан":
                case "Турин":{
                    System.out.println("Италия");
                    break;
                }
                case "Берлин":
                case "Мюнхен":
                case "Кёльн": {
                    System.out.println("Германия");
                    break;
                }
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон": {
                    System.out.println("Англия");
                    break;
                }
                case "Stop": {
                    System.out.println("Программа завершена");
                    break;
                }
                default:
                    System.out.println("Неизвестные символы");
            }
        }
    }

    public static void task2() throws IOException{

        System.out.println("Lesson 2 Task 5 Task 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDivisible, inputDivider;
        double divisible, divider;
        while(true){
            System.out.println("Введите делимое");
            inputDivisible = reader.readLine();
            System.out.println("Введите делитель");
            inputDivider = reader.readLine();

            if(inputDivider.equals("0")){
                System.out.println("Программа остановлена");
                break;
            }
            else {
                divisible = Integer.parseInt(inputDivisible);
                divider = Integer.parseInt(inputDivider);
                System.out.println("Деление равно: " + divide(divisible, divider));
            }
        }
    }


    static public void task3() throws IOException{
        System.out.println("Lesson 2 Task 5 Task 3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDivisible, inputDivider;
        double divisible, divider;
        for(int i = 0; i < 5; i++){
            System.out.println("Введите делимое");
            inputDivisible = reader.readLine();
            System.out.println("Введите делитель");
            inputDivider = reader.readLine();

            if(inputDivider.equals("0")){
                System.out.println("Итерация пропущена");
                continue;
            }
            else {
                divisible = Integer.parseInt(inputDivisible);
                divider = Integer.parseInt(inputDivider);
                System.out.println("Деление равно: " + divide(divisible, divider));
            }
        }

        System.out.println("Программа завершена");
    }

    public static double divide(double divisible, double divider){
        return divisible / divider;
    }
}
