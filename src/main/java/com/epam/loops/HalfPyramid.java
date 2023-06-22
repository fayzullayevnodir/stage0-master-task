package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            // print asterisks
            for (int j = 0; j<cathetusLength; j++) {

                if (i+j>cathetusLength-2){
                System.out.print("*");}else {
                System.out.print(" ");}
            }
            // move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
