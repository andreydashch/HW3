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

    Model(){
            history = new ArrayList<>();
    }

    public boolean checkValue(int actual) {
        boolean isEqual = (actual == targetNumber);

        history.add(actual);
        updateBarrier(actual);

        return isEqual;
    }

    private void updateBarrier(int actual) {
        if (actual > targetNumber){
            setBarrier(minBarrier, actual);
        } else if (actual < targetNumber){
            setBarrier(actual, maxBarrier);
        }
    }

    /*
     * Test is ignored
     * Run it after changes
     */
    public void setTargetNumberFromPrimaryBarrier(int min, int max) {
        setBarrier(min, max);
        targetNumber = (int)((Math.random() * ++max) + min);
    }

    private void setBarrier(int min, int max) {
        this.minBarrier = min;
        this.maxBarrier = max;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getMinBarrier(){
        return minBarrier;
    }

    public int getMaxBarrier(){
        return maxBarrier;
    }

    public ArrayList<Integer> getHistory(){
        return history;
    }
}
