package com.epam.conditions;

public class BitwiseValuesSwap {
        public void swap(int first, int second) {
            System.out.println(second);

            // XOR both variables
            first = first ^ second;
            second = first ^ second;
            first = first ^ second;

            System.out.println( second);
        }
}