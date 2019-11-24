/*
 * @(#) ArabicToRomanNumber.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.tdd;

/**
 * Converter from arabic numbers to
 * roman.
 */
public class ArabicToRomanNumber {

    public static String convert(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder(getDefRomanNumber());

        while(arabicNumber >= 1){
            romanNumber.append("I");
            arabicNumber--;
        }

        return romanNumber.toString();
    }

    private static String getDefRomanNumber() {
        return "";
    }
}
