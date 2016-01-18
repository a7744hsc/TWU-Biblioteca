package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by hchan on 1/9/16.
 */
public class CheckOutMenuItemTest {

    @Test
    public void ShouldPrintGuideInfo(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream in_nocode = new ByteArrayInputStream("any Book".getBytes());
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        books.add(b1);
        books.add(new Book("test2","testau",1998));
        CheckOutMenuItem checkOutMenuItem=new CheckOutMenuItem("CheckOut",printStream,in_nocode,books);
        checkOutMenuItem.doAction();
        verify(printStream,times(1)).println("Please enter the NAME of the book you want to check out");

    }

    @Test
    public void ShouldCheckOutBookSuccessfully(){
        PrintStream printStream = mock(PrintStream.class);
        InputStream inputStream = mock(InputStream.class);
        List<Book> books= new ArrayList<Book>();
        Book b1 = new Book("test1","testau",1995);
        books.add(b1);
        books.add(new Book("test2","testau",1998));

        CheckOutMenuItem checkOutMenuItem=new CheckOutMenuItem("CheckOut",printStream,inputStream,books);
        Boolean result = checkOutMenuItem.checkOutBook(books,"test1");
        assertEquals(false,b1.getAvailable());
        assertEquals(true,result);
    }
}
