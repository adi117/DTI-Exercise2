package org.example.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureFinderTest {

    @Test
    @DisplayName("Temperature Range")
    void testFindTemperatureRange(){
        assertArrayEquals(new int[] {1,1,4,2,1,1,0,0}, TemperatureFinder.checkTemperatureRange(new int[] {73,74,75,71,69,72,76,73}));
        assertArrayEquals(new int[] {1,1,1,0}, TemperatureFinder.checkTemperatureRange(new int[] {30,40,50,60}));
        assertArrayEquals(new int[] {1,1,0}, TemperatureFinder.checkTemperatureRange(new int[] {30,60,90}));
    }

}