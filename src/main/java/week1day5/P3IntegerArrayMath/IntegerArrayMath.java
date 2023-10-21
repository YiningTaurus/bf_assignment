package week1day5.P3IntegerArrayMath;


import week1day5.P2OwnException.NonIntResultException;

/*
* Create the IntegerArrayMath class with integer division method:
*
* a. Loops through instance field array and attempts to divide each value of number array by the corresponding value
* of denom instance field array. such as number[0]/denom[0] and number[1]/denom[1],etc
*
* b. If the result of the division is an integer, then print out a message indicating the result of the division such as 8/4 is 2.
*
* c. If the result of the division is not an integer, then throw and handle a NonIntResultException
* and continue processing the result of the number array elements.
*
* d. The method should, using exception handling also handle any attempt to divide by zero (arithmetic exception)
* the program should display an appropriate message and then continue processing the rest of the number array elements
*
* e. Assume both arrays are the same length.
* */
public class IntegerArrayMath {
    private int[] numbers;
    private int[] denoms;

    public IntegerArrayMath(int[] numbers, int[] denoms) {
        this.numbers = numbers;
        this.denoms = denoms;
    }

    public void performDivision(){
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            if(denoms[0] == 0){
                throw new ArithmeticException("Dividing by zero");
            }
            try {
                int ans = numbers[i] / denoms[i];
                if(numbers[i] % denoms[i] != 0){
                    throw new NonIntResultException(numbers[i], denoms[i]);
                }
                System.out.println("The result of " + numbers[i] + " divided by " + denoms[i] + " is " + ans);
            }catch (NonIntResultException e){
                e.printStackTrace();
            }
        }
    }
}
