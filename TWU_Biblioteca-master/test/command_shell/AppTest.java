package command_shell;


import comand_shell.App;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    private App app = new App();

    @Test
    public void should_return_welcome_information_when_exeute_welcome_function() throws Exception {
        assertThat(App.welcome(), is("Hello, welcome to Biblioteca system!"));
    }

    @Test
    public void should_get_bookList_by_string_when_user_input_1() throws Exception {
        String expectedBookList = "book1 2001 author1\n"
                + "book2 2002 author2\n"
                + "book3 2003 author3";
        app.handleUserInput(1);

        assertEquals(expectedBookList, outContent.toString().trim());
    }
}
