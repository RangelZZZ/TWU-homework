package comand_shell;

import core.Book;
import service.BookImpService;

import java.util.List;
import java.util.Scanner;

import static util.Constant.*;
import static util.Constant.ALERT_CHECKOUT_BOOK_FAILURE;
import static util.Constant.ALERT_CHECKOUT_BOOK_SUCCESS;

public class BookManage {

    private BookImpService bookImpService = new BookImpService();

    public static void manageBook() {
        System.out.println(Menu.getBookMenu());
        String userInput = new Scanner(System.in).nextLine();
        handleUserInput(userInput);
    }

    private static void handleUserInput(String userInput) {
        if (userInput.equals("1")) {
            System.out.println(new BookManage().printBookList());
        } else if (userInput.equals("2")) {
            System.out.println(ALERT_CHECKOUT_BOOK);
            Scanner sc = new Scanner(System.in);
            System.out.println(new BookManage().checkOutBook(sc.nextLine()));
        } else if (userInput.equals("3")) {
            System.out.println(ALERT_RETURN_BOOK);
            Scanner sc = new Scanner(System.in);
            System.out.println(new BookManage().ReturnBook(sc.nextLine()));
        }else if(userInput.equals("4")){
            new App().handleUserInput();
        }else{
            System.out.println(ALERT_SELECT_VALID_OPTION);
        }
        manageBook();
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
}
