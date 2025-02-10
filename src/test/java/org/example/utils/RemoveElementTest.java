package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    @DisplayName("Remove Element Number")
    void testRemoveElement(){
        int[] inputArray = {1, 2, 1, 3, 5, 1};
        int removedNumber = 1;

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 5));
        ArrayList<Integer> actual = RemoveElement.removeElement(inputArray, removedNumber);

        assertEquals(expected, actual);
    }

}