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


}
