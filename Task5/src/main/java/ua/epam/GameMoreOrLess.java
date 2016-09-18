package ua.epam;

import ua.epam.controller.GameController;
import ua.epam.model.GameModel;
import ua.epam.view.GameView;

public class GameMoreOrLess {

    public static void main(String[] args) {
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView();
        GameController gameController = new GameController(gameModel,gameView);
        gameController.gameProcess();
    }
}
