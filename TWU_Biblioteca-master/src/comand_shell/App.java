package comand_shell;

import core.Book;
import service.LibraryImpService;

import java.util.List;
import java.util.Scanner;

import static util.Constant.*;

public class App {
    private LibraryImpService libraryImpService = new LibraryImpService();

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
            run();
        } else if (i == 2) {
            System.out.println(ALERT_CHECKOUT);
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().checkOutBook(sc.nextLine()));
            run();
        } else if (i == 3) {
            System.out.println(ALERT_RETURN);
            Scanner sc = new Scanner(System.in);
            System.out.println(new App().ReturnBook(sc.nextLine()));
            run();
        } else if (i == 4) {
            System.exit(0);
        }else{
            System.out.println(ALERT_SELECT_VALID_OPTION);
            run();
        }
    }


    private String ReturnBook(String bookName) {
        List<Book> bookList = libraryImpService.checkOutBookList(bookName);
        if (bookList == null) {
            return ALERT_RETURN_FAILURE;
        } else {
            return ALERT_RETURN_SUCCESS;
        }
    }

    private String checkOutBook(String bookName) {
        List<Book> bookList = libraryImpService.checkOutBookList(bookName);
        if (bookList == null) {
            return ALERT_CHECKOUT_FAILURE;
        } else {
            return ALERT_CHECKOUT_SUCCESS;
        }
    }

    public String printBookList() {
        StringBuffer allBooks = new StringBuffer();
        List<Book> bookList = libraryImpService.getBookList();
        bookList.stream().forEach(s -> allBooks.append(s.getBookName()).append(" ")
                .append(s.getPublishTime()).append(" ")
                .append(s.getAuthor()).append("\n"));

        return allBooks.toString().trim();
    }

    public static String welcome() {
        return WELCOME;
    }
}
