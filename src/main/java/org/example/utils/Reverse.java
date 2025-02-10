package org.example.utils;

public class Reverse {
    public static String reverseString(String text){
        String[] arrayText = text.split("");
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < arrayText.length; i++){
            reversedString.append(arrayText[arrayText.length - i - 1]);
        }

        return reversedString.toString();
    }
}
