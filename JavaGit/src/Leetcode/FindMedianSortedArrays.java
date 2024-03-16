package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double result;
        int[] sumArray = new int[m + n];
        for(int i = 0; i < m; i++){
            sumArray[i] = nums1[i];
        }

        for(int i = 0; i < n; i++){
            sumArray[m + i] = nums2[i];
        }

        Arrays.sort(sumArray);

        if((m + n) % 2 == 0){
            result = (sumArray[(m + n) / 2 - 1] + sumArray[(m + n) / 2 ]) / 2;
        }
        else
            result = sumArray[(m + n) / 2];

        return result;
    }
}
