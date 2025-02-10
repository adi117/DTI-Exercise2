package org.example.utils;

import java.util.List;

public class SortingArray {

    public static int[] sortNumber(int[] numberList, String sortType){
        if (sortType.equals("asc")){
            return sortAscendingArray(numberList);
        }

        return sortDescendingArray(numberList);

    }


    private static int[] sortAscendingArray(int[] numberList){

        int temp = 0;

        for (int i = 0; i < numberList.length; i++){
            for (int j = 1; j < numberList.length; j++){
                if (numberList[j - 1] > numberList[j]){
                    temp = numberList[j - 1];
                    numberList[j - 1] = numberList[j];
                    numberList[j] = temp;
                }
            }
        }

        return numberList;
    }

    private static int[] sortDescendingArray(int[] numberList){

        int temp = 0;

        for (int i = 0; i < numberList.length; i++){
            for (int j = 1; j < numberList.length; j++){
                if (numberList[j - 1] < numberList[j]){
                    temp = numberList[j - 1];
                    numberList[j - 1] = numberList[j];
                    numberList[j] = temp;
                }
            }
        }

        return numberList;
    }
}
