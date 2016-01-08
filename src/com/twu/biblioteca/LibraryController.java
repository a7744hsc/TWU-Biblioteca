package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Exchanger;

/**
 * Created by hchan on 1/6/16.
 */
public class LibraryController {
    private List<Book> bookList;
    private PrintStream printStream;
    private InputStream inputStream;
    private Menu menu;
    private Integer menuSize;


    public LibraryController(List<Book> bookList, PrintStream printStream, InputStream inputStream) {
        this.bookList = bookList;
        this.printStream = printStream;
        this.inputStream = inputStream;
        menu = new Menu(bookList,printStream);
        menuSize = menu.getMenuSize();
    }

    public void showBooks(){
        printStream.println();
        printStream.println(String.format("%-30s%-30s%s", "Name", "Author","Year"));
        printStream.println("==================================================================");
        for(Book b : bookList){
            printStream.println(b);
        }

    }

    public void startInteraction(){
        printStream.println();
        menu.showMenu();
        while(true){
            int uInput = getUserInput();
//            if(uInput == menuSize)
//                break;
//            else {
//
//            }
        }
    }

    private int getUserInput(){
        printStream.println("Please select a action.");
        Scanner sc =new Scanner(inputStream);
        do {
            String input = sc.nextLine();
            try {
                int parseInt = Integer.parseInt(input);
                if (parseInt > 0 && parseInt <= menuSize){
                    return parseInt;
                }
                else
                    printStream.println("Select a valid option!");
            }catch (Exception e){
                printStream.println("Select a valid option!");

            }

        }while (true);



    }
}
