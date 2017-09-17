package core;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> getBookList() {

        return this.bookList;
    }

    public BookList() {
        this.bookList.add(new Book("book1", "2001", "author1", true));
        this.bookList.add(new Book("book2", "2002", "author2", false));
        this.bookList.add(new Book("book3", "2003", "author3", true));

    }

    public List<Book> checkOutBook(String bookName) {
        Book book = this.bookList.stream().filter(s -> s.getBookName().equals(bookName) && s.getAvailable()).findFirst().orElse(null);
        if(book == null){
            return null;
        }
        book.setAvailable(false);
        return this.bookList;
    }

    public List<Book> returnBook(String bookName){
        Book book = this.bookList.stream().filter(s -> s.getBookName().equals(bookName) && !s.getAvailable()).findFirst().orElse(null);
        if(book == null){
            return null;
        }
        book.setAvailable(true);
        return this.bookList;
    }

}

