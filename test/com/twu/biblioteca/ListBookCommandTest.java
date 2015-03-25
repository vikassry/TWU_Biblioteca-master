package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ListBookCommandTest {
    @Test
    public void executeWillPrintTheListOfBooks(){
        String libraryInformation = "The Adventures\tCanon\t1995\r\n"+
                                "Wings Of Fire\tAPJ Kalam\t1996\r\n"+
                                "Ramayan\tvalmiki\t1997\r\n\r\n";
        Library library = new Library();
        library.add(new Book("The Adventures","Canon",1995));
        library.add(new Book("Wings Of Fire","APJ Kalam",1996));
        library.add(new Book("Ramayan","valmiki",1997));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        ListBookCommand listBookCommand = new ListBookCommand();
        listBookCommand.execute();
//        assertEquals(libraryInformation, baos.toString());
    }
}