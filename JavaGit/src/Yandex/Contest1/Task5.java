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

/*E. ���������� �������
����������� �������	1 �������
����������� ������	256Mb
����	����������� ���� ��� input.txt
�����	����������� ����� ��� output.txt
k
 ������ ������������ ������� �� ������������ ������� ��� �����. �� ����������� ���� ������� ���������
n
 ������. ��, ��� ������� ��������� ��������, ������ � ������ �� ���������
d
 ���� ����������� �� ����� ����� � ����� �����, ����������� �������. ��� ���� � ������ �� ���� ������� ������ �������� ��
k
.
������ �����
� ������������ ������ ������� ������ ����� ������ �������� ��� �����:
n
,
k
,
d
 � ����������� �������, ���������� ����������� �������� � ���������� ����, ������� �� ����������� ������� �� ��������
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
. �� �������������, ���
n
 ������� ��
k
.
������ ������
�������� ���� ����� �����
x
 � ������� �������� �����
d
 ����. ������ ����� �����
x
 ������ ��������� � ������
n
. ��� �������� �����
x
, ������� ������� �����
n
 ��
1
,
2
,
�
,
d
 ����, ������ �������� ��
k
. ���� ��������� ������� ���������, �������� ����� �� ���. ���� ������ �� ����������, ��������
?
1
.
������ 1
����
21 108 1
�����
216
������ 2
����
5 12 4
�����
-1

����������
� ������ �������� ������� ����� ���� ���� ����� ������� �� ��������.
����� �������� ����� 6 � ����� �����21 � �������� �������, ��������� �� 108.
�� ������ �������� ������� �� � ������ �� ���� �� ����� �������� �������, ��������� ��
k
, ����� �� ����� �� ���� �������� � �����
n
, ������� ������ �� ����������.*/