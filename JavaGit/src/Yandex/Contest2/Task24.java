package Yandex.Contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task24 {


    public static void calcPerimeter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputN = reader.readLine();
        int n = Integer.parseInt(inputN);
        char[][] chessDesk = new char[10][10];
        int connection = 0;
        for (int i = 0; i < 10; i++) {
            chessDesk[0][i] = '1';
            chessDesk[9][i] = '1';
            chessDesk[i][0] = '1';
            chessDesk[i][9] = '1';
        }
        for (int i = 0; i < n; i++) {
            String[] inputCoordinates = reader.readLine().split(" ");
            chessDesk[Integer.parseInt(inputCoordinates[0])][Integer.parseInt(inputCoordinates[1])] = '#';
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if(chessDesk[i][j] == '#'){
                    if(chessDesk[i + 1][j] == '#' )
                        connection++;
                    if(chessDesk[i - 1][j] == '#' )
                        connection++;
                    if(chessDesk[i][j + 1] == '#' )
                        connection++;
                    if (chessDesk[i][j - 1] == '#')
                        connection++;
                }
            }
        }


        System.out.println(n * 4 - connection);
    }

}
