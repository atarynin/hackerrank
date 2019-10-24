package com.hackerrank.Algorithms;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/time-conversion
public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String timeIn12Format) {
        final String partOfDay = timeIn12Format.substring(timeIn12Format.length() - 2);
        String timeIn12FormatWithoutDayPart = timeIn12Format.replaceAll(partOfDay, "");
        String result = timeIn12FormatWithoutDayPart;
        String hours = timeIn12Format.split(":")[0];
        Integer hoursIn24 = (Integer.parseInt(hours) + 12);
        if ("AM".equals(partOfDay) && "12".equals(hours)) {
            result = timeIn12FormatWithoutDayPart.replaceFirst(hours, "00");
        } else if ("PM".equals(partOfDay) && !"12".equals(hours)){
            result = timeIn12FormatWithoutDayPart.replaceFirst(hours, String.valueOf(hoursIn24));
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
