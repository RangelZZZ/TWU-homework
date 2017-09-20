package comand_shell;

import core.Book;
import core.Movie;
import service.BookImpService;
import service.MovieImpService;

import java.util.List;
import java.util.Scanner;

import static util.Constant.*;

public class App {
    private BookImpService bookImpService = new BookImpService();
    private MovieImpService movieImpService = new MovieImpService();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println(welcome());
        System.out.println(Menu.getMenu());

        Scanner sc = new Scanner(System.in);
        new App().handleUserInput(sc.nextInt());
    }

    public void handleUserInput(int i) {
        if (i == 1) {
            System.out.println(new App().printBookList());
        } else if (i == 2) {
            System.out.println(ALERT_CHECKOUT_BOOK);
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().checkOutBook(sc.nextLine()));
        } else if (i == 3) {
            System.out.println(ALERT_RETURN_BOOK);
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().ReturnBook(sc.nextLine()));
        } else if (i == 4) {
            System.out.println(new App().printMovieList());
        } else if (i == 6) {
            System.exit(0);
        } else if(i == 5){
            System.out.println(ALERT_CHECKOUT_MOVIE);
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().checkOutMovie(sc.nextLine()));
        }else{
            System.out.println(ALERT_SELECT_VALID_OPTION);
        }
        run();
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


    private String ReturnBook(String bookName) {
        List<Book> bookList = bookImpService.returnBook(bookName);
        if (bookList == null) {
            return ALERT_RETURN_BOOK_FAILURE;
        } else {
            return ALERT_RETURN_BOOK_SUCCESS;
        }
    }

    private String checkOutBook(String bookName) {
        List<Book> bookList = bookImpService.checkOutBook(bookName);
        if (bookList == null) {
            return ALERT_CHECKOUT_BOOK_FAILURE;
        } else {
            return ALERT_CHECKOUT_BOOK_SUCCESS;
        }
    }

    public String printBookList() {
        StringBuffer allBooks = new StringBuffer();
        List<Book> bookList = bookImpService.getBookList();
        bookList.stream().forEach(s -> allBooks.append(s.getBookName()).append(" ")
                .append(s.getPublishTime()).append(" ")
                .append(s.getAuthor()).append("\n"));

        return allBooks.toString().trim();
    }

    private String checkOutMovie(String movieName) {
        List<Movie> movieList = movieImpService.checkoutMovie(movieName);
        if (movieList == null) {
            return ALERT_checkout_MOVIE_FAILURE;
        } else {
            return ALERT_checkout_MOVIE_SUCESS;
        }
    }

    public static String welcome() {
        return WELCOME;
    }
}
