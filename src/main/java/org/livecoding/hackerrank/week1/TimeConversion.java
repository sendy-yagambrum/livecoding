package org.livecoding.hackerrank.week1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static String timeConversion(String s) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
            Date d = dateFormat.parse(s);
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            return df.format(d);
        }catch (ParseException ignored) {}
        return null;
    }

    public static void main(String[] args) {
        System.out.println(TimeConversion.timeConversion("12:01:00AM"));
    }
}
