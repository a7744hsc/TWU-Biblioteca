package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    BibliotecaApp bibliotecaApp;
    @Before
    public void setupStreams() {
        bibliotecaApp = new BibliotecaApp();
    }

    @After
    public void cleanUpStreams() {

    }

    @Test
    public void shouldReturnListOfBook()
    {
        List<Book> bookList= bibliotecaApp.initializeBooks();
        assertEquals(4,bookList.size());
    }
}
