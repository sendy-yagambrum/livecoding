package org.livecoding.hackerrank.week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MaximumPerimeterTriangle {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        List<List<Integer>> triangles = new ArrayList<>();
        List<Integer> copy = new ArrayList<>(sticks);
        copy.sort(Integer::compareTo);
        while (copy.size() >= 3) {
            Iterator<Integer> copyIter = copy.iterator();
            Integer a = copyIter.next();
            copyIter.remove();
            Integer b = copyIter.next();

            copyIter.forEachRemaining(c -> {
                List<Integer> possibleTriangle = List.of(a, b, c);
                if (isTriangle(possibleTriangle)) {
                    triangles.add(possibleTriangle);
                }
            });
        }
        if (triangles.isEmpty()) {
            return List.of(-1);
        }

        Integer max =
                triangles.stream().flatMap(triangle -> Stream.of(triangle.stream().reduce(0, Integer::sum)))
                        .max(Integer::compareTo).orElse(-1);
        if (triangles.isEmpty()) {
            return List.of(-1);
        }
        return triangles.stream()
                .filter(triangle -> perimeter(triangle).equals(max))
                .sorted((triangle1, triangle2) -> triangle2.get(2) - triangle1.get(2))
                .min((triangle1, triangle2) -> triangle2.get(0) - triangle1.get(0))
                .orElse(List.of(-1));
    }

    private static Integer perimeter(List<Integer> sticks) {
        return sticks.stream().reduce(0, Integer::sum);
    }

    private static boolean isTriangle(List<Integer> sticks) {
        final int perimeter = perimeter(sticks);
        return sticks.stream().allMatch(stick -> (perimeter - stick) > stick);
    }

    public static void main(String[] args) {
        System.out.println(maximumPerimeterTriangle(List.of(9, 2015, 5294, 58768, 285, 477, 72, 13867, 97, 22445, 48, 36318, 764, 8573, 183, 3270, 81, 1251, 59, 95094)));
    }
}
