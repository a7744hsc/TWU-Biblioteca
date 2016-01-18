package com.twu.biblioteca;

import java.io.*;
import java.security.PublicKey;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private Welcome welcome;
    private LibraryController libController;

    public BibliotecaApp() {
        List<Book> books = initializeBooks();
        List<Movie> movies = initializeMovies();
        List<User> users = new ArrayList<User>();
        users.add(new User("1-234","admin","admin@tw.com","beijing","010-88888888"));
        welcome = new Welcome(System.out);
        libController = new LibraryController(books,movies,System.out,System.in);
    }

    private void run(){
        welcome.showWelcomeMessage();
        libController.startInteraction();
    }

    public List<Book> initializeBooks(){
        List<Book> books = new ArrayList<>();

        try {
            File book = new File("res/BookList");
            if (book.isFile() && book.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(book));
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    String[] bookInfo = lineTxt.split("&&");
                    books.add(new Book(bookInfo[0],bookInfo[1],Integer.parseInt(bookInfo[2])));
                }
            }
        }catch (IOException e){
            throw new RuntimeException("Open BookList Failed");
        }
        return books;
    }

    public List<Movie> initializeMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Dirty Grandpa",2016,"Dan Mazer",8));
        movies.add(new Movie("The 5th Wave",2016,"J Blakeson",8.1));
        movies.add(new Movie("Daddy's Home ",2015,"Sean Anders",6.5));
        return movies;
    }

    public static void main(String[] args) {
        new BibliotecaApp().run();
//        String aaa= String.format("%-30s%-30s%s", "myname", "author","1990");
//        System.out.println(aaa);
    }
}


