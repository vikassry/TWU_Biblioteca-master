package com.twu.biblioteca;

import java.util.Scanner;

public class CheckOutCommand implements Command{
    private String name;

    public CheckOutCommand(String name) {
        this.name = name;
    }
    @Override
    public Book execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BOOK NAME:---");
        String name = sc.nextLine().trim();
        System.out.println("ENTER BOOK AUTHOR NAME:---");
        String author = sc.nextLine().trim();
        System.out.println("ENTER BOOK PUBLICATION YEAR:---");
        int year = sc.nextInt();
        return new Book(name,author,year);
    }

    @Override
    public String toString() {
        return "Checkout Book";
    }
}