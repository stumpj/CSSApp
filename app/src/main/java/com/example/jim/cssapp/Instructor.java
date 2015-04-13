package com.example.jim.cssapp;

import java.io.Serializable;

/**
 * Created by Jim on 4/13/2015.
 */
public class Instructor implements Serializable {

    private String myName;
    private String myTitle;
    private String myEmail;
    private String myPhone;
    private String myOffice;
    private String myBio;
    private String myCourses;

    public Instructor(String myName, String myTitle, String myEmail, String myPhone, String myOffice, String myBio, String myCourses) {
        this.myName = myName;
        this.myTitle = myTitle;
        this.myEmail = myEmail;
        this.myPhone = myPhone;
        this.myOffice = myOffice;
        this.myBio = myBio;
        this.myCourses = myCourses;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "myName='" + myName + '\'' +
                ", myTitle='" + myTitle + '\'' +
                ", myEmail='" + myEmail + '\'' +
                ", myPhone='" + myPhone + '\'' +
                ", myOffice='" + myOffice + '\'' +
                ", myBio='" + myBio + '\'' +
                ", myCourses='" + myCourses + '\'' +
                '}';
    }


    public String getMyName() {
        return myName;
    }

    public String getMyTitle() {
        return myTitle;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public String getMyPhone() {
        return myPhone;
    }

    public String getMyOffice() {
        return myOffice;
    }

    public String getMyBio() {
        return myBio;
    }

    public String getMyCourses() {
        return myCourses;
    }
}
