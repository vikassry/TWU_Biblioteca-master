package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**u
 * Created by vikass on 3/21/2015.
 */
public class Library implements Iterable<Book>{
    private List<Book> bookList;
    private BookEntries entries;
    public Library() {
        bookList = new ArrayList<Book>();
        entries = new BookEntries();
    }

    public void add(Book book){
        bookList.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return bookList.iterator();
    }

    public String checkOutBook(Book book,String customerName) throws BookNotAvailableException{
        if(isAvailable(book)){
            bookList.remove(book);
            BookEntry entry = new BookEntry(customerName,new Date(),book);
            entries.addEntry(entry);
            return "Thank You! Enjoy the book\n";
        }
        throw new BookNotAvailableException("That book is not available.\n");
    }

    public Boolean isAvailable(Book book) {
        return  bookList.contains(book);
    }


}
