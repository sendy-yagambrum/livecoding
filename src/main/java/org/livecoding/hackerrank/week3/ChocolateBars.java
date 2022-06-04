package org.livecoding.hackerrank.week3;

import java.util.List;

public class ChocolateBars {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int sum = 0;
        int count = 0;

        if (s.size() == 1) {
            if (s.get(0) == d) {
                return 1;
            }
        }
        int i = 0;
        while (i + m <= s.size()) {
            int j = i;
            while (j < i + m) {
                sum += s.get(j);
                j++;
            }
            if (sum == d) {
                count++;
            }
            sum = 0;
            i++;
        }

        return count;
    }

    public static int birthday1(List<Integer> s, int d, int m) {
        // Write your code here
        int numberOfWays=0;
        int sumOfSegment=0;

        for (int i = 0; i<=s.size()-m; i++) {
            List<Integer> sub = s.subList(i, i+m);
            sumOfSegment = sub.stream().reduce(0, Integer::sum);
            if (sumOfSegment == d)
                numberOfWays++;
        }

        return numberOfWays;
    }

    public static void main(String[] args) {
        System.out.println(birthday1(List.of(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1), 18, 7));
    }
}
