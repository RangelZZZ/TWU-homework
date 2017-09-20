package service;

import core.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getMovieList();
    List<Movie> checkoutMovie(String movieName);
}
