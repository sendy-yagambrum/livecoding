package org.livecoding.toptal;

import java.util.*;
import java.util.stream.Collectors;

public class Precedence {

    public String findWord(String[] arr) {
        List<String> list = Arrays.asList(arr);
        List<String> rules = list.stream().map(item -> {
            String[] splits = item.split(">");
            return splits[0] + splits[1];
        }).collect(Collectors.toList());

        StringBuilder merge = new StringBuilder(rules.get(0));
        List<String> rulesRem = rules.subList(1, rules.size());
        while(!rulesRem.isEmpty()) {
            Iterator<String> iterator = rulesRem.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                if (merge.toString().startsWith(String.valueOf(next.charAt(1)))) {
                    merge.insert(0, next.charAt(0));
                    iterator.remove();
                }
                else if (merge.toString().endsWith(String.valueOf(next.charAt(0)))) {
                    merge.append(next.charAt(1));
                    iterator.remove();
                }
            }
        }
        return merge.toString();
    }

    public static void main(String[] args) {
        Precedence t = new Precedence();
        System.out.println(t.findWord(new String[]{"n>g","h>u","a>r", "g>a", "u>n", "r>y"}));

    }
}
