package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;


public class Biblioteca {
    
    private Library library;

    public Biblioteca() {
        library = new Library();
        library.addMultipleBooks();
    }

    public String getWelcome() {
        return "Welcome to Biblioteca";
    }

    public void run(){
        System.out.println(getWelcome()+"\n");
        StringBuilder menu = getMenu();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(menu);
            System.out.println("enter your option");
            int option = sc.nextInt();
            optionHandler(option);
        }
    }

    private void optionHandler(int option) {
        switch(option){
            case 1:
                showBooks();
                break;
            case 2 :
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }

    private void showBooks() {
        System.out.println(showBooksList(library.getBooksList()));
    }


    private String showBooksList(List<Book> allBooks) {
        String bookHistory = getHeader();
        for(Book book : allBooks){
            bookHistory += book.toString();
        }
        return bookHistory;
    }

    private String getHeader() {
        return "BookName\t\tAuthor\t\tYear\n";
    }

    private StringBuilder getMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Menu\n");
        menu.append("List of Books\n");
        menu.append("Quit");
        return menu;
    }
}
