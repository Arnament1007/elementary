package hw_6.utils;

import exceptions.StringFormatException;

public class StringHelper {
    public String StringHelper(String str, char[] chr) throws StringFormatException {

        String transformedChar;
        String newStr;

        if (chr != null) {
//            transformedChar = chr.toString();
            transformedChar = new String(chr);
        } else {
            throw new NullPointerException("Array is empty!");
        }

        if (transformedChar.isBlank() || str.trim().isBlank()) {
            throw new StringFormatException();
        } else {
            transformedChar.trim().toUpperCase();
            str.trim().toLowerCase();

            newStr = transformedChar + " " + str;
        }

        if (newStr.length() % 2 == 0) {
            newStr = newStr.substring(0, newStr.length() / 2 - 1) + newStr.substring(newStr.length() / 2 + 1);
        } else {
            newStr = newStr.substring(0, newStr.length() / 2 - 1) + newStr.substring(newStr.length() / 2);
        }
        System.out.println(newStr);

        return newStr;
    }
}


