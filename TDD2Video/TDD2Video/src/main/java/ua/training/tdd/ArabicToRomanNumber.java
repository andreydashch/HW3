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

