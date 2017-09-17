package service;


import core.Book;
import java.util.List;

public interface LibraryService {

    List<Book> getBookList();
    List<Book> checkOutBook(String bookName);
    List<Book> returnBook(String bookName);
}
