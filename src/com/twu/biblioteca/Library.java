package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**u
 * Created by vikass on 3/21/2015.
 */
public class Library implements Iterable<Book>{
    List<Book> bookList;
    public Library() {
        bookList = new ArrayList<Book>();
    }

    public void add(Book book){
        bookList.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return bookList.iterator();
    }
}
