package ua.epam;

import ua.epam.controller.Controller;
import ua.epam.model.Notebook;
import ua.epam.view.View;

public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        View view = new View();
        Controller controller = new Controller(notebook,view);

        controller.setUserName();
        controller.setUserLastName();
        controller.setUserPatronymic();
        controller.setUserNickname();
        controller.setUserComment();
        controller.setUserGroup();
        controller.setUserHomePhoneNumber();
        controller.setUserFirstMobilePhoneNumber();
        controller.setUserSecondMobilePhoneNumber();
        controller.setUserEmail();
        controller.setSkype();
        controller.setAddress();
        controller.setDate();
        controller.setDateOfChanges();
        controller.pushInModel();
        controller.printModel();
    }
}
