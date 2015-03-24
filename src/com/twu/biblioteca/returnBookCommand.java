package com.twu.biblioteca;

import java.util.Scanner;


public class ReturnBookCommand implements Command {
    private  Library library;
    private String customerName;

    public ReturnBookCommand(Library library, String customerName) {
        this.library = library;
        this.customerName = customerName;
    }

    @Override
    public void execute() throws BibliotecaQuitException{
        Book book = getBook();
        try {
            String message = library.returnBook(book, customerName);
            System.out.println(message);
        } catch ( BookNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    private Book getBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BOOK NAME:---");
        String name = sc.nextLine().trim();
        System.out.println("ENTER BOOK AUTHOR NAME:---");
        String author = sc.nextLine().trim();
        System.out.println("ENTER BOOK PUBLICATION YEAR:---");
        int year = sc.nextInt();
        return new Book(name,author,year);
    }
}
