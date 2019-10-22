package com.hackerrank.Algorithms;

import java.util.Scanner;
/*
* https://www.hackerrank.com/challenges/staircase/problem
*
* Observe that its base and height are both equal to n,
* and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
* 
* */
public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
        String result = "";
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            stringBuilder.append(" ");
        }
        result += stringBuilder.append("#\n").toString();
        if (n > 1) {
            for (int i = n - 2; i >= 0; i--) {
                result += stringBuilder.replace(i, i + 1, "#").toString();
            }
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
