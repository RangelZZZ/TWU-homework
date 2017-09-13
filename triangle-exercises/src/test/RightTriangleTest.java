package test;

import org.junit.Test;
import main.RightTriangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RightTriangleTest {
    private RightTriangle rightTriangle = new RightTriangle();

    @Test
    public void should_print_right_triangle_when_given_number() throws Exception {
        String expectRightTriangle = "*\n**\n***";
        assertThat(rightTriangle.printRightTriangle(3),is(expectRightTriangle));
    }
}