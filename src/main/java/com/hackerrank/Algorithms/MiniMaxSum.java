package com.hackerrank.Algorithms;

import java.util.Scanner;
/*
* https://www.hackerrank.com/challenges/mini-max-sum/problem
* */
public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sumAll = 0L;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sumAll += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(String.format("%d %d", sumAll - max, sumAll - min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
