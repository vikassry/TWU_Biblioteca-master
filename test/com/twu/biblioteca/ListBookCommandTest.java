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
        library.addMultipleBooks();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        ListBookCommand listBookCommand = new ListBookCommand(library,printStream);
        listBookCommand.execute();
        assertEquals(libraryInformation, baos.toString());
    }
}

