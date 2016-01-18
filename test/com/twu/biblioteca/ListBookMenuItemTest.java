package com.twu.biblioteca;

import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by hchan on 1/8/16.
 */
public class ListBookMenuItemTest {

    @Test
    public void testShowBooksOfOneBook(){
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book("TestName","TestAuthor",1995);
        books.add(b1);
        PrintStream printStream=mock(PrintStream.class);
        ListBookMenuItem listBookMenuItem = new ListBookMenuItem("ListBook", books,printStream);
        listBookMenuItem.doAction();
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
        ListBookMenuItem listBookMenuItem = new ListBookMenuItem("ListBook", books,printStream);
        listBookMenuItem.doAction();
        verify(printStream,times(1)).println(b1);
        verify(printStream,times(1)).println(b2);

    }

    @Test
    public void ShowNotDisplayBooksNotAvailable(){
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book("TestName","TestAuthor",1995);
        books.add(b1);
        Book b2 = new Book("TestName2","TestAuthor2",1995);
        b2.setAvailable(false);
        books.add(b2);
        PrintStream printStream=mock(PrintStream.class);
        ListBookMenuItem listBookMenuItem = new ListBookMenuItem("ListBook", books,printStream);
        listBookMenuItem.doAction();
        verify(printStream,times(1)).println(b1);
        verify(printStream,times(0)).println(b2);

    }
}
