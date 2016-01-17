package com.twu.biblioteca;

import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;

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
        InputStream inputStream = mock(InputStream.class);

        CheckOutMenuItem checkOutMenuItem=new CheckOutMenuItem("CheckOut",printStream,inputStream);
        checkOutMenuItem.showGuideInfo();
        verify(printStream,times(1)).println("Please enter the NAME of the book you want to check out");

    }
}
