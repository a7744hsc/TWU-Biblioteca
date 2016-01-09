package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by hchan on 1/7/16.
 */
public class ListBookMenuItem extends MenuItemBase {

    private List<Book> bookList;
    private PrintStream printStream;

    public ListBookMenuItem(String itemName, List<Book> bookList, PrintStream printStream) {
        super(itemName);
        this.bookList = bookList;
        this.printStream = printStream;
    }

    @Override
    void doAction() {
        printStream.println();
        printStream.println(String.format("%-30s%-30s%s", "Name", "Author","Year"));
        printStream.println("==================================================================");
        for(Book b : bookList){
            printStream.println(b);
        }

    }
}
