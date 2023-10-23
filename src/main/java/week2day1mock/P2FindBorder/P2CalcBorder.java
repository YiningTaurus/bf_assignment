package week2day1mock.P2FindBorder;

public class P2CalcBorder {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{9,  7,  4,  5}, {1,  6,  2, -6}, {12, 20, 2,  0}, {-5, -6, 7, -2}};
        int[]  ans = sumOfBorders(nums);
        for(int num : ans){
            System.out.println(num);
        }
    }

    public static int[] sumOfBorders(int[][] matrix){
        int n =  matrix.length;
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int borderNum = n / 2;
        int[]  ans = new  int[borderNum];
        for(int index  = 0; index < borderNum; index++){
            int currAns = 0;
            for(int i = left; i <= right; i++){
                currAns += matrix[up][i];
            }
            for(int i = up; i <= down; i++){
                currAns += matrix[i][right];
            }
            for(int i = left;  i <= right; i++){
                currAns += matrix[down][i];
            }
            for(int i = up; i <= down; i++){
                currAns += matrix[i][left];
            }
            currAns = currAns - matrix[up][left] - matrix[up][right] - matrix[down][left] - matrix[down][right];
            ans[index] = currAns;
            up++;
            down--;
            left++;
            right--;
        }
        return ans;
    }
}
