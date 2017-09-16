package core;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class BookListTest {

    private BookList bookList = new BookList();

    @Before
    public void setUp() throws Exception {
        bookList.initialBookList();
    }

    @Test
    public void should_initial_bookList_when_given_the_fake_date() throws Exception {

        assertThat(bookList.getBookList().get(0).getPublishTime(), is("2001"));
        assertThat(bookList.getBookList().size(), is(3));
    }

    @Test
    public void should_checkout_book_when_the_book_is_exist() throws Exception {
        bookList.checkOutBook("book1");
        Book book = bookList.getBookList().stream().filter(s -> (!s.getAvailable() && s.getBookName().equals("book1"))).findFirst().orElse(null);
        assertThat(book.getAuthor(),is("author1"));
    }

    @Test
    public void should_not_checkout_book_when_the_book_is_not_exist() throws Exception {
        bookList.checkOutBook("book4");
        Book book = bookList.getBookList().stream().filter(s -> (!s.getAvailable() && s.getBookName().equals("book4"))).findFirst().orElse(null);
        assertNull(book);
    }
}
