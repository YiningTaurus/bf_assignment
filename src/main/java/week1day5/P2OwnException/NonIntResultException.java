package week1day5.P2OwnException;

/*
* Create a user-defined exception class called NonIntResultException which is generated when the result of dividing
* two integer values produces a result with a fractional component [i.e the result is not an integer]
*
* a. NonIntResultException contains:
* i. A constructor with the parameter that represents the two integer values
* ii. Generates an appropriate message, for example, if the two integers are 7 and 2,
* the resulting exception message would be: 7 divided by 2 is not an integer
*
* */
public class NonIntResultException extends RuntimeException{

    public NonIntResultException(int dividend, int divisor) {
        super(dividend + " divided by " + divisor + " is not an integer");
    }
}
