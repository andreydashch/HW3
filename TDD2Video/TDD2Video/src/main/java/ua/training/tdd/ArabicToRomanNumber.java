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
        boolean noNumber = arabicNumber == 0;
        if (noNumber) {
            return getDefaultNumber();
        }if (arabicNumber == 1){
            return "I";
        }else{
            return "II";
        }
    }

    private static String getDefaultNumber() {
        return "";
    }
}
