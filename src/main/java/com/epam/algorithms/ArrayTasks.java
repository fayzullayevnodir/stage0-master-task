package com.epam.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public static String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "fall"};
        return seasons;
    }

    public static int[] generateNumbers(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }

        int[] numbers = new int[length];
        for (int i = 1; i <= length; i++) {
            numbers[i-1] = i;
        }

        return numbers;
    }


    /**
     * Find the sum of all elements of the int[] array.
     *
     * @param arr the input array
     * @return the sum of all elements in the array
     */
    public static int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     *
     * @param arr the input array to search
     * @param number the number to search for
     * @return the index of the first occurrence of the number, or -1 if it does not exist
     */
    public static int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     *
     * @param arr the input array to reverse
     * @return the reversed array
     */
    public static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     *
     * @param arr the input array to filter
     * @return the filtered array containing only positive numbers
     */
    public static int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        int[] positives = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives[index] = arr[i];
                index++;
            }
        }

        return positives;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     *
     * @param arr the input array to sort
     * @return the sorted array
     */
    public static int[][] sortRaggedArray(int[][] arr) {
        // Sort the individual arrays in ascending order and by length
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a.length - b.length;
            }
        });

        return arr;
    }
}