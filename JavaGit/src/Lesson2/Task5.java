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
            System.out.println("������� ����� ��� �������� ������ ��� stop ��� ���������� ���������");
            input = reader.readLine();
            switch (input) {
                case "������":
                case "�����������":
                case "������": {
                    System.out.println("������");
                    break;
                }
                case "���":
                case "�����":
                case "�����":{
                    System.out.println("������");
                    break;
                }
                case "������":
                case "������":
                case "ʸ���": {
                    System.out.println("��������");
                    break;
                }
                case "���������":
                case "���������":
                case "������": {
                    System.out.println("������");
                    break;
                }
                case "Stop": {
                    System.out.println("��������� ���������");
                    break;
                }
                default:
                    System.out.println("����������� �������");
            }
        }
    }

    public static void task2() throws IOException{

        System.out.println("Lesson 2 Task 5 Task 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDivisible, inputDivider;
        double divisible, divider;
        while(true){
            System.out.println("������� �������");
            inputDivisible = reader.readLine();
            System.out.println("������� ��������");
            inputDivider = reader.readLine();

            if(inputDivider.equals("0")){
                System.out.println("��������� �����������");
                break;
            }
            else {
                divisible = Integer.parseInt(inputDivisible);
                divider = Integer.parseInt(inputDivider);
                System.out.println("������� �����: " + divide(divisible, divider));
            }
        }
    }


    static public void task3() throws IOException{
        System.out.println("Lesson 2 Task 5 Task 3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDivisible, inputDivider;
        double divisible, divider;
        for(int i = 0; i < 5; i++){
            System.out.println("������� �������");
            inputDivisible = reader.readLine();
            System.out.println("������� ��������");
            inputDivider = reader.readLine();

            if(inputDivider.equals("0")){
                System.out.println("�������� ���������");
                continue;
            }
            else {
                divisible = Integer.parseInt(inputDivisible);
                divider = Integer.parseInt(inputDivider);
                System.out.println("������� �����: " + divide(divisible, divider));
            }
        }

        System.out.println("��������� ���������");
    }

    public static double divide(double divisible, double divider){
        return divisible / divider;
    }
}
