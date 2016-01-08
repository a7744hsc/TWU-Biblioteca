package com.twu.biblioteca;

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

    public Menu(List<Book> bookList, PrintStream printStream) {
        this.printStream = printStream;
        menuItemBaseMap = new HashMap<>();
        menuItemBaseMap.put(1,new ListBookMenuItem("ListAllBooks",bookList,printStream));


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


}
