package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    private void run(){
        showWelcomeMessage("welcome",System.out);
    }


    private void showWelcomeMessage(String welcomeStr, PrintStream ps) {
        ps.println(welcomeStr);
    }

    public static void main(String[] args) {
       new BibliotecaApp().run();
    }
}

