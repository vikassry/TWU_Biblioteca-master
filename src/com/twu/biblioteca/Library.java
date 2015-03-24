package com.twu.biblioteca;

import java.util.ArrayList;
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
            BookEntry entry = new BookEntry(customerName,book);
            entries.addEntry(entry);
            return "Thank You! Enjoy the book\n";
        }
        throw new BookNotAvailableException("That book is not available.\n");
    }

    public String returnBook(Book book,String customerName) throws BookNotValidException {
        BookEntry bookEntry = new BookEntry(customerName,book);
        Boolean available = entries.isEntryValid(bookEntry);
        System.out.println(available);
        if(available){
            entries.remove(bookEntry);
            bookList.add(book);
            return  "Thank you for returning the book";
        }
        throw new BookNotValidException("That is not a valid book to return.\n");
    }

    public Boolean isAvailable(Book book) {
        return  bookList.contains(book);
    }


}
