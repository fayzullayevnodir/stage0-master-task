package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces before the numbers
            for (int j = cathetusLength - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // Print the first half of the numbers
            for (int j = i; j >= 2; j--) {
                System.out.print(j);
            }

            // Print the middle number
            System.out.print(1);

            // Print the second half of the numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}