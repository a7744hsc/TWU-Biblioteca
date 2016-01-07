package com.twu.biblioteca;

import org.junit.Test;

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
        Menu menu = new Menu(null,printStream);
        menu.showMenu();
        verify(printStream,times(1)).println(anyString());
    }
}
