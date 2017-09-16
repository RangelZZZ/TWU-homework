package command_shell;

import comand_shell.Menu;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MenuTest {
    @Test
    public void should_return_main_menu_when_exeute_menu_function() throws Exception {
        assertThat(Menu.getMenu(),is("1. List Books\n"
                + "2. Checkout Book\n"
                + "3. Return Book\n"
                + "4. Quit"));
    }
}
