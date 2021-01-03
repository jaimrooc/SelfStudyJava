package com.jaimrooc.junit.tdd.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

    /**
     * Requirements:
     *
     * 1) Number divisible by 3 return "Fizz"
     * 2) Number divisible by 5 return "Buzz"
     * 3) Number divisible by 3 and 5 return "FizzBuzz"
     * 4) Else return the same number
     */

    @Test // Requirement 1
    public void return_Fizz_when_number_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzzOrNumber(3), is("Fizz"));
    }

    @Test  // Requirement 2
    public void return_Buzz_when_number_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzzOrNumber(5), is("Buzz"));
    }

    @Test // Requirement 3
    public void return_FizzBuzz_when_number_divisible_by_3_and_5() {
        assertThat(FizzBuzz.fizzBuzzOrNumber(15), is("FizzBuzz"));
    }

    @Test  // Requirement 4
    public void return_the_same_number_when_number_not_divisible_by_3_or_5() {
        assertThat(FizzBuzz.fizzBuzzOrNumber(2), is("2"));
    }
}
