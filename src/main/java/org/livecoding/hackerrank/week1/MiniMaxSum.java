package org.livecoding.hackerrank.week1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> a) {
        // Write your code here
        List<Integer> arr = new ArrayList<>(a);
        arr.sort(Comparator.naturalOrder());
        long min = 0;
        long max = 0;
        for (int i=0; i<arr.size(); i++) {
            if (i<=3) {
                min += arr.get(i);
                max += arr.get(arr.size()-1 -i);
            }

        }
        System.out.println(min +" "+max);
    }

    public static void main(String[] args) {
        MiniMaxSum.miniMaxSum(List.of(256741038,623958417,467905213,714532089,938071625));
    }
}
