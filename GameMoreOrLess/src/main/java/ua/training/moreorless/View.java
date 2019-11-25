/*
 * @(#) View.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.moreorless;

/**
 * @author      Dashchyk Andrey
 */
public class View {

    public void printConcatenateMessage(String ... strings) {
        StringBuilder message = new StringBuilder();
        for(String temp : strings){
            message.append(temp);
        }

        printMessage(message.toString());
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
