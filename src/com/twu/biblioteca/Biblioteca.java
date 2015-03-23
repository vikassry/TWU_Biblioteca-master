package com.twu.biblioteca;

import java.util.Scanner;


public class Biblioteca {

    private Library library;
    private final Menu menu;
    private boolean keepRunning ;

    public Biblioteca() {
        library = new Library();
        library.addMultipleBooks();
        menu =  new Menu(library);
        keepRunning = true;
    }

    public String getWelcome() {
        return "Welcome to Biblioteca";
    }

    public void run(){
        System.out.println(getWelcome()+"\n");
        String optionList = menu.getMenu();
        Scanner sc = new Scanner(System.in);
        while(keepRunning){
            System.out.println(optionList);
            System.out.println("enter your option");
            int option = sc.nextInt();
            try{
                menu.optionHandler(option);
            }catch (Exception e){
                keepRunning = false;
            }
        }
    }

}
