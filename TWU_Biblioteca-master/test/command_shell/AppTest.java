package command_shell;


import comand_shell.App;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Test
    public void should_return_welcome_information_when_exeute_welcome_function() throws Exception {
        assertThat(App.welcome(),is("Hello, welcome to Biblioteca system!"));
    }
}
