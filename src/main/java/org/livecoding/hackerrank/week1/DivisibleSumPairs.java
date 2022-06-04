package org.livecoding.hackerrank.week1;

import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        int j = 0;
        for (int i = j; i<ar.size(); i++) {
            int no = ar.get(i);
            for (int m = j + 1; m < ar.size(); m++) {
                int sum = no + ar.get(m);
                if (sum % k == 0) {
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}
