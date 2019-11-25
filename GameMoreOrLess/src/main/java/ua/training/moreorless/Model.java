/*
 * @(#) Model.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.moreorless;

/**
 * @author      Dashchyk Andrey
 */
public class Model {
    private int targetNumber;

    public void setRandomTargetNumber(int min, int max) {
        targetNumber = (int)((Math.random() * ++max) + min);
    }

    public int getTargetNumber() {
        return targetNumber;
    }
}
