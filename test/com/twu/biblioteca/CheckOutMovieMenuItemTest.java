package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hchan on 1/18/16.
 */
public class CheckOutMovieMenuItemTest {
    @Test
    public void shouldCheckOutSuccessfully(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream in_nocode = new ByteArrayInputStream("movie1".getBytes());
        List<Movie> movies = new ArrayList<>();
        Movie m = new Movie("movie1",1998,"Grace Li",9.9);
        movies.add(m);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem("CheckOutMovie",printStream,in_nocode,movies);
        checkOutMovieMenuItem.doAction();
        verify(printStream).println("Check out successfully");
        assertEquals(m.isAvailable(),false);
    }

    @Test
    public void shouldNotCheckOutIfInputIncorrect(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream in_nocode = new ByteArrayInputStream("movie2".getBytes());
        List<Movie> movies = new ArrayList<>();
        Movie m = new Movie("movie1",1998,"Grace Li",9.9);
        movies.add(m);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem("CheckOutMovie",printStream,in_nocode,movies);
        checkOutMovieMenuItem.doAction();
        verify(printStream).println("Movie not available");
        assertEquals(m.isAvailable(),true);
    }
}
