package org.example.utils;

public class Reverse {
    public static String reverseString(String text){
        String[] arrayText = text.split("");
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            reversedString.append(arrayText[text.length() - i]);
        }

        return reversedString.toString();
    }
}
