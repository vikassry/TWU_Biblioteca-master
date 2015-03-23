package com.twu.biblioteca;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testWelcomeReturnsWelcomeMessage() {

        BibliotecaApp app = new BibliotecaApp(new BookStore());
        assertEquals(app.getWelcome(), "Welcome to Biblioteca");
    }

    @Test
    public void getBookListReturnsListOfBooks (){
        BookStore bookStore = new BookStore();
        Book adventures = new Book("The Adventures","Canon",1995);
        List<Book> actualBookList = bookStore.getBooksList();
        for(Book book : actualBookList){
            assertEquals(book.toString(), "The Adventures\tCanon\t1995");
        }
    }
}
