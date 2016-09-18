package ua.epam.view;

import java.util.ArrayList;


public class GameView {
    private static final String GAME_START_MSG = "Input value in range [%d,%d] \n";
    private static final String CONGRATULATION = "Congratulation! %d is correct answer \n";
    private static final String SOUGHT_VALUE_IN_RANGE = "Sought value in range [%d,%d] \n";
    private static final String YOUR_INPUTS = "Your inputs: %s \n";
    private static final String INDEXOUTOFBOUNDS_MSG = "Your input is out of range. Enter value in range [%d,%d] \n";
    private static final String INVALIDPARAMETER_MSG = "You have entered this value before \n";
    private static final String OTHER_EXCEPTIONS_MSG = "Incorrect input. Enter value in range [%d,%d] \n";

    public void showGameStartMsg(int minValue, int maxValue){
        System.out.printf(GAME_START_MSG, minValue, maxValue);
    }
    public void showCongratulationMsg(int value){
        System.out.printf(CONGRATULATION, value);
    }
    public void showRangeOfSoughtValue(int minValue, int maxValue){
        System.out.printf(SOUGHT_VALUE_IN_RANGE, minValue, maxValue);
    }
    public void showUserInputs(ArrayList inputsArray){
        System.out.printf(YOUR_INPUTS, inputsArray.toString());
    }
    public void showIndexOutOfBoundsMsg(int minValue, int maxValue){
        System.out.printf(INDEXOUTOFBOUNDS_MSG, minValue, maxValue);
    }
    public void showInvalidParameterMsg(){
        System.out.printf(INVALIDPARAMETER_MSG);
    }
    public void showOtherExceptionsMsg(int minValue, int maxValue){
        System.out.printf(OTHER_EXCEPTIONS_MSG, minValue, maxValue);
    }
}
