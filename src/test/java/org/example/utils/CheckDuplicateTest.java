package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDuplicateTest{

    @Test
    @DisplayName("Check Duplicate Number")
    void testCheckDuplicateNumber(){
        assertTrue(CheckDuplicate.isAnyDuplicateNumber(new int[] {1,2,3,1}));
        assertFalse(CheckDuplicate.isAnyDuplicateNumber(new int[] {1,2,3,4}));
        assertTrue(CheckDuplicate.isAnyDuplicateNumber(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

}