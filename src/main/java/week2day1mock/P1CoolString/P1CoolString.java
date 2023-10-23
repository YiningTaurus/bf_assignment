package week2day1mock.P1CoolString;

import java.util.LinkedList;
import java.util.List;

public class P1CoolString {
    public static void main(String[] args) {
        String test1 =  "bcad";
        int k1 = 3;
        System.out.println(formMinCoolStrings(test1, k1));
        String  test2  = "zzzaazza";
        int k2 =  20;
        System.out.println(formMinCoolStrings(test2, k2));
    }

    public static List<String> formMinCoolStrings(String s, int k){
        int n = s.length();
        List<String> ans = new LinkedList<>();
        int left = 0;
        int right = 0;
        while(left < n && right < n){
            String currString = s.substring(left, right+1);
            if(isCool(currString, k)){
                right++;
            }else{
                ans.add(s.substring(left, right));
                left = right;
            }
        }
        ans.add(s.substring(left, right));
        return ans;
    }

    public static boolean isCool(String string, int k){
        int n = string.length();
        int min = string.charAt(0) - 'a';
        int max = string.charAt(0) - 'a';
        for(int i  =  1;  i <  n; i++){
            int curr = string.charAt(i) - 'a';
            min = Math.min(curr, min);
            max = Math.max(curr, max);
        }
        return Math.abs(max - min) <= k;
    }
}
