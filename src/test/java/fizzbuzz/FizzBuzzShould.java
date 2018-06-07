package fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzShould {
    private FizzBuzz fizzbuzz;

    @Before public void
    set_up() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    @Parameters({
        "1, 1",
        "2, 2",
        "77, 77"
    }) public void
    print_number_when_is_not_divisble_neither_by_three_or_five(int number, String encrypted) {
        assertThat(fizzbuzz.printNumber(number), is(encrypted));
    }

    @Test
    @Parameters({
            "3, Fizz",
            "9, Fizz",
            "18, Fizz",
            "333, Fizz"
    }) public void
    print_Fizz_when_number_is_divisible_by_three(int number, String encrypted) {
        assertThat(fizzbuzz.printNumber(number), is(encrypted));
    }

    @Test
    @Parameters({
        "5, Buzz",
        "10, Buzz",
        "50, Buzz"
    }) public void
    print_Buzz_when_number_is_divisible_by_five(int number, String encrypted) {
        assertThat(fizzbuzz.printNumber(number), is(encrypted));
    }

    @Test
    @Parameters({
        "15, FizzBuzz"
    }) public void
    print_FiZZBuZZ_when_number_is_divisible_by_three_and_five(int number, String encrypted) {
        assertThat(fizzbuzz.printNumber(number), is(encrypted));
    }
}
