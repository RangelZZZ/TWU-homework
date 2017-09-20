package core;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class movieListTest {

    private MovieList movieList = new MovieList();

    @Test
    public void should_initial_bookList_when_given_the_fake_date() throws Exception {

        assertThat(movieList.getMovieList().get(0).getYear(), is("2001"));
        assertThat(movieList.getMovieList().size(), is(3));
    }

    @Test
    public void should_checkout_movie_when_the_movie_is_exist() throws Exception {
        movieList.checkOutMovie("movie1");
        Movie movie = movieList.getMovieList().stream().filter(s -> (!s.getAvailable() && s.getName().equals("movie1"))).findFirst().orElse(null);
        assertThat(movie.getDirector(),is("director1"));
    }

    @Test
    public void should_not_checkout_book_when_the_book_is_not_exist() throws Exception {
        movieList.checkOutMovie("book4");
        Movie movie = movieList.getMovieList().stream().filter(s -> (!s.getAvailable() && s.getName().equals("book4"))).findFirst().orElse(null);
        assertNull(movie);
    }
}
