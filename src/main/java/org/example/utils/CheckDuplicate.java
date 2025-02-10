package org.example.utils;

public class CheckDuplicate {
    public static boolean isAnyDuplicateNumber(int[] numberList){

        for (int i = 0; i < numberList.length; i++){
            for (int j = i + 1; j < numberList.length; j++){
                if (numberList[j] == numberList[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
