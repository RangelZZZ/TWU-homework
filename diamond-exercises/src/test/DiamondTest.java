package test;

import main.Diamond;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DiamondTest {

    private Diamond diamond = new Diamond();
    @Test
    public void  should_print_the_diamond_when_given_the_number() throws Exception{
        String expectDiamond = "  *  \n" +
                " *** \n" +
                "*****\n" +
                " *** \n" +
                "  *  ";

        assertThat(diamond.printDiamond(3), is(expectDiamond));
    }


}