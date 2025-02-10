package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {

    @Test
    @DisplayName("Remove Duplicate Number")
    void testRemoveDuplicateNumber(){
        List<Integer> actual = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        assertIterableEquals(expected, RemoveDuplicate.removeDuplicatedNumber(actual));
    }

}