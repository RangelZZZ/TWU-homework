package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void should_print_fizz_when_given_number_can_divided_by_three() throws Exception{
        int number = 3;
        assertThat(fizzBuzz.printFizzBuzz(3),is("1\n" +
                "2\n" +
                "Fizz"));
    }

    @Test
    public void should_print_buzz_when_given_number_can_divided_by_five() throws Exception {
        int number = 5;
        assertThat(fizzBuzz.printFizzBuzz(5),is("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz"));
    }

    @Test
    public void should_print_buzz_when_given_number_can_divided_by_both_three_and_five() throws Exception {
        int number = 5;
        assertThat(fizzBuzz.printFizzBuzz(15),is("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz"));
    }

}