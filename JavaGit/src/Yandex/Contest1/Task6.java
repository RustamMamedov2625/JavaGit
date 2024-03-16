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

/*F. ���� � ����������
����������� �������	1 �������
����������� ������	256Mb
����	����������� ���� ��� input.txt
�����	����������� ����� ��� output.txt
���� ����� �� �������� ���������� � ������ ����� ��������� � ����� ��������� ������: ����
n
 ����� ����� � ����� ���������� ����� ���� �����
+
 �
?
 ���, ����� ��������� ����������� ��������������� ��������� ��� �������� (��������, ����� �������
5
,
7
,
2
, ����� ���������� �������������� ����� ��������� �������:
5
?
7
+
2
=
3
7
). ��� ��� ������� ����������� ��� ������ � ������, � ���� ������ ������� � �����, �� ��� ��������� �������� ��������� �������� ������ ������.
������ �����
� ������ ������ ���������� ������������ �����
n
 (
2
?
n
?
1
0
5
). �� ������ ������ ����������
n
 ����� �����
a
i
, ���������� ��������� (
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
). �������������, ��� ������� ����������.
������ ������
� ����� ������ ��������
n
?
1
 ������
+
 ���
?
, � ���������� ���������� ������� ���������� �������� ���������. (��� ������ ����������� �������������� ����� �+� (ASCII ���43) � �x� (ASCII ���120), ��� �������).
������ 1
����	�����
3
5 7 2
x+
������ 2
����	�����
2
4 -5
+
*/