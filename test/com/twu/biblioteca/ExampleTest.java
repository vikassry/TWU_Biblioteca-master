package com.twu.biblioteca;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testWelcomeReturnsWelcomeMessage() {

        Biblioteca app = new Biblioteca();
        assertEquals(app.getWelcome(), "Welcome to Biblioteca"+System.lineSeparator());
    }

    @Test
    public void getBookListReturnsListOfBooks (){
        Library library = new Library();
        List<Book> actualBookList = library.getBooksList();
        for(Book book : actualBookList){
            assertEquals(book.toString(), "The Adventures\tCanon\t1995");
        }
    }
}
