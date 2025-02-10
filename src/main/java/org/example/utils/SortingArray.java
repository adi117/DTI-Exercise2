package org.example.utils;

import java.util.List;

public class SortingArray {
    public static int[] sortAscendingArray(int[] numberList){

        int temp = 0;

        for (int i = 0; i < numberList.length; i++){
            for (int j = 1; j < numberList.length; i++){
                if (numberList[j - 1] > numberList[j]){
                    temp = numberList[j - 1];
                    numberList[j - 1] = numberList[j];
                    numberList[j] = temp;
                }
            }
        }

        return numberList;
    }
}
