package comand_shell;

import core.Book;
import core.Movie;
import core.User;
import service.BookImpService;
import service.MovieImpService;
import service.UserImpService;
import service.UserService;

import java.util.List;
import java.util.Scanner;

import static util.Constant.*;

public class App {
    private BookImpService bookImpService = new BookImpService();
    private MovieImpService movieImpService = new MovieImpService();
    private UserService userImpService = new UserImpService();

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
        } else if (i == 5) {
            System.out.println(ALERT_CHECKOUT_MOVIE);
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().checkOutMovie(sc.nextLine()));
        } else if (i == 7) {
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().checkPersonalInformation());

        }else if(i == 8){
            System.out.println(ALTER_INPUT_USERNAME);
            Scanner sc = new Scanner(System.in);
            System.out.println(ALTER_INPUT_PASSWORD);
            Scanner sc1 = new Scanner(System.in);

            userLogin(sc.nextLine(),sc1.nextLine());

        } else {
            System.out.println(ALERT_SELECT_VALID_OPTION);
        }
        run();
    }

    private void userLogin(String userName, String password) {
        if(userImpService.checkLogin(userName,password) == null){
            System.out.println(LOGIN_FAILURE);
        }else{
            System.out.println(LOGIN_SUCCESS);
        }
    }

    private StringBuffer checkPersonalInformation() {
        StringBuffer userInformation = new StringBuffer();
        User user = userImpService.findUser("rangel");

        userInformation.append("name: ").append(user.getName()).append("\n")
                .append("address: ").append(user.getAddress()).append("\n")
                .append("email: ").append(user.getEmail()).append("\n")
                .append("phoneNumber: ").append(user.getPhoneNumber()).append("\n")
                .append("password: ").append(user.getPassword());
        return userInformation;
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
