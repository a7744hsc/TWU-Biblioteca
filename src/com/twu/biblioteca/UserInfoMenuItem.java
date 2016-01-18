package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by hchan on 1/19/16.
 */
public class UserInfoMenuItem extends MenuItemBase{
    private PrintStream printStream;

    @Override
    void doAction() {
        printStream.println(User.currentUser);
    }

    public UserInfoMenuItem(String itemName, PrintStream printStream) {
        super(itemName);
        this.printStream = printStream;
    }
}
