package com.twu.biblioteca;

import org.junit.Test;
import static  org.junit.Assert.assertEquals;

/**
 * Created by hchan on 1/18/16.
 */
public class MovieTest {
    @Test
    public void shouldInitialaValidMovie(){
        Movie m = new Movie("movie1",1998,"Grace Li",9.9);
        assertEquals("movie1",m.getName());
        assertEquals(1998,m.getYear());
        assertEquals("Grace Li",m.getDirector());
        assertEquals(9.9,m.getRate(),0.01);
    }
}
