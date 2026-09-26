package view;

import controller.MainController;
import model.Helicopter;
import model.Submarine;
import model.Tank;

public class Starter {

    public static void main(String[] args) {

        MainController mainController = new MainController();

        mainController.addDepenceUnitObserver(new Helicopter());
        mainController.addDepenceUnitObserver(new Tank());
        mainController.addDepenceUnitObserver(new Submarine());

        new HomePage(mainController).setVisible(true);
    }
}