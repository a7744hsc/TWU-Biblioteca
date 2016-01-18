package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hchan on 1/19/16.
 */
public class UserTest {

    @Test
    public void shouldInitialaValidUser(){
        User user = new User("123-4567","Grace","graceli@tw.com","beijing","1234567","00000");
        assertEquals("123-4567",user.getLibNum());
        assertEquals("Grace",user.getName());
        assertEquals("graceli@tw.com",user.getEmail());
        assertEquals("beijing",user.getAddress());
        assertEquals("1234567",user.getPhoneNum());
        assertEquals("00000",user.getPasswd());
    }

    @Test
    public void shouldReturnFormattedString(){
        User user = new User("123-4567","Grace","graceli@tw.com","beijing","1234567","00000");
        assertEquals("UserName:Grace  Email:graceli@tw.com  address:beijing  phone number:1234567",user.toString());
    }
}
