package com.twu.biblioteca;

public class QuitCommand implements Command {

    public void execute() throws BibliotecaQuitException {
        throw new BibliotecaQuitException("Thank You! Visit again");
    }
}
