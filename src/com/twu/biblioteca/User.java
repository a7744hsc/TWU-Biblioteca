package com.twu.biblioteca;

import java.util.SplittableRandom;

/**
 * Created by hchan on 1/19/16.
 */
public class User {
    public static User currentUser = null;
    private String libNum;
//    name, email address and phone number
    private String name;
    private String email;
    private String address;
    private String phoneNum;
    private String passwd;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User(String libNum, String name, String email, String address, String phoneNum,String passwd) {
        this.libNum = libNum;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.passwd = passwd;
    }

    public String getLibNum() {
        return libNum;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
