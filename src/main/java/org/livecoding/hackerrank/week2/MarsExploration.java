package org.livecoding.hackerrank.week2;

public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        int n = s.length();
        int noOfSos = n / 3;
        String expected = "SOS".repeat(noOfSos);
        char[] expectedChars = expected.toCharArray();
        char[] signalChars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < expectedChars.length; i++) {
            if (expectedChars[i] != signalChars[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSOT"));
    }
}
