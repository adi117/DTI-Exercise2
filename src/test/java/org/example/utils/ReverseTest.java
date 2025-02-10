package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    @DisplayName("Reverse Text")
    void testReverseString(){
        assertEquals("olleh", Reverse.reverseString("hello"));
    }
}