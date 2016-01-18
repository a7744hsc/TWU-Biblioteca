package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by hchan on 1/18/16.
 */
public class ReturnMenuItemTest {
    @Test
    public void ShouldPrintGuideInfo(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream in_nocode = new ByteArrayInputStream("any Book".getBytes());
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        books.add(b1);
        books.add(new Book("test2","testau",1998));
        ReturnMenuItem returnMenuItem=new ReturnMenuItem("CheckOut",printStream,in_nocode,books);
        returnMenuItem.doAction();
        verify(printStream,times(1)).println("Please enter the NAME of the book you want to Return");

    }

    @Test
    public void ShouldCheckOutBookSuccessfully(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream inputStream = mock(InputStream.class);
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        b1.setAvailable(false);
        books.add(b1);
        books.add(new Book("test2","testau",1998));
        ReturnMenuItem returnMenuItem=new ReturnMenuItem("CheckOut",printStream,inputStream,books);

        Boolean result = returnMenuItem.returnBook(books,"test1");
        assertEquals(true,b1.getAvailable());
        assertEquals(true,result);
    }

    @Test
    public void ShouldNotCheckOutBookNotAvailable(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream inputStream = mock(InputStream.class);
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        books.add(b1);
        ReturnMenuItem returnMenuItem=new ReturnMenuItem("CheckOut",printStream,inputStream,books);
        Boolean result = returnMenuItem.returnBook(books,"test1");
        assertEquals(true,b1.getAvailable());
        assertEquals(false,result);
    }

    @Test
    public void ShouldReturnInfoWhenSuccess(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream in_nocode = new ByteArrayInputStream("test1".getBytes());
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        b1.setAvailable(false);
        books.add(b1);
        books.add(new Book("test2","testau",1998));
        ReturnMenuItem returnMenuItem=new ReturnMenuItem("CheckOut",printStream,in_nocode,books);

        returnMenuItem.doAction();
        assertEquals(true,b1.getAvailable());
        verify(printStream).println("Thank you for returning the book.");
    }

    @Test
    public void ShouldReturnInfoWhenFail(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream in_nocode = new ByteArrayInputStream("test1".getBytes());
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        books.add(b1);
        books.add(new Book("test2","testau",1998));
        ReturnMenuItem returnMenuItem=new ReturnMenuItem("CheckOut",printStream,in_nocode,books);

        returnMenuItem.doAction();
        assertEquals(true,b1.getAvailable());
        verify(printStream).println("That is not a valid book to return.");
    }
}
