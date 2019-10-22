package com.hackerrank.Algorithms;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float positiveCounter = 0;
        float negativeCounter = 0;
        float zeroCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > 0) {
                positiveCounter++;
            } else if (current < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }
        System.out.println(String.format("%.6f", positiveCounter/arr.length));
        System.out.println(String.format("%.6f", negativeCounter/arr.length));
        System.out.println(String.format("%.6f", zeroCounter/arr.length));
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
