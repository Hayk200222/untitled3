package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 5;
        array[1] = 8;
        array[2] = 2;
        array[3] = 9;
        SortArray sortArray = new SortArray(sortingArray(array));
        System.out.println("Minimum number is " + sortArray.minNumber);
        System.out.println("Maximum number is " + sortArray.maxNumber);
    }

    private static int[] sortingArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
