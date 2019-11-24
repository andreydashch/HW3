/*
 * @(#) ArabicToRomanNumber.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.tdd;

import javafx.util.Pair;
import java.util.ArrayList;

/**
 * Converter from arabic numbers to
 * roman.
 */
public class ArabicToRomanNumber {
    private static ArrayList<Pair<Integer, String>> map;

    static {
        map = new ArrayList<>();
        map.add(new Pair<>(5, "V"));
        map.add(new Pair<>(1, "I"));
    }

    public static String convert(int arabicNumber) {
        StringBuilder romanNumber;
        String roughRomanNumber;
        int len;
        int count = 1;

        romanNumber = new StringBuilder(getDefRomanNumber());
        roughRomanNumber = convertToRough(arabicNumber);
        len = roughRomanNumber.length() - 1;
        if (len>1) {
            for (int i = 1; i <= len; i++) {
                if (roughRomanNumber.charAt(i - 1) == roughRomanNumber.charAt(i)) {
                    count++;
                    if (i != len) {
                        continue;
                    }
                }

                char currentRomanSymbol = roughRomanNumber.charAt(i - 1);
                if (count <= 3) {
                    for (int j = 0; j < count; j++) {
                        romanNumber.append(currentRomanSymbol);
                    }
                } else {
                    for (int j = 0; j < count - 3; j++) {
                        romanNumber.append(currentRomanSymbol);
                    }
                    romanNumber.append(nextRomanSymbol(currentRomanSymbol));

                }
                count = 1;
            }
        }else{
            romanNumber.append(roughRomanNumber);
        }


        return romanNumber.toString();
    }

    private static String nextRomanSymbol(char currentRomanSymbol) {
        int index = 0;
        for(Pair<Integer, String> pair : map){
            String current = String.valueOf(currentRomanSymbol);

            if (pair.getValue() == current){
                index = map.indexOf(pair);
                break;
            }
        }

        return map.get(index).getValue();
    }

    private static String convertToRough(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder(getDefRomanNumber());

        for(Pair<Integer, String> pair : map){
            int arabicSymbol = pair.getKey();
            String romanSymbol = pair.getValue();

            while(arabicNumber >= arabicSymbol){
                romanNumber.append(romanSymbol);
                arabicNumber -= arabicSymbol;
            }
        }

        return romanNumber.toString();
    }

    private static String getDefRomanNumber() {
        return "";
    }
}

