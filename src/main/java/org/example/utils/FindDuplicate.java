package org.example.utils;

import java.util.*;

public class FindDuplicate {
    public static List<Integer> findDuplicate(List<Integer> numberList){

        ArrayList<Integer> duplicateNumber = new ArrayList<>();

        for (int i = 0; i < numberList.size() - 1 ; i++){
            for (int j = i; j < numberList.size() - 1; j++){
                if (Objects.equals(numberList.get(j + 1), numberList.get(i))){
                    duplicateNumber.add(numberList.get(i));
                    break;
                }
            }
        }

        Collections.sort(duplicateNumber);

        return duplicateNumber;
    }
}
