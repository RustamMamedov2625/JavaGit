package Yandex.Contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void calculateProfit() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strNKD = reader.readLine().split(" ");

        long n = Long.parseLong(strNKD[0]);
        long k = Long.parseLong(strNKD[1]);
        long d = Long.parseLong(strNKD[2]);

        long profit = n * 10;
        StringBuilder result = new StringBuilder("" + n);

        if(k < 10){
            profit += k - (profit % k);
        }
        else {
            if(profit % k > k - 9 || (profit / 10) % k == 0 || profit % k == 0){
                if(profit % k == 0 )
                    result.append("");
                else{
                    profit += k - (profit % k);
                }
            }
            else {
                profit = -1;
            }
        }

        if(profit == -1)
            result = new StringBuilder(Long.toString(profit));
        else if(n % k == 0 || profit % k == 0){
            result = new StringBuilder(Long.toString(profit));
            for (int i = 1; i < d; i++) {
                result.append("0");
            }
        }

        System.out.println(result);
    }
}

/*E. Прибыльный стартап
Ограничение времени	1 секунда
Ограничение памяти	256Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt
k
 друзей организовали стартап по производству укулеле для кошек. На сегодняшний день прибыль составила
n
 рублей. Вы, как главный бухгалтер компании, хотите в каждый из ближайших
d
 дней приписывать по одной цифре в конец числа, выражающего прибыль. При этом в каждый из дней прибыль должна делиться на
k
.
Формат ввода
В единственной строке входных данных через пробел записаны три числа:
n
,
k
,
d
 — изначальная прибыль, количество учредителей компании и количество дней, которое вы собираетесь следить за прибылью
(
1
?
n
,
k
?
1
0
9
,
1
?
d
?
1
0
5
)
. НЕ гарантируется, что
n
 делится на
k
.
Формат вывода
Выведите одно целое число
x
 — прибыль компании через
d
 дней. Первые цифры числа
x
 должны совпадать с числом
n
. Все префиксы числа
x
, которые длиннее числа
n
 на
1
,
2
,
…
,
d
 цифр, должны делиться на
k
. Если возможных ответов несколько, выведите любой из них. Если ответа не существует, выведите
?
1
.
Пример 1
Ввод
21 108 1
Вывод
216
Пример 2
Ввод
5 12 4
Вывод
-1

Примечания
В первом тестовом примере всего один день нужно следить за прибылью.
Можно дописать цифру 6 в конец числа21 и получить прибыль, делящуюся на 108.
Во втором тестовом примере мы в первый же день не можем получить прибыль, делящуюся на
k
, какая бы цифра не была дописана у числу
n
, поэтому ответа не существует.*/