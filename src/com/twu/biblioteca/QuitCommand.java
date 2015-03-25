package com.twu.biblioteca;

public class QuitCommand implements Command {

    public Book execute() {
        return new Book("dvdv","vxdf",21312);
//        throw new BibliotecaQuitException("Thank You! Visit again");
    }

    @Override
    public String toString() {
        return "Quit";
    }
}