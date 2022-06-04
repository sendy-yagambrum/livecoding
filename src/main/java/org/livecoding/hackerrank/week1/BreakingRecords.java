package org.livecoding.hackerrank.week1;

import java.util.List;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = 0;
        int max = 0;
        int countMin = 0;
        int countMax = 0;
        for (int i = 0; i<scores.size(); i++) {
            int currentScore = scores.get(i);
            if (i == 0) {
                min = currentScore;
                max = currentScore;
            } else {
                if (currentScore < min) {
                    countMin++;
                    min = currentScore;
                }
                if (currentScore > max) {
                    countMax++;
                    max = currentScore;
                }
            }
        }
        return List.of(countMax, countMin);
    }

    public static void main(String[] args) {
        BreakingRecords.breakingRecords(List.of(12,24,10,24,11,25,9,8)).forEach(System.out::println);
    }
}
