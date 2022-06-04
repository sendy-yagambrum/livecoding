package org.livecoding.hackerrank.week3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, List<Integer>> map = ar.stream().collect(Collectors.groupingBy(Function.identity()));
        return map.entrySet().stream().map(Map.Entry::getValue).map(value -> value.size() / 2).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(7, List.of(1,2,1,2,1,3,2)));
    }
}
