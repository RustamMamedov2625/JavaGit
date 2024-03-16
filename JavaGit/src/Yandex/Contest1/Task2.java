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
/*B. ���������� �����������

����������� �������	2 �������
����������� ������	64Mb
����	����������� ���� ��� input.txt
�����	����������� ����� ��� output.txt

����� ����-��� ����� ����� ��������� ������� �� ���� ������. ������ ������� �������� �� ������ ����� ����� � �� �������.
���������� �������, �������� ������� ����� �����. ���� �� ����� ������� ����� ���������, ���������� �������, �������� ������ ����� �� �������.
���� � ��� ����� ����� ���������, ���� ��������� � �������������� ���� ��� ����� ��������.

��� ��� ���� ������� �����, � ����� ���� ������� ���� (������� ��� �� �����������). �������� ������������ ��������, ������� ����� ���������� ������ ������ �������, ����� ��������, �� �������� ���� � �������������� �����.

������ �����
� ������ ������ ������� ���� ������� ����� � ������� G1:G2, ��� G1 � ����� �����, ������� ������ ��������, � G2 � ����� �����, ������� ������ ��������.

�� ������ ������ ������� ���� ������� (��������) ����� � ����������� �������. ��� ����� � ������ ����� �� ��������� 5.

� ������� ������ �������� ����� 1, ���� ������ ���� ������ ������� ������� �����, ��� 2, ���� �� �������.

������ ������
�������� ������������ ����� ����� � ����������� ���������� �����.

������ 1
����

0:0
0:0
1
�����
1
������ 2
����
0:2
0:3
1
�����
5
������ 3
����
0:2
0:3
2
�����
6
*/