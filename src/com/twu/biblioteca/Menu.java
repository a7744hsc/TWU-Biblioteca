package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hchan on 1/6/16.
 */
public class Menu {
    private Map<Integer,MenuItemBase> menuItemBaseMap;
    private PrintStream printStream;
    private InputStream inputStream;

    public Menu(List<Book> bookList, List<Movie> movieList, PrintStream printStream, InputStream inputStream) {
        this.printStream = printStream;
        this.inputStream = inputStream;
        menuItemBaseMap = new HashMap<>();
        menuItemBaseMap.put(1,new ListBookMenuItem("ListAllBooks",bookList,printStream));
        menuItemBaseMap.put(2,new CheckOutBookMenuItem("CheckOutBooks",printStream,inputStream,bookList));
        menuItemBaseMap.put(3,new ReturnMenuItem("ReturnBooks",printStream,inputStream,bookList));
        menuItemBaseMap.put(4,new ListMovieMenuItem("ListMovies",printStream,movieList));
        menuItemBaseMap.put(5,new CheckOutMovieMenuItem("CheckOutMovies",printStream,inputStream,movieList));
        menuItemBaseMap.put(6,new QuitMenuItem("Quit"));


    }

    public void showMenu(){
        printStream.println("=========================== Main  Menu ===========================");
        for(int i=1;i<=menuItemBaseMap.keySet().size();i++){
            printStream.println(i+": "+menuItemBaseMap.get(i).getItemName());
        }

    }

    public Integer getMenuSize(){
        return menuItemBaseMap.size();
    }

    public void excuteMethod(int itemNum){
        menuItemBaseMap.get(itemNum).doAction();
    }


}
