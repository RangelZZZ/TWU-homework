package test;

import main.PrimeFactors;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void should_generate_an_empty_array_when_the_number_is_1() throws Exception{
        List<Integer> expectFactorsList = new ArrayList<Integer>();
        assertThat(primeFactors.generateFactors(1),is(expectFactorsList));
    }
    @Test
    public void should_generate_the_list_of_the_numbers_factors_when_given_the_number() throws Exception{
        List<Integer> expectFactorsList = new ArrayList<Integer>();
        expectFactorsList.add(3);
        expectFactorsList.add(5);
        assertThat(primeFactors.generateFactors(15),is(expectFactorsList));
    }
}