package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hchan on 1/6/16.
 */
public class BookTest {

    @Test
    public void shouldInitialFieldsCorrectly(){
        Book b1 = new Book("TestName","TestAuthor",1990);
        assertEquals("TestName",b1.getName());
        assertEquals("TestAuthor",b1.getAuthor());
        assertEquals(true,b1.getAvailable());
    }

    @Test
    public void shouldSetBookAsNotAvailable(){
        Book b1 = new Book("TestName","TestAuthor",1990);
        b1.setAvailable(false);
        assertEquals(false,b1.getAvailable());
    }

    @Test
    public void shouldFormatTheBookCorrectly(){
        Book b1 = new Book("TestName","TestAuthor",1990);
        assertEquals("TestName                      TestAuthor                    1990",b1.toString());

    }
}
