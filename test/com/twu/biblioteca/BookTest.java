package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hchan on 1/6/16.
 */
public class BookTest {

    @Test
    public void shouldFormatTheBookCorrectly(){
        Book b1 = new Book("TestName","TestAuthor",1990);
        assertEquals("TestName                      TestAuthor                    1990",b1.toString());

    }
}
