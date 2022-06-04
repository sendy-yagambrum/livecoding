package org.livecoding.hackerrank.week2;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel = 0;
        int count = 0;
        boolean valleyDetected = false;
        for (char c : path.toCharArray()) {
            if (c == 'D') {
                seaLevel--;
            }
            if (c == 'U') {
                seaLevel++;
            }
            if (seaLevel < 0 && !valleyDetected) {
                valleyDetected = true;
            }
            if (seaLevel == 0 && valleyDetected) {
                count++;
                valleyDetected = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "DDUUUUDD"));
    }
}