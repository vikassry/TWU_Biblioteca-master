package com.twu.biblioteca;

public interface Command {
    public void execute() throws BibliotecaQuitException;
}
