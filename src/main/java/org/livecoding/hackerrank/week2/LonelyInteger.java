package org.livecoding.hackerrank.week2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, List<Integer>> collect = a.stream().collect(Collectors.groupingBy(i -> i));
        return collect.entrySet().stream().filter(entry -> entry.getValue().size() == 1).map(Map.Entry::getKey).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(lonelyinteger(List.of(1,2,3,4,3,2,1)));
    }
}
