package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

/**
 * Created by hchan on 1/7/16.
 */
public class MenuTest {
    @Test
    public void shouldDisplayMenu(){
        PrintStream printStream=mock(PrintStream.class);
        Menu menu = new Menu(null, null, printStream,System.in);
        menu.showMenu();
        verify(printStream,times(6)).println(anyString());
    }

    @Test
    public void shouldReturnNumOfMenuItems(){
        Menu menu = new Menu(null, null, System.out,System.in);
        int numOfMenuItems = menu.getMenuSize();
        assertEquals(6,numOfMenuItems);
    }

}
