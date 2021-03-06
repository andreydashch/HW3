/*
 * @(#) Main.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.moreorless;

/**
 * Game for guessing number from range
 *
 * @author      Dashchyk Andrey
 */
public class Main {

    /**
     * @author      Dashchyk Andrey
     */
    public static void main( String[] args ){
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        //Run
        controller.processUser();
    }

}
