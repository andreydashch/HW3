package ua.training.moreorless;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestModel {
    private static Model model;
    @BeforeClass
    public static void init(){
        model = new Model();
    }

    // For practice
    @Ignore // Big loop, long execution (43 ms)
    @Test
    public void TestSetRandomNumber() {
        int count = 1000000;
        int randomNumber;
        boolean inBorder = false;

        for(int i=0;i<count;i++){
            model.setTargetNumberFromPrimaryBarrier(InitConstants.MIN_RANDOM_TARGET, InitConstants.MAX_RANDOM_TARGET);
            randomNumber = model.getTargetNumber();
            inBorder = isInBorder(randomNumber);
        }

        Assert.assertTrue(inBorder);
    }

    private boolean isInBorder(int randomNumber) {
        boolean inBorder = true;
        if ((randomNumber <= InitConstants.MIN_RANDOM_TARGET)||
                (randomNumber >= InitConstants.MAX_RANDOM_TARGET)){
            inBorder = false;
        }

        return inBorder;
    }




}
