package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hchan on 1/18/16.
 */
public class ReturnMenuItem extends MenuItemBase {
    private PrintStream printStream;
    private InputStream inputStream;
    private List<Book> books;

    public ReturnMenuItem(String itemName, PrintStream printStream, InputStream inputStream, List<Book> books) {
        super(itemName);
        this.printStream = printStream;
        this.inputStream = inputStream;
        this.books = books;
    }

    @Override
    void doAction() {
        showGuideInfo();
        String nameOfBook = getInput();
        boolean result = returnBook(books,nameOfBook);
        if(result)
            printStream.println("Thank you for returning the book.");
        printStream.println("That is not a valid book to return.");
    }

    private String getInput() {
        Scanner sc =new Scanner(inputStream);
        return sc.nextLine();
    }

    private void showGuideInfo() {
        printStream.println("Please enter the NAME of the book you want to Return");
    }

    public boolean returnBook(List<Book> books,String nameOfBook){
        if(bookExistAndCheckedOut(books,nameOfBook)){
            for(Book bk :books){
                if(bk.getName().equals(nameOfBook)){
                    bk.setAvailable(true);
                    return true;
                }
            }
        }

        return false;
    }

    private boolean bookExistAndCheckedOut(List<Book> books,String nameOfBook){
        for(Book bk : books){
            if(bk.getName().equals(nameOfBook) && bk.getAvailable() == false)
                return true;
        }
        return false;
    }


}
