package comand_shell;

import core.Movie;
import service.MovieImpService;

import java.util.List;
import java.util.Scanner;

import static util.Constant.*;

public class MovieManage {

    private MovieImpService movieImpService = new MovieImpService();

    public static void manageMovie() {
        System.out.println(Menu.getMovieMenu());
        String userInput = new Scanner(System.in).nextLine();
        handleUserInput(userInput);
    }

    private static void handleUserInput(String userInput) {
        if (userInput.equals("1")) {
            System.out.println(new MovieManage().printMovieList());
        } else if (userInput.equals("2")) {
            System.out.println(ALERT_CHECKOUT_MOVIE);
            Scanner sc = new Scanner(System.in);
            System.out.println(new MovieManage().checkOutMovie(sc.nextLine()));
        } else if (userInput.equals("3")) {
            new App().handleUserInput();
        } else {
            System.out.println(ALERT_SELECT_VALID_OPTION);
        }
        manageMovie();
    }

    private String printMovieList() {
        StringBuffer allMovies = new StringBuffer();
        List<Movie> movieList = movieImpService.getMovieList();
        movieList.stream().forEach(s -> allMovies.append(s.getName()).append(" ")
                .append(s.getYear()).append(" ")
                .append(s.getDirector()).append(" ")
                .append(s.getRating()).append("time")
                .append("\n"));

        return allMovies.toString().trim();
    }


    private String checkOutMovie(String movieName) {
        List<Movie> movieList = movieImpService.checkoutMovie(movieName);
        if (movieList == null) {
            return ALERT_checkout_MOVIE_FAILURE;
        } else {
            return ALERT_checkout_MOVIE_SUCESS;
        }
    }
}
