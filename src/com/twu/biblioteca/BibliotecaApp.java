package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;


public class BibliotecaApp {
    private  BookStore bookStore;

    public BibliotecaApp(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public void addMultipleBooks(){
        bookStore.addMultipleBooks();
    }

    public String getWelcome() {
        return "Welcome to Biblioteca";
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        BibliotecaApp app = new BibliotecaApp(bookStore);
        System.out.println(app.getWelcome()+"\n");
        app.addMultipleBooks();
        StringBuilder menu = app.getMenu();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(menu);
            System.out.println("enter your option");
            int option = sc.nextInt();
            app.optionHandler(option);
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
        }
    }

    private void showBooks() {
        System.out.println(showBooksList(bookStore.getBooksList()));
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
