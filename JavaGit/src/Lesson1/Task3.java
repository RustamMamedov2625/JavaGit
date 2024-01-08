package Lesson1;
//Task from this URL:
//https://telegra.ph/Bazovaya-struktura-programmy-peremennye-tipy-dannyh-i-vse-vse-vse-11-10

public class Task3 {
    public static void task1() {
        System.out.println("Lesson 1 Task 3 exercise 1");
        int a = 5;
        int b = 10;
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }

    public static void task2(){
        System.out.println("Lesson 1 Task 3 exercise 2");
        String name = "Rustam"; //paragraph а
        System.out.println(name);

        char nameFirstChar = 'R'; //paragraph b
        System.out.print(nameFirstChar);
        char nameSecondChar = 'u';
        System.out.print(nameSecondChar);
        char nameThirdChar = 's';
        System.out.print(nameThirdChar);
        char nameFourthChar = 't';
        System.out.print(nameFourthChar);
        char nameFifthChar = 'a';
        System.out.print(nameFifthChar);
        char nameSixthChar = 'm';
        System.out.print(nameSixthChar + "\n");


        char nameChar = 'R'; //paragraph  с
        System.out.print(nameChar);
        nameChar = 'u';
        System.out.print(nameChar);
        nameChar = 's';
        System.out.print(nameChar);
        nameChar = 't';
        System.out.print(nameChar);
        nameChar = 'a';
        System.out.print(nameChar);
        nameChar = 'm';
        System.out.print(nameChar + "\n");

        //пункт для особо внимательных со String
        System.out.print(name.charAt(0) + "\n");
        System.out.print(name.charAt(1) + "\n");
        System.out.print(name.charAt(2) + "\n");
        System.out.print(name.charAt(3) + "\n");
        System.out.print(name.charAt(4) + "\n");
        System.out.print(name.charAt(5) + "\n\n");

        //с сhar
        System.out.print(nameFirstChar + "\n");
        System.out.print(nameSecondChar + "\n");
        System.out.print(nameThirdChar + "\n");
        System.out.print(nameFourthChar + "\n");
        System.out.print(nameFifthChar + "\n");
        System.out.print(nameSixthChar + "\n");


    }

}
