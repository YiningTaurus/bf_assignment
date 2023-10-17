package week1day2;


/*
* Develop a mathematical Calculator
* a. (2 Variables -- X=5,Y=7) -->> Add, Sub, Mul, Div
* b. (3 Variables -- X=5,Y=6,Z=7) -->> Add, Sub, Mul, Div
* The input contains two array, an array of variables and an array of operators:
* input1 = [5,6,14,7], input2 = [“Add”, “Sub”, “Div”]
*
* The precedence of operator needs to be taken care of, for example, the above example should
* be 5 + 6 - (14 / 7) = 9 instead of (5 + 6 - 14) / 7 = 0 (if the end result is not integer, output the
* floor of the decimal result)
*
* Assumption:1. No parentheses; 2. Input will always be valid; 3. input2.length = input1.length - 1.
* */
public class P1Calculator {
    public static void main(String[] args) {
        int[] nums1 = new int[]{5, 6, 14, 7};
        String[] operators1 = new String[]{"Add", "Sub", "Div"};
        System.out.println(myCalculator(nums1, operators1));
    }


    public static int myCalculator(int[] nums, String[] operators){
        return 0;
    }
}
