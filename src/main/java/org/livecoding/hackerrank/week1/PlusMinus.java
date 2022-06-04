package org.livecoding.hackerrank.week1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        long count = arr.size();
        long noOfPositive = arr.stream().filter(a -> a > 0).count();
        long noOfNegative = arr.stream().filter(a -> a < 0).count();
        long noOfZeros = count - noOfPositive - noOfNegative;
        BigDecimal ratioPositve = BigDecimal.valueOf(noOfPositive).divide(BigDecimal.valueOf(count), 6, RoundingMode.HALF_UP);
        BigDecimal ratioNegative = BigDecimal.valueOf(noOfNegative).divide(BigDecimal.valueOf(count), 6, RoundingMode.HALF_UP);
        BigDecimal ratioZeros = BigDecimal.valueOf(noOfZeros).divide(BigDecimal.valueOf(count), 6, RoundingMode.HALF_UP);
        System.out.println(ratioPositve);
        System.out.println(ratioNegative);
        System.out.println(ratioZeros);
    }

    public static void main(String[] args) {
        PlusMinus.plusMinus(List.of(-4,3,-9,0,4,1));
    }

}
