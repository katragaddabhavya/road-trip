package com.jap.fibonacci;

public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    public long fibonacci(long number) {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        if (number < 0)
            return -1;
        else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    // Print the series inside the method
    public void printFibonacciSeries(long number){
        System.out.println(fibonacci(number));

    }
    public static void main( String[] args )
    {
        FibonacciSeries fib = new FibonacciSeries();
        fib.printFibonacciSeries(9);
        // Call the  printFibonacciSeries() method and pass the value.


    }
}
