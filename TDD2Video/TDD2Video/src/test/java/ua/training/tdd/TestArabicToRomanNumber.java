package ua.training.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TestArabicToRomanNumber {

    @Test
    public void Convert_0_To_EmptyString() {
        String romanNumber;
        romanNumber = ArabicToRomanNumber.convert(0);
        Assert.assertEquals(romanNumber, "");
    }

    @Test
    public void Convert_1_To_I() {
        String romanNumber;
        romanNumber = ArabicToRomanNumber.convert(1);
        Assert.assertEquals(romanNumber, "I");
    }
}
