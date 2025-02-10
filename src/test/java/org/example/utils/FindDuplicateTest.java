package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateTest {

    @Test
    @DisplayName("Find Duplicate Number 1")
    void testFindDuplicateNumber(){
        assertIterableEquals(Arrays.asList(2,3), FindDuplicate.findDuplicate(Arrays.asList(4,3,2,7,8,2,3,1)));
        assertIterableEquals(Arrays.asList(1), FindDuplicate.findDuplicate(Arrays.asList(1,1,2)));
        assertIterableEquals(Arrays.asList(), FindDuplicate.findDuplicate(Arrays.asList(1)));
    }

}