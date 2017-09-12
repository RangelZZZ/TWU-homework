package test;

import main.HorizontalLine;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class HorizontalLineTest {
    private HorizontalLine horizontalLine =  new HorizontalLine();

    @Test
    public void should_return_horizonLine_when_given_the_number() throws Exception{
        assertThat(horizontalLine.printHorizontalLine(4),is("****"));
    }


}