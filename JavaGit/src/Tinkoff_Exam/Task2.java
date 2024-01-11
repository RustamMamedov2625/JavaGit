package Tinkoff_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task2 {
    public static void foldBooks(int n, int[] x){
        int currentHeight, k = 1, stackHeight = 0;
        ArrayList<Integer> stacksHeightList = new ArrayList<>();
        Arrays.sort(x);
        currentHeight = x[0];
        stackHeight = 1;
        for(int i = 1; i < n; i++){
            if(x[i] == currentHeight){
                stackHeight++;
            }
            else{
                k++;
                stacksHeightList.add(stackHeight);
                stackHeight = 1;
                currentHeight = x[i];
            }
        }
        stacksHeightList.add(stackHeight);
        Collections.sort(stacksHeightList);
        System.out.println(k);
        for(Integer stack: stacksHeightList){
            System.out.print(stack + " ");
        }
    }
}
