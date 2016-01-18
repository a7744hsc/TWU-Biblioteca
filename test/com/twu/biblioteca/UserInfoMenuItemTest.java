package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hchan on 1/19/16.
 */
public class UserInfoMenuItemTest {
    @Test
    public void ShouldPrintUserInfo(){
        PrintStream printStream = mock(PrintStream.class);
        User.currentUser = new User("id","name","emai","add","phone","password");
        UserInfoMenuItem userInfo = new UserInfoMenuItem("UserInformation",printStream);
        userInfo.doAction();
        verify(printStream).println(User.currentUser);
    }
}
