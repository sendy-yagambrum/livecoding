package org.livecoding.hackerrank.week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i<a.size(); i++) {
            int no = a.get(i);
            long countPlus = a.stream().filter(ano -> (ano == no) || (ano == no + 1)).count();
            long countMinus = a.stream().filter(ano -> (ano == no) || (ano == no -1)).count();
            counts.add(Long.valueOf(countPlus).intValue());
            counts.add(Long.valueOf(countMinus).intValue());
        }
        counts.sort(Comparator.reverseOrder());
        return counts.get(0);
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(List.of(1, 2, 2, 3, 1, 2)));
    }
}
