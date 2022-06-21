package org.livecoding.hackerrank.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MockTestWeek3 {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());

        int max = Math.max(a.get(a.size() - 1), b.get(b.size() - 1));
        int count = 0;
        for (int i = 1; i <= max; i++) {
            final int j = i;
            boolean aMatch = a.stream().allMatch(no -> (j % no) == 0);
            boolean bMatch = b.stream().allMatch(no -> (no % j) == 0);
            if (aMatch && bMatch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(getTotalX(new ArrayList<>(List.of(1)), new ArrayList<>(List.of(100))));
    }

}
