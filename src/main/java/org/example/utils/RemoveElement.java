package org.example.utils;

import java.util.ArrayList;

public class RemoveElement {

    public static ArrayList<Integer> removeElement(int[] numberArray, int removedNumber){
        ArrayList<Integer> removedNumberList = new ArrayList<>();

        for (int i = 0; i < numberArray.length; i++){
            if (numberArray[i] != removedNumber){
                removedNumberList.add(numberArray[i]);
            }
        }

        return removedNumberList;
    }

}
