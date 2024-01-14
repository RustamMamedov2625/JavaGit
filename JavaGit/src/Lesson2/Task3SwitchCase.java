package Lesson2;

import java.util.Scanner;

/**
 * �������� ���������, ������� ��������� ������ � ����������.
 * ���� ������ == "Hi" - ������� � ������� "Hello",
 * ���� Bye - Good bye,
 * ���� How are you - How are your doing.
 * ���� ����� ������ ������ - ������� Unknown message.
 * ������� ����� switch-case
 */
public class Task3SwitchCase {
    public static void main(String[] args) {
//        ������� ������ ��� ������ � ����������
        Scanner scanner = new Scanner(System.in);

//        ������� ��������� "Enter string: " � �������.
//        ������ ��������� �� �������� ������������, ���� ����������� ������������,
//        ����� �������� �� ���� ���������
        System.out.print("Enter string: ");
//        ��������� ���������� s ���� String � ���������� � ��� ��������, ��������� � ����������
        String s = scanner.nextLine();

//        ������ ����� �� ������������, �� ���������� �������.
//        ����� - ����������, ����� ����� ������� I/O Streams
        scanner.close();
        switchCase(s);
//        ���������� ����������� switch-case ��� ���������� s

    }

    public static void switchCase(String s){
        switch (s) {
            case "Hi":  // ���� s ����� "Hi"
//                ������� � ������� "Hello"
                System.out.println("Hello");
//                �������� �������� break, ����� ����� �� switch-case
                break;

            case "Bye":
                System.out.println("Good bye");
                break;

            case "How are you":
                System.out.println("How are your doing");
                break;

            default:  // ���� �������� s �� ��������� �� � ����� ������
                System.out.println("Unknown message");
        }
    }
}