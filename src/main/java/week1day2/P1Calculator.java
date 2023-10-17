package week1day2;


import java.util.Deque;
import java.util.LinkedList;

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
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{5, 6, 14, 7};
        String[] operators1 = new String[]{"Add", "Sub", "Div"};
        System.out.println(myCalculator(nums1, operators1));
    }


    public static int myCalculator(int[] nums, String[] operators) throws Exception {
        Deque<Double> stack = new LinkedList<>();
        stack.push((double)nums[0]);
        int n = operators.length;
        for(int i = 0; i < n; i++){
            String operator = operators[i];
            double nextNum = nums[i + 1];
            if(operator.equals("Add")){
                stack.push(nextNum);
            }else if(operator.equals("Sub")){
                stack.push(-nextNum);
            }else if(operator.equals("Mul")){
                double preNum = stack.pop();
                stack.push(preNum * nextNum);
            }else if(operator.equals("Div")){
                double preNum = stack.pop();
                stack.push(preNum / nextNum);
            }else{
                throw new Exception("Invalid operator.");
            }
        }
        double ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return (int)Math.floor(ans);
    }
}
