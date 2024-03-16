package Yandex.Contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void calculateRow() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strN = reader.readLine();
        long n = Long.parseLong(strN);
        String[] strNumbersArray = reader.readLine().split(" ");
        char[] strNumbersArrayLastDigits = new char[strNumbersArray.length];

        for (int i = 0; i < strNumbersArrayLastDigits.length; i++) {
            strNumbersArrayLastDigits[i] = strNumbersArray[i].charAt(strNumbersArray[i].length() - 1);
        }

        StringBuilder result = new StringBuilder();
        long sum = strNumbersArrayLastDigits[0] - '0';

        for (int i = 0; i < strNumbersArray.length - 1; i++) {
            if( sum % 2 == 0 && (strNumbersArrayLastDigits[i + 1] - '0') % 2 != 0) {
                sum += (strNumbersArrayLastDigits[i + 1] - '0') ;
                result.append("+");
            }
            else if( sum % 2 != 0 && (strNumbersArrayLastDigits[i + 1] - '0') % 2 == 0) {
                sum += (strNumbersArrayLastDigits[i + 1] - '0');
                result.append("+");
            }
            else if( sum % 2 == 0 && (strNumbersArrayLastDigits[i + 1] - '0') % 2 == 0) {
                sum += (strNumbersArrayLastDigits[i + 1] - '0');
                result.append("+");
            }
            else {
                sum *= (strNumbersArrayLastDigits[i + 1] - '0');
                result.append("x");
            }
        }

        System.out.println(result.toString());
    }
}

/*F. Миша и математика
Ограничение времени	1 секунда
Ограничение памяти	256Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt
Миша сидел на занятиях математики в Высшей школе экономики и решал следующую задачу: дано
n
 целых чисел и нужно расставить между ними знаки
+
 и
?
 так, чтобы результат полученного арифметического выражения был нечётным (например, между числами
5
,
7
,
2
, можно расставить арифметические знаки следующим образом:
5
?
7
+
2
=
3
7
). Так как примеры становились все больше и больше, а Миша срочно убегает в гости, от вас требуется написать программу решающую данную задачу.
Формат ввода
В первой строке содержится единственное число
n
 (
2
?
n
?
1
0
5
). Во второй строке содержится
n
 целых чисел
a
i
, разделённых пробелами (
?
1
0
9
?
a
i
?
1
0
9
). Гарантируется, что решение существует.
Формат вывода
В одной строке выведите
n
?
1
 символ
+
 или
?
, в результате применения которых получается нечётный результат. (Для вывода используйте соответственно знаки «+» (ASCII код—43) и «x» (ASCII код—120), без кавычек).
Пример 1
Ввод	Вывод
3
5 7 2
x+
Пример 2
Ввод	Вывод
2
4 -5
+
*/