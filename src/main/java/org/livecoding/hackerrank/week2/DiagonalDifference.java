package org.livecoding.hackerrank.week2;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.size();
        int j = size -1;
        int sumDiagLeft = 0;
        int sumDiagRight = 0;
        for (int i = 0; i<size; i++) {
            List<Integer> currentRow = arr.get(i);
            sumDiagLeft += currentRow.get(i);
            sumDiagRight += currentRow.get(j);
            j--;
        }
        return Math.abs(sumDiagLeft - sumDiagRight);
    }

    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(1, 2,3), List.of(4,5,6), List.of(9, 8, 9))));
    }
}
