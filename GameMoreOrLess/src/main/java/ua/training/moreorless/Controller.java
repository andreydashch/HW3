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
        int validValue;
        boolean inBarrier;
        String hintMessage = generateHintMessage();

        do {
            validValue = validateForInt(sc, hintMessage);
            inBarrier = ((validValue < model.getMaxBarrier()) ||
                         (validValue > model.getMinBarrier()));
        } while(!(inBarrier));

        return validValue;
    }

    private int validateForInt(Scanner sc, String hintMessage) {
        while (true) {
            view.printMessage(hintMessage);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }
    }

    private String generateHintMessage() {
        StringBuilder hintMessage = new StringBuilder();

        hintMessage.append(GlobalTextConstants.INPUT_INT + GlobalTextConstants.NEW_LINE);
        hintMessage.append(GlobalTextConstants.START_INPUT_IN_RANGE);
        hintMessage.append(model.getMinBarrier());
        hintMessage.append(GlobalTextConstants.RANGE_SEPARATOR);
        hintMessage.append(model.getMaxBarrier());
        hintMessage.append(GlobalTextConstants.END_INPUT_IN_RANGE);

        return hintMessage.toString();
    }
}
