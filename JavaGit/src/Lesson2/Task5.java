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
            if (input.equals("������") || input.equals("�����������") || input.equals("������")) {
                System.out.println("������");
            }
            if (input.equals("���") || input.equals("�����") || input.equals("�����")) {
                System.out.println("������");
            }
            if (input.equals("������") || input.equals("������") || input.equals("ʸ���")) {
                System.out.println("��������");
            }
            if (input.equals("Stop")) {
                System.out.println("��������� ���������");
            }
        }
    }

    public static void task2(){

    }

    static public void task3(){

    }
}
