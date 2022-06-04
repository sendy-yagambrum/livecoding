package org.livecoding.hackerrank.week1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MockTestWeek1 {

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        int medianIndex = (arr.size())/2;
        List<Integer> array = new ArrayList<>(arr);
        array.sort(Comparator.naturalOrder());
        return array.get(medianIndex);
    }

    public static void main(String[] args) {

        System.out.println(MockTestWeek1.findMedian(List.of(5,3,1,2,4)));
    }
}
