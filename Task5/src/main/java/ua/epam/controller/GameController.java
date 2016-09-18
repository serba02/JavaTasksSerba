package ua.epam.controller;

import ua.epam.model.GameModel;
import ua.epam.view.GameView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;


public class GameController {
    private GameModel gameModel;
    private GameView gameView;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private ArrayList<Integer> userInputList = new ArrayList<Integer>();

    public GameController(GameModel gameModel, GameView gameView){
        this.gameModel = gameModel;
        this.gameView = gameView;
    }
    private boolean userInputIsOutOfRange(int userValue){
        if ((userValue < gameModel.getMinRangeValue()) || (userValue > gameModel.getMaxRangeValue())) {
            return true;
        }else{
            return false;
        }
    }
    private boolean correctAnswer(int userValue){
        if(userValue == gameModel.getRandomValue()) {
            gameView.showCongratulationMsg(userValue);
            return  true;
        }else{
            return false;
        }
    }
    private void valueAlreadyInArray(int userValue){
        for(int listElement : userInputList){
            if(userValue == listElement) {
                throw new InvalidParameterException();
            }
        }
    }
    public void gameProcess() {
        gameView.showGameStartMsg(gameModel.getMinRangeValue(), gameModel.getMaxRangeValue());
        while (true) {
            int userValue = 0;
            try {
                userValue = Integer.parseInt(reader.readLine());
                if (userInputIsOutOfRange(userValue)) {
                    throw new IndexOutOfBoundsException();
                } else if (correctAnswer(userValue)) {
                    break;
                } else {
                    valueAlreadyInArray(userValue);
                    if (userValue < gameModel.getRandomValue()) {
                        gameModel.setMinRangeValue(userValue);
                    } else {
                        gameModel.setMaxRangeValue(userValue);
                    }
                    userInputList.add(userValue);
                }
                gameView.showRangeOfSoughtValue(gameModel.getMinRangeValue(), gameModel.getMaxRangeValue());
                gameView.showUserInputs(userInputList);
            } catch (IndexOutOfBoundsException ex) {
                gameView.showIndexOutOfBoundsMsg(gameModel.getMinRangeValue(), gameModel.getMaxRangeValue());
            } catch (InvalidParameterException ex) {
                gameView.showInvalidParameterMsg();
            } catch (Exception ex) {
                gameView.showOtherExceptionsMsg(gameModel.getMinRangeValue(), gameModel.getMaxRangeValue());
            }
        }
    }
}
