package fizzbuzz;

public class FizzBuzz {
    public String printNumber(int number) {
        return isDivisibleBy(number, 3) && isDivisibleBy(number, 5) ? "FizzBuzz" :
                isDivisibleBy(number, 3) ? "Fizz" :
                    isDivisibleBy(number, 5) ?  "Buzz" :
                        Integer.toString(number);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return (number % divisor) == 0;
    }
}
