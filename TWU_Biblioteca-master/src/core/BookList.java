package core;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> getBookList() {

        return this.bookList;
    }

    public List<Book> initialBookList() {
        this.bookList.add(new Book("book1", "2001", "author1"));
        this.bookList.add(new Book("book2", "2002", "author2"));
        this.bookList.add(new Book("book3", "2003", "author3"));

        return this.bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "bookList=" + bookList +
                '}';
    }
}

