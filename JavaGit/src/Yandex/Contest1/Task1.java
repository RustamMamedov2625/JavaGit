package Yandex.Contest1;

//02.03.2024
public class Task1 {
    public static int treesPainted(int p, int v, int q, int m) {
        int result;
        if(Math.abs(q - p) <= v + m){
            result = Math.max(p + v, q + m) - Math.min(p - v, q - m) + 1;
        }else{
            result = 2 * (v + m + 1);
        }
        return result;
    }


    public static void testTreePainting() {
        // Тестируем случай, когда диапазоны пересекаются

        System.out.println(treesPainted(1, 2, 2, 1) + " " + 3);
        System.out.println(treesPainted(0, 1, 0, 1) + " " + 1);
        System.out.println(treesPainted(-1, 1, -1, 1) + " " + 1);

        // Тестируем случай, когда диапазоны не пересекаются
        System.out.println(treesPainted(1, 1, 3, 1) + " " + 0);
        System.out.println(treesPainted(-1, 1, 1, 1) + " " + 0);
        System.out.println(treesPainted(10, 1, -10, 1) + " " + 6);

        // Тестируем граничные случаи
        System.out.println( treesPainted(0, 0, 0, 0) + " " + 1);
        System.out.println(treesPainted(Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 0) + " " + 1);
        System.out.println(treesPainted(Integer.MIN_VALUE, 0, Integer.MIN_VALUE, 0) + " " + 1);
    }
}

/*
        int i = Math.max(0, 2 * v) + Math.max(0, 2 * m);
        int result = Math.max(Math.max(Math.max(i - Math.max(0, p-q+m+v), i - Math.max(0, q-p+m+v)), 2 * v), 2 * m) ;
*/

/*A. Покраска деревьев
Ограничение времени	1 секунда
Ограничение памяти	64Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt

Вася и Маша участвуют в субботнике и красят стволы деревьев в белый цвет. Деревья растут вдоль улицы через равные промежутки в 1 метр.
Одно из деревьев обозначено числом ноль, деревья по одну сторону занумерованы положительными числами
1,2 и т.д., а в другую — отрицательными ?1, ? 2 и т.д.

Ведро с краской для Васи установили возле дерева P, а для Маши — возле дерева Q.
Ведра с краской очень тяжелые и Вася с Машей не могут их переставить, поэтому они окунают кисть в ведро и уже с этой кистью идут красить дерево.
Краска на кисти из ведра Васи засыхает, когда он удаляется от ведра более чем на V метров, а из ведра Маши — на M метров.
Определите, сколько деревьев может быть покрашено.

Формат ввода
В первой строке содержится два целых числа P и V — номер дерева, у которого стоит ведро Васи и на сколько деревьев он может от него удаляться.
В второй строке содержится два целых числа Q и M — аналогичные данные для Маши.
Все числа целые и по модулю не превосходят 10^8.

Формат вывода
Выведите одно число — количество деревьев, которые могут быть покрашены.

Пример
Ввод	Вывод
0 7      25
12 5


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strVasya = reader.readLine().split(" ");
        String[] strMasha = reader.readLine().split(" ");

        int p = Integer.parseInt(strVasya[0]);
        int v = Integer.parseInt(strVasya[1]);
        int q = Integer.parseInt(strMasha[0]);
        int m = Integer.parseInt(strMasha[1]);

        int vasyaStart = p - v;
        int vasyaEnd = p + v;
        int mashaStart = q - m;
        int mashaEnd = q + m;

        int start = (vasyaStart > mashaStart) ? vasyaStart : mashaStart;
        int end = (vasyaEnd < mashaEnd) ? vasyaEnd : mashaEnd;

        int result = ((end - start + 1) > 0) ? end - start + 1 : 0;

        return result;
*/