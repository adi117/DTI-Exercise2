package org.example;

import org.example.utils.FindDuplicate;
import org.example.utils.SortingArray;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(4);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(5);
        System.out.println(FindDuplicate.findDuplicate(numberList));

        System.out.println(SortingArray.sortAscendingArray(new int[]{22, 1, 6, 1, 3, 8, 4, 2, 8, 8, 3,}));
    }
}