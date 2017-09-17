package service;


import core.Book;
import core.BookList;

import java.util.List;

public class LibraryImpService implements LibraryService {
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
