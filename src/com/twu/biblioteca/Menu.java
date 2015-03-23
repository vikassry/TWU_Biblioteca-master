package com.twu.biblioteca;

import java.util.List;

public class Menu {

    private Library library;

    public Menu(Library library) {
        this.library = library;
    }

    void optionHandler(int option) {
        switch (option) {
            case 1:
                showBooks();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println(" Invalid Option ! Try Again\n");
        }
    }

    public String getMenu() {
        return  "Menu\n"+"1. List of Books\n"+"2. Quit";
    }

    private void showBooks() {
        System.out.println(showBooksList(library.getBooksList()));
    }

    private String showBooksList(List<Book> allBooks) {
        String bookHistory = "";
        for(Book book : allBooks){
            bookHistory += book.toString();
        }
        return bookHistory;
    }

}