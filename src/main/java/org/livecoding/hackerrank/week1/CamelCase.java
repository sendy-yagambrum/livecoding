package org.livecoding.hackerrank.week1;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        while (scanner.hasNextLine()) {
            String input = scanner.next();
            input = input.stripTrailing();
            String[] splits = input.split(";");
            if (splits.length != 3) {
                continue;
            }
            String command = splits[0];
            String type = splits[1];
            String word = splits[2];

            StringBuilder str = new StringBuilder();
            char[] chars = word.toCharArray();
            if (command.equals("S")) {
                if (type.equals("C")) {
                    for (int i = 0; i < chars.length; i++) {
                        char c = chars[i];
                        if (i == 0) {
                            str.append(Character.toLowerCase(c));
                        } else if (Character.isLowerCase(c)) {
                            str.append(c);
                        } else {
                            str.append(" ");
                            str.append(Character.toLowerCase(c));
                        }
                    }
                }
                if (type.equals("M")) {
                    for (int i = 0; i < chars.length - 2; i++) {
                        char c = chars[i];
                        if (Character.isLowerCase(c)) {
                            str.append(c);
                        } else {
                            str.append(" ");
                            str.append(Character.toLowerCase(c));
                        }
                    }
                }
                if (type.equals("V")) {
                    for (char c : chars) {
                        if (Character.isLowerCase(c)) {
                            str.append(c);
                        } else {
                            str.append(" ");
                            str.append(Character.toLowerCase(c));
                        }
                    }
                }
            } else {
                boolean capitalizeNext = false;
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if (i == 0) {
                        if (type.equals("C")) {
                            str.append(Character.toUpperCase(c));
                        } else {
                            str.append(Character.toLowerCase(c));
                        }
                    } else {
                        if (Character.isWhitespace(c)) {
                            capitalizeNext = true;
                        }
                        else {
                            if (capitalizeNext) {
                                str.append(Character.toUpperCase(c));
                                capitalizeNext = false;
                            } else {
                                str.append(Character.toLowerCase(c));
                            }

                        }
                        if (type.equals("M") && i == chars.length - 1) {
                            str.append("()");
                        }
                    }
                }
            }
            System.out.println(str);
        }
    }

}
