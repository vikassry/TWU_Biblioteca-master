package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**u
 * Created by vikass on 3/21/2015.
 */
public class Library {
    List<Book> bookList;
    public Library() {
        bookList = new ArrayList<Book>();
    }

    public void add(Book book){
        bookList.add(book);
    }

    public void addMultipleBooks(){
        bookList.add(new Book("The Adventures","Canon",1995));
        bookList.add(new Book("Wings Of Fire","APJ Kalam",1996));
        bookList.add(new Book("Ramayan","valmiki",1997));
    }

    public List<Book>  getBooksList(){
        return new ArrayList<Book>(bookList);
    }
}
