package core;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return this.movieList;
    }

    public MovieList() {
        this.movieList.add(new Movie("movie1", "2001", "director1",  Rating.FOUR, true));
        this.movieList.add(new Movie("movie2", "2002", "director2", Rating.EIGHT,true));
        this.movieList.add(new Movie("movie3", "2003", "director3", Rating.ONE,true));

    }

    public List<Movie> checkOutMovie(String movieName) {
        Movie movie = this.movieList.stream().filter(s -> s.getName().equals(movieName) && s.getAvailable()).findFirst().orElse(null);
        if(movie == null){
            return null;
        }
        movie.setAvailable(false);
        return this.movieList;
    }

}
