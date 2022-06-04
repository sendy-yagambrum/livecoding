package org.livecoding.hackerrank.week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PermutateTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        A.sort(Comparator.naturalOrder());
        B.sort(Comparator.reverseOrder());

        boolean permutationSuccess = true;
        for (int i = 0; i <A.size(); i++) {
            permutationSuccess = permutationSuccess && (A.get(i) + B.get(i)) >= k;
        }
        return permutationSuccess ? "YES" : "NO";
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(1);
        List<Integer> B = new ArrayList<>();
        B.add(3);
        B.add(3);
        B.add(3);
        B.add(4);
        System.out.println(twoArrays(5, A, B));
    }
}
