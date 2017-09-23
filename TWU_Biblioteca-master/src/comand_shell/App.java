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

    private UserService userImpService = new UserImpService();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println(welcome());
        new App().handleUserLogin();
    }

    public void handleUserInput() {
        System.out.println(Menu.getMainMenu());
        String userInput = new Scanner(System.in).nextLine();
        if (userInput.equals("1")) {
            BookManage.manageBook();
        } else if (userInput.equals("2")) {
            MovieManage.manageMovie();
        } else if (userInput.equals("3")) {
            PersonalInforManage.managePersonalInfor();
        } else if (userInput.equals("4")) {
            System.exit(0);
        } else {
            System.out.println(ALERT_SELECT_VALID_OPTION);
        }
    }

    private void handleUserLogin() {
        System.out.println(ALTER_INPUT_USERNAME);
        String userName = new Scanner(System.in).nextLine();
        System.out.println(ALTER_INPUT_PASSWORD);
        String password = new Scanner(System.in).nextLine();

        if (userImpService.checkLogin(userName, password) == null) {
            System.out.println(LOGIN_FAILURE);
            handleUserLogin();
        } else {
            System.out.println(LOGIN_SUCCESS);
            handleUserInput();
        }

    }

    public static String welcome() {
        return WELCOME;
    }
}
