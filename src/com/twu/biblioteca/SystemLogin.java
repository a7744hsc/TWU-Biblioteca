package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hchan on 1/19/16.
 */
public class SystemLogin {
    private List<User> users;
    PrintStream printStream;
    InputStream inputStream;

    public SystemLogin(List<User> users, PrintStream printStream, InputStream inputStream) {
        this.users = users;
        this.printStream = printStream;
        this.inputStream = inputStream;
    }

    public void doLogin(){
        showGuideInfo();
        String userName= getInput();
        String passWord= getInput();
        for(User u:users){
            if(u.getLibNum().equals(userName)&&u.getPasswd().equals(passWord)){
                User.currentUser=u;
                return;
            }
        }
        System.exit(0);

    }

    private void showGuideInfo(){
        printStream.println("Please input your LibraryID and password");
    }

    private String getInput(){
        Scanner sc =new Scanner(inputStream);
        return sc.nextLine();
    }
}
