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
        // ��������� ������, ����� ��������� ������������

        System.out.println(treesPainted(1, 2, 2, 1) + " " + 3);
        System.out.println(treesPainted(0, 1, 0, 1) + " " + 1);
        System.out.println(treesPainted(-1, 1, -1, 1) + " " + 1);

        // ��������� ������, ����� ��������� �� ������������
        System.out.println(treesPainted(1, 1, 3, 1) + " " + 0);
        System.out.println(treesPainted(-1, 1, 1, 1) + " " + 0);
        System.out.println(treesPainted(10, 1, -10, 1) + " " + 6);

        // ��������� ��������� ������
        System.out.println( treesPainted(0, 0, 0, 0) + " " + 1);
        System.out.println(treesPainted(Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 0) + " " + 1);
        System.out.println(treesPainted(Integer.MIN_VALUE, 0, Integer.MIN_VALUE, 0) + " " + 1);
    }
}

/*
        int i = Math.max(0, 2 * v) + Math.max(0, 2 * m);
        int result = Math.max(Math.max(Math.max(i - Math.max(0, p-q+m+v), i - Math.max(0, q-p+m+v)), 2 * v), 2 * m) ;
*/

/*A. �������� ��������
����������� �������	1 �������
����������� ������	64Mb
����	����������� ���� ��� input.txt
�����	����������� ����� ��� output.txt

���� � ���� ��������� � ���������� � ������ ������ �������� � ����� ����. ������� ������ ����� ����� ����� ������ ���������� � 1 ����.
���� �� �������� ���������� ������ ����, ������� �� ���� ������� ������������ �������������� �������
1,2 � �.�., � � ������ � �������������� ?1, ? 2 � �.�.

����� � ������� ��� ���� ���������� ����� ������ P, � ��� ���� � ����� ������ Q.
����� � ������� ����� ������� � ���� � ����� �� ����� �� �����������, ������� ��� ������� ����� � ����� � ��� � ���� ������ ���� ������� ������.
������ �� ����� �� ����� ���� ��������, ����� �� ��������� �� ����� ����� ��� �� V ������, � �� ����� ���� � �� M ������.
����������, ������� �������� ����� ���� ���������.

������ �����
� ������ ������ ���������� ��� ����� ����� P � V � ����� ������, � �������� ����� ����� ���� � �� ������� �������� �� ����� �� ���� ���������.
� ������ ������ ���������� ��� ����� ����� Q � M � ����������� ������ ��� ����.
��� ����� ����� � �� ������ �� ����������� 10^8.

������ ������
�������� ���� ����� � ���������� ��������, ������� ����� ���� ���������.

������
����	�����
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