package org.livecoding.hackerrank.week2;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
       String bin = String.format("%32s",Long.toBinaryString(n))
                .replaceAll(" ", "0")
                .replaceAll("1", "2")
                .replaceAll("0", "1")
        .replaceAll("2", "0");

        return Long.parseLong(bin, 2);
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(9l));
    }
}
