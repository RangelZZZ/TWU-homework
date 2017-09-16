package core;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookListTest {

    private BookList bookList = new BookList();

    @Test
    public void should_initial_bookList_when_given_the_fake_date()throws Exception {

        List<Book> expectedBookList = bookList.initialBookList();

        assertThat(expectedBookList.get(0).getPublishTime(),is("2001"));
        assertThat(expectedBookList.size(),is(3));
    }
}
