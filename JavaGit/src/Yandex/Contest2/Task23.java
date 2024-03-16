package Yandex.Contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task23 {
    public static void calcLength() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputN = reader.readLine();
        int n = Integer.parseInt(inputN);
        String[] inputLengths = reader.readLine().split(" ");
        ArrayList<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < inputLengths.length; i++) {
            lengths.add(Integer.parseInt(inputLengths[i]));
        }

        int maxLength = Collections.max(lengths);
        int maxIndex = lengths.indexOf(maxLength);
        int sumLengths = 0;
        for (int i = 0; i < lengths.size(); i++) {
            if(i != maxIndex)
                sumLengths += lengths.get(i);
        }

        if(maxLength > sumLengths){
            System.out.println(maxLength - sumLengths);
        } else
            System.out.println(maxLength + sumLengths);
    }
}
