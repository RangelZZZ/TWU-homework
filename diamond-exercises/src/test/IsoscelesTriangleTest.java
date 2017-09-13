package test;

import main.IsoscelesTriangle;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IsoscelesTriangleTest {

    private IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();

    @Test
    public void should_print_Isosceles_triangle() throws Exception {

        String expectIsoscelesTriangle = "  *  \n"
                + " *** \n"
                + "*****\n";

        System.out.println(isoscelesTriangle.printIsoscelesTriangle(3));

        assertThat(isoscelesTriangle.printIsoscelesTriangle(3),is(expectIsoscelesTriangle));
    }
}
