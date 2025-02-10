package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateTest {

    @Test
    @DisplayName("Find Duplicate Number")
    void testFindDuplicateNumber(){
        List<Integer> actual = Arrays.asList(4,3,2,7,8,2,3,1);
        List<Integer> expected = Arrays.asList(2,3);

        assertIterableEquals(expected, FindDuplicate.findDuplicate(actual));
    }

}