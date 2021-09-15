package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    final int minNumber;
    final int maxNumber;

    public SortArray(int[] array) {
        this.minNumber = array[0];
        this.maxNumber = array[array.length - 1];
    }
}