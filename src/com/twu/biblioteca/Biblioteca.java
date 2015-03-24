package com.twu.biblioteca;

import java.util.Scanner;

public class Biblioteca {
    private Library library;
    private final Menu menu;
    private boolean keepRunning ;

    public Biblioteca() {
        library = new Library();
        menu =  new Menu();
        keepRunning = true;
    }

    public String getWelcome() {
        return "Welcome to Biblioteca"+System.lineSeparator();
    }



    public void run(){
        library.add(new Book("The Adventures", "Canon", 1995));
        library.add(new Book("Wings Of Fire", "APJ Kalam", 1996));
        library.add(new Book("Ramayan", "valmiki", 1997));
        menu.addItem(new MenuItem("List Books", new ListBookCommand(library, System.out)));
        menu.addItem(new MenuItem("Quit", new QuitCommand()));
        menu.addItem(new MenuItem("CheckOut Books", new CheckOutCommand(library,"vikya")));
        menu.addItem(new MenuItem("ReturnBook",new ReturnBookCommand(library,"vikya")));
        System.out.println(getWelcome());
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
