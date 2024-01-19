package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {
    public static void task1() throws IOException {
        System.out.println("Lesson 2 Task 6 Task 1");
        int countBigger8 = 0, countOne = 0, countEven = 0, countNotEven = 0, sum = 0;
        System.out.println("Введите размер массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 11);

        System.out.println("Длина массива: " + array.length);
        System.out.println("Элементы массива");
        for (int number: array)
            System.out.print(number + " ");

        for (int i = 0; i < array.length; i++){
            sum++;
            if(array[i] > 8)
                countBigger8++;
            if(array[i] == 1)
                countOne++;
            if(array[i] % 2 == 0)
                countEven++;
            else countNotEven++;
        }

        System.out.println("Количество чисел больше 8: " + countBigger8);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетныз чисел: " + countNotEven);
    }


    public static void task2() throws IOException{
        System.out.println("Lesson 2 Task 6 Task 1");
        int countBigger8 = 0, countOne = 0, countEven = 0, countNotEven = 0, sum = 0;
        System.out.println("Введите размер массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10000);

        System.out.println("Элементы массива");
        for (int number: array)
            System.out.print(number + " ");


        //Arrays.sort(array);
        //System.out.println("\nНаибольший элемент: " + array[array.length - 1]);
        // System.out.println("Наименьший элемент: " + array[0]);
        // OR bellow
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int number : array){
            if(min > number)
                min = number;
            if(max < number)
                max = number;
        }

        System.out.println("\nНаибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);


        int sumNumberEnds0 = 0, countNumberEnds0 = 0;
        for (int number : array){
            if(number % 10 == 0){
                sumNumberEnds0 += number;
                countNumberEnds0++;
            }
        }

        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countNumberEnds0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sumNumberEnds0);
    }


    public static void task3() {
        int[][] array = new int[12][8];
        int[] sumArrayLines = new int[12];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 50);
                sumArrayLines[i] += array[i][j];
            }
        }
        //Arrays.sort(sumArrayLines);
        int max = Integer.MIN_VALUE, indexMaxSum = 0;
        for (int i = 0; i < sumArrayLines.length; i++){
            if(max <= sumArrayLines[i]) {
                indexMaxSum = i;
                max = sumArrayLines[i];
            }
        }
        //Print array to check the program
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("\nСтрока с максимальной суммой элементов равна: " + indexMaxSum);
    }


    public static void task4(){
        int[] array = new int[10];
        int[] arrayTripleSum = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < array.length - 1; i++){
            arrayTripleSum[i - 1] = array[i - 1] + array[i] + array[i + 1];
            System.out.println("arrayTripleSum[" + i + " - 1] = array[" + i + " - 1] + array[" + i + "] + array[" + i + "+ 1]; "
                    + arrayTripleSum[i - 1] + " = " + array[i - 1] + " + " + array[i] + " + " + array[i + 1]);

        }
        for (int i = 0; i < arrayTripleSum.length ; i++)
            System.out.print(arrayTripleSum[i] + " ");

        System.out.println("");
        int maxSum = Integer.MIN_VALUE, maxIndex = 0;
        for(int i = 0; i < arrayTripleSum.length; i++){
            if(maxSum < arrayTripleSum[i]){
                maxSum = arrayTripleSum[i];
                maxIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxIndex);
    }




}
