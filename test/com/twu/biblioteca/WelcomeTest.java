package com.twu.biblioteca;

import org.junit.Test;
import static org.mockito.Mockito.*;
import java.io.PrintStream;

/**
 * Created by hchan on 12/23/15.
 */

public class WelcomeTest {

    @Test
    public void testshowMessage() throws Exception {
        PrintStream printStream=mock(PrintStream.class);
        Welcome welcomIns = new Welcome(printStream);
        welcomIns.showWelcomeMessage();
        verify(printStream, times(1)).print(anyString());
    }
}
