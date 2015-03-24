package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {
    private Library library;
    private final Menu menu;
    private boolean keepRunning ;

    public Biblioteca() {
        library = new Library();
        library.addMultipleBooks();
        menu =  new Menu();
        keepRunning = true;
    }

    public String getWelcome() {
        return "Welcome to Biblioteca";
    }

    public void run(){
        menu.addItem(new MenuItem("List Books",new ListBookCommand(library,System.out)));
        menu.addItem(new MenuItem("Quit",new QuitCommand()));
        System.out.println(getWelcome()+"\n");
        Scanner sc = new Scanner(System.in);
        while(keepRunning){
            System.out.println(showMenu());
            System.out.println("enter your option");
            int option = sc.nextInt();
            try{
                menu.handleOption(option);
            }catch (BibliotecaQuitException e){
                System.out.println(e.getMessage());
                keepRunning = false;
            }
            catch (InvalidOptionException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public String showMenu(){
        String menuList ="Menu:\n";
        int i = 0;
        for (MenuItem item : menu) {
            menuList += (++i) + ". " + item.toString() + System.lineSeparator();
        }
        return menuList;
    }
}
