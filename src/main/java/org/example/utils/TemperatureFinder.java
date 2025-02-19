package org.example.utils;

public class TemperatureFinder {

    public static int[] checkTemperatureRange(int[] temperature){

        int[] temperatureRange = new int[temperature.length];

        for (int i = 0; i < temperature.length; i++){

            int checker = 0;

            for (int j = i + 1; j < temperature.length; j++){
                checker++;
                if (temperature[j] > temperature[i] && checker != temperature.length){
                    temperatureRange[i] = checker;
                    break;
                }
            }
        }

        return temperatureRange;
    }
}
