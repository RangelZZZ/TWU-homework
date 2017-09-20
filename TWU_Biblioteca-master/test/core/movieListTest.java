package core;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class movieListTest {

    private MovieList movieList = new MovieList();

    @Test
    public void should_initial_bookList_when_given_the_fake_date() throws Exception {

        assertThat(movieList.getMovieList().get(0).getYear(), is("2001"));
        assertThat(movieList.getMovieList().size(), is(3));
    }
}
