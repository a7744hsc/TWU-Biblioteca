package com.twu.biblioteca;

import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by hchan on 1/6/16.
 */
public class LibraryControllerTest {

    @Test
    public void testShowBooksOfOneBook(){
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book("TestName","TestAuthor",1995);
        books.add(b1);
        PrintStream printStream=mock(PrintStream.class);
        InputStream inputStream= mock(InputStream.class);
        LibraryController libController= new LibraryController(books,printStream,inputStream);
        libController.showBooks();
        verify(printStream,times(1)).println(b1);

    }

    @Test
    public void testShowBooksOfTwoBooks(){
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book("TestName","TestAuthor",1995);
        books.add(b1);
        Book b2 = new Book("TestName2","TestAuthor2",1995);
        books.add(b2);
        PrintStream printStream=mock(PrintStream.class);
        InputStream inputStream= mock(InputStream.class);
        LibraryController libController= new LibraryController(books,printStream,inputStream);
        libController.showBooks();
        verify(printStream,times(1)).println(b1);
        verify(printStream,times(1)).println(b2);

    }
}
