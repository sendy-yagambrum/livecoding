package org.livecoding.hackerrank.week2;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(grade -> {
            if (grade >= 38) {
                Integer mod = grade % 5;
                if (mod > 0 && List.of(3, 4, 8, 9).contains(mod)) {
                    return mod < 5 ? grade - mod + 5 : grade -mod + 10;
                }
                return grade;
            }
            return grade;
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(4, 84, 38, 41, 43, 29, 57)));
    }
}
