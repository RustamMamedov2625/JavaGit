package Lesson2;

public class Task4Task5CheckPrime {
    public static void main(String[] args) {
        int[] arrayPrimeNumbers = new int[10];
        makePrimes(arrayPrimeNumbers, 2, 0);

        System.out.println("Первые 10 простых чисел: ");
        for (int primeNumber : arrayPrimeNumbers){
            System.out.print(primeNumber + " ");
        }
        System.out.println("\n");
        System.out.println("\nСумма первых 10 простых чисел: " + sumArray(arrayPrimeNumbers, 0));
    }

    public static void makePrimes(int[] arrayPrimeNumbers,  int currentNumber, int index) {
        if(index < arrayPrimeNumbers.length){
            if(checkPrime(currentNumber, 2)){
                arrayPrimeNumbers[index] = currentNumber;
                makePrimes(arrayPrimeNumbers, currentNumber + 1, index + 1);
            }
            else {
                makePrimes(arrayPrimeNumbers, currentNumber + 1, index);
            }
        }
    }

    public static boolean checkPrime(int number, int divisor) {
        if (divisor <= Math.sqrt(number)) {
            if (number % divisor == 0) {return false;}
            else { return checkPrime(number, divisor + 1); }
        }
        else { return true; }
    }

    public static int sumArray(int[] array, int index){
        if(index < array.length){
            return array[index] + sumArray(array, index + 1);
        }
        else {
            return 0;
        }
    }
}
