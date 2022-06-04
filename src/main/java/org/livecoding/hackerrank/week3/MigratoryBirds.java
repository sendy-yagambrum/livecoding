package org.livecoding.hackerrank.week3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, List<Integer>> map = arr.stream()
                .collect(Collectors.groupingBy(Function.identity()));
         Map<Integer, Integer> map1 = map.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,entry -> entry.getValue().size()));
        Map.Entry<Integer, Integer> max = map1.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(Map.entry(-1,-1));
        return map1.entrySet().stream()
                .filter(entry -> entry.getValue().equals(max.getValue())).min(Map.Entry.comparingByKey()).map(Map.Entry::getKey).orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}
