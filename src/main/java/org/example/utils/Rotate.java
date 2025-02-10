package org.example.utils;

import java.util.Arrays;

public class Rotate {

    public static int[] rotateArrayPosition(int[] numberArray, int element){
        int[] rotatedArray = new int[numberArray.length];

        for (int i = 0; i < numberArray.length - element; i++) {
            rotatedArray[i] = numberArray[i + element];
        }

        for (int i = 0; i < element; i++) {
            rotatedArray[numberArray.length - element + i] = numberArray[i];
        }

        return rotatedArray;
    }
}
