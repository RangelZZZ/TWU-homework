package service;

import core.Movie;
import core.MovieList;

import java.util.List;

public class MovieImpService implements MovieService {

    private MovieList movieList = new MovieList();

    @Override
    public List<Movie> getMovieList() {
        return movieList.getMovieList();
    }

    @Override
    public List<Movie> checkoutMovie(String movieName) {
        return movieList.checkOutMovie(movieName);
    }
}
