package week3day1mock.P1;
import java.util.Stack;

public class P1hillClimbing {
    public static void main(String[] args) {
        int[] test1 = new int[]{78, 90, 65, 51, 87, 99, 100, 31, 150};//1 4 2 1 1 1 2 1 0
        int[] ans = hillClimbing1(test1);
        for(int a : ans){
            System.out.println(a);
        }
    }

    public static int[] hillClimbing1(int[] heights){
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            while(!stack.isEmpty() && heights[i] > heights[stack.peek()]){
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }

    public static int[] hillClimbing2(int[] heights){
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] <= heights[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
