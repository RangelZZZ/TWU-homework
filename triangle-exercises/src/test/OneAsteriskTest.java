package test;

import main.OneAsterisk;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OneAsteriskTest {
     private OneAsterisk oneAsterisk =  new OneAsterisk();

    @Test
    public void should_return_asterisk() throws Exception {
        assertThat(oneAsterisk.printAsterisk(),is('*'));
    }

}