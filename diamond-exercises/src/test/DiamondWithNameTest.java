package test;

import main.Diamond;
import main.DiamondWithName;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DiamondWithNameTest {
    private DiamondWithName diamondWithName = new DiamondWithName();

    @Test
    public void  should_print_the_diamond_when_given_the_number() throws Exception{
        String expectDiamond =
                "  *  \n" +
                " *** \n" +
                "Bill\n" +
                " *** \n" +
                "  *  ";

        assertThat(diamondWithName.printDiamondWithName(3), is(expectDiamond));
    }




}