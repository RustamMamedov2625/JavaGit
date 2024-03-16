package Yandex.Contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task22 {
    public static void calcMaxProfit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNK = reader.readLine().split(" ");
        int n = Integer.parseInt(inputNK[0]);
        int k = Integer.parseInt(inputNK[1]);

        String[] inputPrices = reader.readLine().split(" ");

        ArrayList<Integer> prices = new ArrayList<>();
        int resultMaxProfit = 0;
        for (int i = 0; i < n; i++) {
            prices.add(Integer.parseInt(inputPrices[i]));
        }

        int j;
        for (int i = 0; i < n ; i++) {
            j = 0;
            while(j <= k && i + j < n) {
                if (prices.get(i + j) - prices.get(i) > resultMaxProfit)
                    resultMaxProfit = prices.get(i + j) - prices.get(i);
                j++;
            }
        }


        System.out.println(resultMaxProfit);

    }
}
