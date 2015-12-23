package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {
    private Welcome welcome;

    private BibliotecaApp() {
        welcome = new Welcome(System.out);
    }

    private void run(){
        welcome.showWelcomeMessage();
    }

    public static void main(String[] args) {
       new BibliotecaApp().run();

    }
}

