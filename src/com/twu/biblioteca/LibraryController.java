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
    private List<Movie> movieList;
    private PrintStream printStream;
    private InputStream inputStream;
    private Menu menu;
    private Integer menuSize;


    public LibraryController(List<Book> bookList, List<Movie> movies, PrintStream printStream, InputStream inputStream) {
        this.bookList = bookList;
        this.movieList = movies;
        this.printStream = printStream;
        this.inputStream = inputStream;
        menu = new Menu(bookList,movieList,printStream,inputStream);
        menuSize = menu.getMenuSize();
    }



    public void startInteraction(){
        while(true){
            printStream.println();
            menu.showMenu();
            int uInput = getUserInput();
            menu.excuteMethod(uInput);
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
