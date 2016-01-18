package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

/**
 * Created by hchan on 1/7/16.
 */
public class MenuTest {
    @Test
    public void shouldDisplayMenu(){
        PrintStream printStream=mock(PrintStream.class);
        Menu menu = new Menu(null,printStream,System.in);
        menu.showMenu();
        verify(printStream,times(5)).println(anyString());
    }

    @Test
    public void shouldReturnNumOfMenuItems(){
        Menu menu = new Menu(null,System.out,System.in);
        int numOfMenuItems = menu.getMenuSize();
        assertEquals(4,numOfMenuItems);
    }

}
