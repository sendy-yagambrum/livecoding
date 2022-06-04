package org.livecoding.hackerrank.week2;

import java.util.Set;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        Set<String> alphabets = Set.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        boolean match = alphabets.stream().allMatch(a -> s.toLowerCase().contains(a));
        return match ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
