package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTest {

    @Test
    @DisplayName("Sort Array Number")
    void testSortArrayNumber(){
        assertArrayEquals(new int[] {2, 5, 7, 8}, SortingArray.sortNumber(new int[] {8, 7, 5, 2}, "asc"));
        assertArrayEquals(new int[] {8,7, 5, 2}, SortingArray.sortNumber(new int[] {8, 7, 5, 2}, "desc"));
    }

}