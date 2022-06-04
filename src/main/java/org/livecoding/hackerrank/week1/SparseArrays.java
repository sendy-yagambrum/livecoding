package org.livecoding.hackerrank.week1;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(Long.valueOf(strings.stream().filter(query::equals).count()).intValue());
        }
        return result;
    }
}
