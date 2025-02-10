package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateTest {

    @Test
    @DisplayName("Rotate Number Array")
    void testRotateNumberArray(){
        assertArrayEquals(new int[] {3, 4, 5, 6, 7, 1, 2}, Rotate.rotateArrayPosition(new int[] {1, 2, 3, 4, 5, 6, 7}, 2));
    }


}