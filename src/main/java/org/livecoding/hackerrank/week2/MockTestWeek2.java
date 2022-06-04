package org.livecoding.hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MockTestWeek2 {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int size = matrix.size();

        int subSize = size / 2;
        int endIndex = size-1;
        List<Integer> maximalList = new ArrayList<>();

        for (int i=0; i<subSize; i++) {
            for (int j=0; j<subSize; j++) {
                int leftTopValue = matrix.get(i).get(j);
                int rightTopValue = matrix.get(i).get(endIndex-j);
                int leftBottomValue = matrix.get(endIndex-i).get(j);
                int rightBottomValue = matrix.get(endIndex-i).get(endIndex-j);

                Integer[] currentIndexPotentialValues = new Integer[]{leftTopValue, rightTopValue, leftBottomValue, rightBottomValue};
                Comparator<Integer> maxComp = Comparator.reverseOrder();
                Arrays.sort(currentIndexPotentialValues, maxComp);

                maximalList.add(currentIndexPotentialValues[0]);
            }
        }
        return maximalList.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(112, 42,  83,  119));
        matrix.add(List.of(56,  125, 56,  49));
        matrix.add(List.of(15,  78,  101, 43));
        matrix.add(List.of(62,  98,  114, 108));

        System.out.println(flippingMatrix(matrix));
    }

}
