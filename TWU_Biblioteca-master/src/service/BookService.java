package service;


import core.Book;
import core.Movie;

import java.util.List;

public interface BookService {

    List<Book> getBookList();
    List<Book> checkOutBook(String bookName);
    List<Book> returnBook(String bookName);
}
