package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Menu implements Iterable<MenuItem> {
    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<MenuItem>();
    }

    public void addItem(MenuItem item){
        menuItems.add(item);
    }

    public void handleOption(int option) throws BibliotecaQuitException, InvalidOptionException {
        if(option<0 || option>menuItems.size())
            throw new InvalidOptionException("Invalid Option! Try again......."+System.lineSeparator());
        menuItems.get(option - 1).performAction();
    }


    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }

}