package comand_shell;

import static util.Constant.WELCOME;

public class App {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println(welcome());
        System.out.println(Menu.getMenu());
    }

    public static String welcome() {
        return WELCOME;
    }
}
