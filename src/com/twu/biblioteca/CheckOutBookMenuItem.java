package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hchan on 1/9/16.
 */
public class CheckOutBookMenuItem extends MenuItemBase {

    private PrintStream printStream;
    private InputStream inputStream;
    private List<Book> books;

    public CheckOutBookMenuItem(String itemName, PrintStream printStream, InputStream inputStream, List<Book> books) {
        super(itemName);
        this.printStream = printStream;
        this.inputStream = inputStream;
        this.books = books;
    }

    @Override
    void doAction() {
        showGuideInfo();
        String nameOfBook = getInput();
        Boolean checkResult = checkOutBook(books,nameOfBook);
        if(checkResult){
            printStream.println("Thank you! Enjoy the book.");
        }else {
            printStream.println("That book is not available.");
        }

    }

    public boolean checkOutBook(List<Book> books,String nameOfBook){
        if(bookExistOrAvailable(books,nameOfBook)){
            for(Book bk :books){
                if(bk.getName().equals(nameOfBook)){
                    bk.setAvailable(false);
                    bk.setCheckOutby(User.currentUser.getLibNum());
                    return true;
                }
            }
        }

        return false;

    }

    private Boolean bookExistOrAvailable(List<Book> books, String nameOfBook) {
        for(Book bk : books){
            if(bk.getName().equals(nameOfBook) && bk.getAvailable() == true)
                return true;
        }
        return false;
    }

    private String getInput(){
        Scanner sc =new Scanner(inputStream);
        return sc.nextLine();
    }

    private void showGuideInfo(){
        printStream.println("Please enter the NAME of the book you want to check out");
    }
}
