package ua.epam.controller;

import ua.epam.model.Address;
import ua.epam.model.Group;
import ua.epam.model.Notebook;
import ua.epam.view.View;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Lev_Serba on 9/20/2016.
 */
public class Controller {
    private Notebook notebook;
    private View view;
    private Scanner scanner = new Scanner(System.in);

    private int flag = 0;

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
    private String correctUserAddDate;
    private String correctUserChangeDate;

    public Controller(Notebook notebook, View view){
        this.notebook = notebook;
        this.view = view;
    }


    public boolean checkLettersOnly(String strForCheck){
        if(strForCheck.matches("[A-Za-z]+")){
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

    public boolean checkGroup(String strForCheck){
        if(strForCheck.matches("(Friends)|(Relatives)|(Others)")){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkDate(String strForCheck){
        if(strForCheck.matches("^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$")){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkComment(String strForCheck){
        if(strForCheck.matches("^[^0-9]{1,50}$")){
            return true;
        }
        else{
            return false;
        }
    }

    public void setUserName(){
        view.showToConsole(View.ENTER_NAME);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserName = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_NAME);
            }
        }
    }

    public void setUserLastName(){
        view.showToConsole(View.ENTER_LASTNAME);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserLastName = userInput;
                break;
            }else{
                 view.showToConsole(View.WRONG_INPUT + View.ENTER_LASTNAME);
            }
        }
    }

    public void setUserPatronymic(){
        view.showToConsole(View.ENTER_PATRONYMIC);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctUserPatronymic = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_PATRONYMIC);
            }
        }
    }

    public void setUserNickname(){
        view.showToConsole(View.ENTER_NICKNAME);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkNickname(userInput)){
                correctUserNickname = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_NICKNAME);
            }
        }
    }

    public void setUserComment(){
        view.showToConsole(View.ENTER_COMMENT);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkComment(userInput)){
                correctUserComment = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_COMMENT);
            }
        }
    }

    public void setUserGroup(){
        view.showToConsole(View.ENTER_GROUP);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkGroup(userInput)) {
                correctUserGroup = Group.valueOf(userInput);
                break;
            } else {
                view.showToConsole(View.WRONG_INPUT + View.ENTER_GROUP);
            }
        }
    }

    public void setUserHomePhoneNumber(){
        view.showToConsole(View.ENTER_HOMEPHONE);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkPhoneNumber(userInput)){
                correctUserHomePhoneNumber = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_HOMEPHONE);
            }
        }
    }

    public void setUserFirstMobilePhoneNumber(){
        view.showToConsole(View.ENTER_FIRSTMOBILEPHONE);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkPhoneNumber(userInput)){
                correctUserFirstMobilePhoneNumber = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_FIRSTMOBILEPHONE);
            }
        }
    }

    public void setUserSecondMobilePhoneNumber(){
        view.showToConsole(View.ENTER_SECONDMOBILEPHONE);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkPhoneNumber(userInput)){
                correctUserSecondMobilePhoneNumber = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_SECONDMOBILEPHONE);
            }
        }
    }

    public void setUserEmail(){
        view.showToConsole(View.ENTER_EMAIL);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkEmail(userInput)){
                correctUserSecondMobilePhoneNumber = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_EMAIL);
            }
        }
    }

    public void setSkype(){
        view.showToConsole(View.ENTER_SKYPE);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkSkype(userInput)){
                correctUserSecondMobilePhoneNumber = userInput;
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_SKYPE);
            }
        }
    }

    public void setAddress(){
        view.showToConsole(View.ENTER_INDEX);
        correctAddress = new Address();
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDigitsOnly(userInput)){
                correctAddress.setIndex(userInput);
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_INDEX);
            }
        }
        view.showToConsole(view.ENTER_CITY);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctAddress.setCity(userInput);
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_CITY);
            }
        }
        view.showToConsole(View.ENTER_STREET);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkLettersOnly(userInput)){
                correctAddress.setStreet(userInput);
                break;
            }else{
                view.showToConsole(View.WRONG_INPUT + View.ENTER_STREET);
            }
        }
         view.showToConsole(view.ENTER_HOUSE_NUMBER);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDigitsOnly(userInput)){
                correctAddress.setHouseNumber(userInput);
                break;
            }else{
                 view.showToConsole(View.WRONG_INPUT + View.ENTER_HOUSE_NUMBER);
            }
        }
         view.showToConsole(View.ENTER_FLAT_NUMBER);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDigitsOnly(userInput)){
                correctAddress.setFlatNumber(userInput);
                break;
            }else{
                 view.showToConsole(View.WRONG_INPUT + View.ENTER_FLAT_NUMBER);
            }
        }
    }

    public void setDate(){
        view.showToConsole(View.ENTER_DATA_REGISTER);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDate(userInput)){
                correctUserAddDate = userInput;
                break;
            }else{
                 view.showToConsole(View.WRONG_INPUT + View.ENTER_DATA_REGISTER);
            }
        }
    }

    public void setDateOfChanges(){
         view.showToConsole(View.ENTER_DATA_CHANGES);
        while (true) {
            String userInput = scanner.nextLine();
            if (checkDate(userInput)){
                correctUserChangeDate = userInput;
                break;
            }else{
                 view.showToConsole(View.WRONG_INPUT + View.ENTER_DATA_CHANGES);
            }
        }
    }

    public void pushInModel(){
        notebook.setName(correctUserName);
        notebook.setLastName(correctUserLastName);
        notebook.setPatronymic(correctUserPatronymic);
        notebook.setNickname(correctUserNickname);
        notebook.setComment(correctUserComment);
        notebook.setGroup(correctUserGroup);
        notebook.setHomePhoneNumber(correctUserHomePhoneNumber);
        notebook.setFirstMobilePhoneNumber(correctUserFirstMobilePhoneNumber);
        notebook.setSecondMobilePhoneNumber(correctUserSecondMobilePhoneNumber);
        notebook.setAddress(correctAddress);
        notebook.setNoteAddedDate(correctUserAddDate);
        notebook.setNoteLastChange(correctUserChangeDate);
        flag = 1;
    }

    public void printModel(){
        if(flag == 1){
            view.showToConsole(notebook.toString());
        }
    }
}
