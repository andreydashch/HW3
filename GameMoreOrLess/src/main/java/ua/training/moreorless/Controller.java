/*
 * @(#) Controller.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.moreorless;

import java.util.Scanner;

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
        view.printMessage(GlobalTextConstants.RULES);

        model.setTargetNumberFromPrimaryBarrier(
                InitConstants.MIN_RANDOM_TARGET, InitConstants.MAX_RANDOM_TARGET);
        gameLoop();

        view.printMessage(GlobalTextConstants.CONGRATULATION);
    }

    private void gameLoop() {
        Scanner sc = new Scanner(System.in);
        int attempt;

        do{
            attempt = setValidAttemptFromBarrier(sc);
            model.checkValue(attempt);
        }while(!(model.checkValue(attempt)));
    }

    private int  setValidAttemptFromBarrier(Scanner sc) {
        return sc.nextInt();
        //Edd validation
    }
}
