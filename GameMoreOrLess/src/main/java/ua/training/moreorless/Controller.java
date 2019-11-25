/*
 * @(#) Controller.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.moreorless;

/**
 * @author      Dashchyk Andrey
 */
public class Controller {
    private View view;
    private Model model;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
    }
}
