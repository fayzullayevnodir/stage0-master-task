package com.epam.algorithms;
import java.util.*;
public class ArrayTasks {
    public static String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "fall"};
    }

    public static int[] generateNumbers(int length) {
        if (length <1) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }

        int[] numbers = new int[length];
        for (int i = 1; i < length; i++) {
            numbers[i-1] = i;
        }

        return numbers;
    }
    public static int totalSum(int[] arr) {
        if (arr==null) return 0;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;

    }
    public static int findIndexOfNumber(int[] arr, int number) {
        if (arr==null ) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
    public static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        arr=reversed;
        return arr;
    }
    public static int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                count++;
            }
        }

        int[] positives = new int[count];
        int index = 0;
        for (int j : arr) {
            if (j > 0) {
                positives[index] = j;
                index++;
            }
        }
arr=positives;
        return arr;
    }
    public static int[][] sortRaggedArray(int[][] arr) {
        for (int[] ints : arr) {
            Arrays.sort(ints);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a.length - b.length;
            }
        });

        return arr;
    }
}