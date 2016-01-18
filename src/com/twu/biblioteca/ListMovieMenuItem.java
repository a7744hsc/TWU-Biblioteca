package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by hchan on 1/18/16.
 */
public class ListMovieMenuItem extends MenuItemBase {
    private PrintStream printStream;
    private List<Movie> movies;

    public ListMovieMenuItem(String itemName, PrintStream printStream, List<Movie> movies) {
        super(itemName);
        this.printStream = printStream;
        this.movies = movies;
    }

    @Override
    void doAction() {
        printStream.println();
        printStream.println(String.format("%-23s%-23s%-23s%s", "Name", "Director","Year","Rate"));
        printStream.println("==================================================================");
        for(Movie m : movies){
                printStream.println(m);
        }
    }
}
