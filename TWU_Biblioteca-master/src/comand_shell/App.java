package comand_shell;

import core.Book;
import service.LibraryImpService;

import java.util.List;
import java.util.Scanner;

import static util.Constant.WELCOME;

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
