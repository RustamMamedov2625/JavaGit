package Lesson2;

public class Task4Task2Sum {
    public static void main(String[] args) {
        System.out.println("Сумма чисел типа byte {10, 4, 20, 30, 50} равна: " + sum(new byte[]{10, 4, 20, 30, 50}));

        System.out.println("Сумма чисел типа short {100, 40, 200, 300, 500} равна: " + sum(new short[]{100, 40, 200, 300, 500}));

        System.out.println("Сумма чисел типа int {1000, 400, 2000, 3000, 5000} равна: " + sum(new int[]{1000, 400, 2000, 3000, 5000}));

        System.out.println("Сумма чисел типа long {10000, 4000, 20000, 30000, 50000} равна: " + sum(new long[]{10000, 4000, 20000, 30000, 50000}));

        System.out.println("Сумма чисел типа float {0.08, 0.09, 0.04, 0.012, 0.09044} равна: " + sum(new float[]{0.008f, 0.09f, 0.04f, 0.012f, 0.01f}));

        System.out.println("Сумма чисел типа double {0.0812, 0.090002, 0.010232, 0.003213, 0.01231} равна: " + sum(0.0812, 0.090002, 0.010232, 0.03213, 0.01231));

        System.out.println("Сумма чисел типа char {true, true, true} равна: " + sum(new boolean[]{true, true, true}));

        System.out.println("Сумма чисел типа char {h, e, l, l, o } равна: " + sum(new short[]{100, 40, 200, 300, 500}));
    }

    public static byte sum(byte... numbers){
        byte result = 0;
        for (byte number : numbers) {
            if (result < Byte.MIN_VALUE || result > Byte.MAX_VALUE || number < Byte.MIN_VALUE || number > Byte.MAX_VALUE){
                System.out.println("Переполнение типа byte");
                break;
            }
            else result += number;
        }

        return result;
    }
    public static short sum(short... numbers){
        short result = 0;
        for (short number : numbers) {
            if (result < Short.MIN_VALUE || result > Short.MAX_VALUE || number < Short.MIN_VALUE || number > Short.MAX_VALUE){
                System.out.println("Переполнение типа short");
                break;
            }
            else result += number;
        }
        return result;
    }

    public static int sum(int... numbers){
        int result = 0;
        for (int number : numbers) {
            if (result < Integer.MIN_VALUE  || result > Integer.MAX_VALUE || number < Integer.MIN_VALUE  || number > Integer.MAX_VALUE){
                System.out.println("Переполнение типа int");
                break;
            }
            else result += number;
        }

        return result;
    }

    public static long sum(long... numbers){
        long result = 0;
        for (long number : numbers) {
            if (result < Long.MIN_VALUE  || result > Long.MAX_VALUE || number < Long.MIN_VALUE  || number > Long.MAX_VALUE){
                System.out.println("Переполнение типа long");
                break;
            }
            else result += number;
        }

        return result;
    }

    public static float sum(float... numbers){
        float result = 0f;
        for (float number : numbers) {
            result += number;
        }
        return result;
    }

    public static double sum(double... numbers){
        double result = 0;
        for (double number : numbers) {
            result += number;
        }

        return result;
    }

    public static boolean sum(boolean... expressions){
        boolean result = true;
        for (boolean expression: expressions)
            result = result && expression;
        return result;
    }

    public static StringBuilder sum(char... symbols){
        StringBuilder result = new StringBuilder();
        for (char symbol : symbols) {
            if (symbol < Character.MIN_VALUE  || symbol > Character.MAX_VALUE){
                System.out.println("Переполнение типа int");
                break;
            }
            else result.append(String.valueOf(symbol));
        }
        return result;
    }
}
