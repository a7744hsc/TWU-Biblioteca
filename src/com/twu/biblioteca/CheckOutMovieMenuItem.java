package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hchan on 1/18/16.
 */
public class CheckOutMovieMenuItem extends MenuItemBase {
    private PrintStream printStream;
    private InputStream inputStream;
    private List<Movie> movies;

    public CheckOutMovieMenuItem(String itemName, PrintStream printStream, InputStream inputStream, List<Movie> movies) {
        super(itemName);
        this.printStream = printStream;
        this.inputStream = inputStream;
        this.movies = movies;
    }

    @Override
    void doAction() {
        showGuideInfo();
        String movieName = getInput();
        if (movieExistandAvailable(movies, movieName)) {
            for (Movie m : movies) {
                if (m.getName().equals(movieName)) {
                    m.setAvailable(false);
                    printStream.println("Check out successfully");
                    return;
                }
            }
        }
        printStream.println("Movie not available");
    }


    private Boolean movieExistandAvailable(List<Movie> movies, String movieName) {
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName) && movie.isAvailable() == true)
                return true;
        }
        return false;
    }

    private String getInput() {
        Scanner sc = new Scanner(inputStream);
        return sc.nextLine();
    }

    private void showGuideInfo() {
        printStream.println("Please enter the NAME of the movie you want to check out");
    }
}
