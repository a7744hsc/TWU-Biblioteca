package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by hchan on 12/23/15.
 */
public class Welcome {
    private String welcomeString;
    private PrintStream printStream;

    public Welcome(PrintStream printStream) {
        this.printStream = printStream;
        welcomeString = "##      ## ######## ##        ######   #######  ##     ## ########\n"+
                        "##  ##  ## ##       ##       ##    ## ##     ## ###   ### ##\n"+
                        "##  ##  ## ##       ##       ##       ##     ## #### #### ##\n"+
                        "##  ##  ## ######   ##       ##       ##     ## ## ### ## ######\n"+
                        "##  ##  ## ##       ##       ##       ##     ## ##     ## ##\n"+
                        "##  ##  ## ##       ##       ##    ## ##     ## ##     ## ##\n"+
                        " ###  ###  ######## ########  ######   #######  ##     ## ########\n";
    }

    public void showWelcomeMessage(){
        printStream.print(welcomeString);
    }
}
