package Yandex.Contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void commentFootball() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strFirst = reader.readLine().split(":");
        String[] strSecond = reader.readLine().split(":");
        String strThird = reader.readLine();

        int firstG1 = Integer.parseInt(strFirst[0]);
        int firstG2 = Integer.parseInt(strFirst[1]);
        int secondG1 = Integer.parseInt(strSecond[0]);
        int secondG2 = Integer.parseInt(strSecond[1]);
        int firstGameSide = Integer.parseInt(strThird);

        int result = 0;
        if(firstG1 + firstG2 + secondG1 + secondG2 == 0)
            result = 1;
        else if(firstG1 + secondG1 <= firstG2 + secondG2 ){
            if(firstGameSide == 1){
                if(firstG1 + secondG1 < firstG2 + secondG2)
                    result = firstG2 + secondG2 - firstG1 - secondG1;
                if(result + secondG1 <= firstG2)
                    result++;
                if(firstG1 + secondG1 == firstG2 + secondG2 && firstG2 >= secondG1)
                    result = 1;

            } else{
                if(firstG1 + secondG1 < firstG2 + secondG2)
                    result = firstG2 + secondG2 - firstG1 - secondG1;
                if(result + firstG1 <= secondG2 || firstG1 <= secondG2)
                    result++;
                if(firstG1 + secondG1 == firstG2 + secondG2 && firstG1 <= secondG2)
                    result = 1;
            }
        }
        System.out.println(result);

    }
}
/*B. Футбольный комментатор

Ограничение времени	2 секунды
Ограничение памяти	64Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt

Раунд плей-офф между двумя командами состоит из двух матчей. Каждая команда проводит по одному матчу «дома» и «в гостях».
Выигрывает команда, забившая большее число мячей. Если же число забитых мячей совпадает, выигрывает команда, забившая больше мячей «в гостях».
Если и это число мячей совпадает, матч переходит в дополнительный тайм или серию пенальти.

Вам дан счёт первого матча, а также счёт текущей игры (которая ещё не завершилась). Помогите комментатору сообщить, сколько голов необходимо забить первой команде, чтобы победить, не переводя игру в дополнительное время.

Формат ввода
В первой строке записан счёт первого мачта в формате G1:G2, где G1 — число мячей, забитых первой командой, а G2 — число мячей, забитых второй командой.

Во второй строке записан счёт второго (текущего) матча в аналогичном формате. Все числа в записи счёта не превышают 5.

В третьей строке записано число 1, если первую игру первая команда провела «дома», или 2, если «в гостях».

Формат вывода
Выведите единственное целое число — необходимое количество мячей.

Пример 1
Ввод

0:0
0:0
1
Вывод
1
Пример 2
Ввод
0:2
0:3
1
Вывод
5
Пример 3
Ввод
0:2
0:3
2
Вывод
6
*/