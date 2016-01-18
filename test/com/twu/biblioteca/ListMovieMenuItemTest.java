package com.twu.biblioteca;

import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by hchan on 1/18/16.
 */
public class ListMovieMenuItemTest {

    @Test
    public void shouldListAllMovies(){

        List<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie("Dirty Grandpa", 2016, "Dan Mazer", 8);
        movies.add(m1);
        Movie m2 = new Movie("The 5th Wave", 2016, "J Blakeson", 8.1);
        movies.add(m2);
        PrintStream printStream = mock(PrintStream.class);
        ListMovieMenuItem listMovieMenuItem = new ListMovieMenuItem("name",printStream,movies);
        listMovieMenuItem.doAction();
        verify(printStream,times(2)).println(anyString());
        verify(printStream,times(1)).println(m1);
        verify(printStream,times(1)).println(m2);
    }
}
