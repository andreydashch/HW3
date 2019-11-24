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
        if (arabicNumber == 0) {
            return "";
        }else{
            return "I";
        }
    }
}
