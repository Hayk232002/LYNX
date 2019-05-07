package com.example.lynx;

public class UserInfoModel {
    String FirstName;
    String LastName;
    String day;
    String month;
    String year;
    String sex;
    int phone;
    String uid;
    String downloadUri;

    public UserInfoModel(){

    }

    public UserInfoModel(String firstName, String lastName, String day, String month, String year, String sex, int phone, String uid, String downloadUri) {
        FirstName = firstName;
        LastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sex = sex;
        this.phone = phone;
        this.uid = uid;
        this.downloadUri = downloadUri;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDownloadUri() {
        return downloadUri;
    }

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }
}
