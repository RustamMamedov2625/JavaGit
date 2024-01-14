package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3CreateFigure {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину прямоугольника: ");
        String inputLength = reader.readLine();
        int length = Integer.parseInt(inputLength);

        System.out.println("Введите ширину прямоугольника: ");
        String inputWidth = reader.readLine();
        int width = Integer.parseInt(inputWidth);
        System.out.println("Прямоугольник построен: ");

        createfFigure(length, width);
    }

    public static void createfFigure(int length, int width){
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
}
