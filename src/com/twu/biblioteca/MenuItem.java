package com.twu.biblioteca;

public class MenuItem {
    private String name;
    private Command command;

    public MenuItem(String name, Command command) {
        this.name = name;
        this.command = command;
    }
    public void performAction() throws BibliotecaQuitException {
        command.execute();
    }

    @Override
    public String toString() {
        return ""+name;
    }
}
