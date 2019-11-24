package ua.training.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TestArabicToRomanNumber {
    String romanNumber;

    @Test
    public void Convert_0_To_EmptyString() {
        romanNumber = ArabicToRomanNumber.convert(0);
        Assert.assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I() {
        romanNumber = ArabicToRomanNumber.convert(1);
        Assert.assertEquals("I", romanNumber);
    }

    @Test
    public void Convert_2_To_II() {
        romanNumber = ArabicToRomanNumber.convert(2);
        Assert.assertEquals("II", romanNumber);
    }

    @Test
    public void Convert_3_To_III() {
        romanNumber = ArabicToRomanNumber.convert(3);
        Assert.assertEquals("III", romanNumber);
    }

    @Test
    public void Convert_5_To_V() {
        romanNumber = ArabicToRomanNumber.convert(5);
        Assert.assertEquals("V", romanNumber);
    }

    @Test
    public void Convert_6_To_VI() {
        romanNumber = ArabicToRomanNumber.convert(6);
        Assert.assertEquals("VI", romanNumber);
    }

    @Test
    public void Convert_8_To_VIII() {
        romanNumber = ArabicToRomanNumber.convert(8);
        Assert.assertEquals("VIII", romanNumber);
    }

    @Test
    public void Convert_4_To_IV() {
        romanNumber = ArabicToRomanNumber.convert(4);
        Assert.assertEquals("IV", romanNumber);
    }
}
