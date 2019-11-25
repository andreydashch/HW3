/*
 * @(#) Model.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.moreorless;

import java.util.ArrayList;

/**
 * @author      Dashchyk Andrey
 */
public class Model {
    private int targetNumber;
    private int minBarrier;
    private int maxBarrier;
    private ArrayList<Integer> history;

    /*
     * Test is ignored
     * Run it after changes
     */
    public void setTargetNumberFromPrimaryBarrier(int min, int max) {
        targetNumber = (int)((Math.random() * ++max) + min);
        setPrimaryBarrier(min, max);
    }

    private void setPrimaryBarrier(int min, int max) {
        this.minBarrier = min;
        this.maxBarrier = max;
    }
    public int getTargetNumber() {
        return targetNumber;
    }

}
