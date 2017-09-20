package service;


import core.Book;
import core.BookList;
import core.Movie;
import core.MovieList;

import java.util.List;

public class BookImpService implements BookService {
    private BookList bookList = new BookList();

    @Override
    public List<Book> getBookList() {
        return bookList.getBookList();
    }

    @Override
    public List<Book> checkOutBook(String bookName) {
        return bookList.checkOutBook(bookName);
    }

    @Override
    public List<Book> returnBook(String bookName) {
        return bookList.returnBook(bookName);
    }
}
