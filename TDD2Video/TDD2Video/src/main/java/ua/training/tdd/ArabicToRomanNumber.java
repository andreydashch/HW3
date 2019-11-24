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

        romanNumber = new StringBuilder(getDefRomanNumber());
        roughRomanNumber = convertToRough(arabicNumber);

        convertFromRough(romanNumber, roughRomanNumber);

        return romanNumber.toString();
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

    private static void convertFromRough(StringBuilder romanNumber, String roughRomanNumber) {
        if (roughRomanNumber.length()-1 > 1) {
            processRoughNumber(romanNumber, roughRomanNumber);
        }else{
            romanNumber.append(roughRomanNumber);
        }
    }

    private static void processRoughNumber(StringBuilder romanNumber, String roughRomanNumber) {
        int count = 1;
        int len;

        len = roughRomanNumber.length()-1;
        for (int i = 1; i <= len; i++) {
            char currentRomanSymbol = roughRomanNumber.charAt(i - 1);
            boolean repeatSymbols = roughRomanNumber.charAt(i - 1) == roughRomanNumber.charAt(i);

            if (repeatSymbols) {
                count++;
                if (i != len) {
                    continue;
                }
            }

            romanNumber.append(transformFromRepeatRough(count, currentRomanSymbol));
            count = 1;
        }
    }

    private static StringBuilder transformFromRepeatRough(int count, char currentRomanSymbol) {
        StringBuilder romanNumberTemp;
        romanNumberTemp = new StringBuilder();
        if (count <= 3) {
            addRepeatSymbols(count, currentRomanSymbol, romanNumberTemp);
        } else {
            addRepeatSymbols(count - 3, currentRomanSymbol, romanNumberTemp);
            romanNumberTemp.append(nextRomanSymbol(currentRomanSymbol));

        }

        return romanNumberTemp;
    }

    private static void addRepeatSymbols(int count, char currentRomanSymbol, StringBuilder romanNumberTemp) {
        for (int j = 0; j < count; j++) {
            romanNumberTemp.append(currentRomanSymbol);
        }
    }

    private static String nextRomanSymbol(char currentRomanSymbol) {
        int index = 0;
        for(Pair<Integer, String> pair : map){
            String current = String.valueOf(currentRomanSymbol);

            if (pair.getValue().equals(current)){
                index = map.indexOf(pair);
                break;
            }
        }

        return map.get(index-1).getValue();
    }



    private static String getDefRomanNumber() {
        return "";
    }
}

