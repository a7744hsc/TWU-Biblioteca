package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by hchan on 1/9/16.
 */
public class CheckOutMenuItem extends MenuItemBase {

    private PrintStream printStream;
    private InputStream inputStream;

    public CheckOutMenuItem(String itemName, PrintStream printStream, InputStream inputStream) {
        super(itemName);
        this.printStream = printStream;
        this.inputStream = inputStream;
    }

    @Override
    void doAction() {

    }

    public void showGuideInfo(){
        printStream.println("Please enter the NAME of the book you want to check out");
    }
}
