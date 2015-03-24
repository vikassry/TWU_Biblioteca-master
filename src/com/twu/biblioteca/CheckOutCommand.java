package com.twu.biblioteca;

import java.util.Scanner;

public class CheckOutCommand implements Command{
    private  Library library;
    private String customerName;

    public CheckOutCommand(Library library, String customerName) {
        this.library = library;
        this.customerName = customerName;
    }

    @Override
    public void execute() throws BibliotecaQuitException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BOOK NAME:---");
        String name = sc.nextLine().trim();
        System.out.println("ENTER BOOK AUTHOR NAME:---");
        String author = sc.nextLine().trim();
        System.out.println("ENTER BOOK PUBLICATION YEAR:---");
        int year = sc.nextInt();
        Book book = new Book(name,author,year);
        try {
            String message = library.checkOutBook(book, customerName);
            System.out.println(message);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

