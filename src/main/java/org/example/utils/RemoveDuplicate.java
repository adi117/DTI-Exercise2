package org.example.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicate {
    public static List<Integer> removeDuplicatedNumber(List<Integer> numberArray) {

        HashMap<Integer, Boolean> mapResultList = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < numberArray.size(); i++){
            if (mapResultList.get(numberArray.get(i)) == null){
                mapResultList.put(numberArray.get(i), true);
            }
        }

        for (Integer key : mapResultList.keySet()){
            resultList.add(key);
        }

        return resultList;

    }
}
