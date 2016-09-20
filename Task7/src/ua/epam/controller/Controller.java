package ua.epam.controller;

import ua.epam.model.Address;
import ua.epam.model.Group;
import ua.epam.model.Notebook;
import ua.epam.view.View;

import java.util.Scanner;

/**
 * Created by Lev_Serba on 9/20/2016.
 */
public class Controller {
    private Notebook notebook;
    private View view;
    private Scanner scanner = new Scanner(System.in);

    private String correctUserName;
    private String correctUserLastName;
    private String correctUserPatronymic;
    private String correctUserNickname;
    private String correctUserComment;
    private Group  correctUserGroup;
    private String correctUserHomePhoneNumber;
    private String correctUserFirstMobilePhoneNumber;
    private String correctUserSecondMobilePhoneNumber;
    private Address correctAddress;


    public boolean checkLettersOnly(String strForCheck){
        if(strForCheck.matches("[A-Za-z]+")){
            return true;
        }return false;
    }
    public boolean checkLettersAndDigitsOnly(String strForCheck){
        if(strForCheck.matches("[A-Za-z0-9]+")){
            return true;
        }return false;
    }
    public boolean checkPhoneNumber(String strForCheck){
        if(strForCheck.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")){
            return true;
        }return false;
    }
    public boolean checkNickname(String strForCheck){
        if(strForCheck.matches("^[A-Za-z][A-Za-z0-9_-]{4,14}$")){
            return true;
        }return false;
    }
    public boolean checkEmail(String strForCheck){
        if(strForCheck.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")){
            return true;
        }return false;
    }
    public boolean checkSkype(String strForCheck){
        if(strForCheck.matches("^[A-Za-z][A-Za-z0-9_-]{4,14}$")){
            return true;
        }return false;
    }
    public boolean checkDigitsOnly(String strForCheck){
        if(strForCheck.matches("[0-9]+")){
            return true;
        }return false;
    }



    public void setUserName(){
       // view.showEnterName();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserName = userInput;
                break;
            }else{
                // view.showInvalidName();
            }
        }
    }
    public void setUserLastName(){
        // view.showEnterLastName();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserLastName = userInput;
                break;
            }else{
                // view.showInvalidLastName();
            }
        }
    }
    public void setUserPatronymic(){
        // view.showEnterPatronymic();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserPatronymic = userInput;
                break;
            }else{
                // view.showInvalidPatronymic();
            }
        }
    }
    public void setUserNickname(){
        // view.showEnterNickname();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserPatronymic = userInput;
                break;
            }else{
                // view.showInvalidNickname();
            }
        }
    }
    public void setUserComment(){
        // view.showEnterComment();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.length()<=50){
                correctUserComment = userInput;
                break;
            }else{
                // view.showInvalidComment();
            }
        }
    }
    public void setUserGroup(){
        // view.showEnterNickname();
        while (true) {
            String userInput = scanner.nextLine();
            for(Group group: Group.values()){
                String strGroup = group.toString();
                if(strGroup.equals(userInput)){
                    correctUserGroup = group;
                    break;
                }
            }
            // view.showInvalidGroup();
        }
    }
    public void setUserHomePhoneNumber(){
        // view.showEnterUserHomePhoneNumber();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkPhoneNumber(userInput)){
                correctUserHomePhoneNumber = userInput;
                break;
            }else{
                // view.showInvalidPhoneNumber();
            }
        }
    }
    public void setUserFirstMobilePhoneNumber(){
        // view.showEnterUserFirstMobilePhoneNumber();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkPhoneNumber(userInput)){
                correctUserFirstMobilePhoneNumber = userInput;
                break;
            }else{
                // view.showInvalidPhoneNumber();
            }
        }
    }
    public void setUserSecondMobilePhoneNumber(){
        // view.showEnterUserSecondMobilePhoneNumber();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkPhoneNumber(userInput)){
                correctUserSecondMobilePhoneNumber = userInput;
                break;
            }else{
                // view.showInvalidPhoneNumber();
            }
        }
    }
    public void setUserEmail(){
        // view.showEnterUserEmail();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkEmail(userInput)){
                correctUserSecondMobilePhoneNumber = userInput;
                break;
            }else{
                // view.showInvalidEmail();
            }
        }
    }
    public void setSkype(){
        // view.showEnterUserSkype();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkEmail(userInput)){
                correctUserSecondMobilePhoneNumber = userInput;
                break;
            }else{
                // view.showInvalidSkype();
            }
        }
    }
    public void setAddress(){
        // view.showEnterUserIndex();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDigitsOnly(userInput)){
                correctAddress.setIndex(userInput);
                break;
            }else{
                // view.showInvalidIndex();
            }
        }
        // view.showEnterUserCity();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctAddress.setCity(userInput);
                break;
            }else{
                // view.showInvalidCity();
            }
        }
        // view.showEnterUserStreet();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctAddress.setStreet(userInput);
                break;
            }else{
                // view.showInvalidStreet();
            }
        }
        // view.showEnterUserHouseNumber();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDigitsOnly(userInput)){
                correctAddress.setHouseNumber(userInput);
                break;
            }else{
                // view.showInvalidHouseNumber();
            }
        }
        // view.showEnterUserFlatNumber();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDigitsOnly(userInput)){
                correctAddress.setFlatNumber(userInput);
                break;
            }else{
                // view.showInvalidFlatNumber();
            }
        }
    }
}
