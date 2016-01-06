package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by hchan on 1/6/16.
 */
public class LibraryController {
    private List<Book> bookList;
    PrintStream printStream;

    public LibraryController(List<Book> bookList, PrintStream printStream) {
        this.bookList = bookList;
        this.printStream = printStream;
    }

    public void showBooks(){
        for(Book b : bookList){
            printStream.println(b);
        }

    }
}
