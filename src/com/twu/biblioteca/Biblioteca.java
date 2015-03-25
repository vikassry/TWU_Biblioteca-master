package com.twu.biblioteca;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {
    Map<Integer,Command> commandMap;
    private Library library;
    private boolean keepRunning ;

    public Biblioteca() {
        library = new Library();
        commandMap = new HashMap<Integer, Command>();
        keepRunning = true;
    }

    public String welcome() {
        return "Welcome to Biblioteca"+System.lineSeparator();
    }

    public void run(){
        addBooksToLibrary();
        addCommandsToCommandMap();
        System.out.println(welcome());
        Scanner sc = new Scanner(System.in);

        while(keepRunning){
            System.out.println(showMenu());
            System.out.println("enter your option");
            int option = sc.nextInt();
            try {
                library.executeCommand(commandMap.get(option));
            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            } catch (BibliotecaQuitException e) {
                System.out.println(e.getMessage());
                keepRunning = false;
            } catch (BookNotValidException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("Wrong Input");
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void addCommandsToCommandMap() {
        commandMap.put(1,new ListBookCommand());
        commandMap.put(2,new CheckOutCommand("vikas"));
        commandMap.put(3,new ReturnBookCommand("vikas"));
        commandMap.put(4,new QuitCommand());
    }

    private void addBooksToLibrary() {
        library.add(new Book("The Adventures", "Canon", 1995));
        library.add(new Book("Wings Of Fire", "APJ Kalam", 1996));
        library.add(new Book("Ramayan", "valmiki", 1997));
    }

    public String showMenu(){
        String menuList ="Menu:\n";
        for (Integer item : commandMap.keySet())
            menuList += item + ". " + commandMap.get(item).toString()+ System.lineSeparator();
        return menuList;
    }
}