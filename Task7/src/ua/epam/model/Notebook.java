package ua.epam.model;

import java.util.Date;

/**
 * Created by Lev_Serba on 9/20/2016.
 */
public class Notebook {
    private String name;
    private String lastName;
    private String patronymic;
    private String nickname;
    private String comment;
    private Group group;
    private String homePhoneNumber;
    private String firstMobilePhoneNumber;
    private String secondMobilePhoneNumber;
    private String email;
    private String skype;
    private Address address;
    private String noteAddedDate;
    private String noteLastChange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getFirstMobilePhoneNumber() {
        return firstMobilePhoneNumber;
    }

    public void setFirstMobilePhoneNumber(String firstMobilePhoneNumber) {
        this.firstMobilePhoneNumber = firstMobilePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public void setSecondMobilePhoneNumber(String secondMobilePhoneNumber) {
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNoteAddedDate() {
        return noteAddedDate;
    }

    public void setNoteAddedDate(String noteAddedDate) {
        this.noteAddedDate = noteAddedDate;
    }

    public String getNoteLastChange() {
        return noteLastChange;
    }

    public void setNoteLastChange(String noteLastChange) {
        this.noteLastChange = noteLastChange;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", firstMobilePhoneNumber='" + firstMobilePhoneNumber + '\'' +
                ", secondMobilePhoneNumber='" + secondMobilePhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", noteAddedDate='" + noteAddedDate + '\'' +
                ", noteLastChange='" + noteLastChange + '\'' +
                '}';
    }
}
