package week3day1mock.P3;

import java.util.Arrays;

public class P3Find {
    public static void main(String[] args) {
        int[][] test1 = new int[][]{{1,4}, {2,9}, {3,5}, {8,10}};
        int[] ans1 = findInterval(test1);
        for(int a : ans1){
            System.out.println(a);
        }
        int[][] test2 = new int[][]{{2, 3}, {5, 9}, {1, 2}, {10, 14}};
        int[] ans2 = findInterval(test2);
        for(int a : ans2){
            System.out.println(a);
        }
    }

    public static int[] findInterval(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for(int i = 0; i < n; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int currMeetingNum = 0;
        int maxMeetingNum = 0;
        int startAns = 0;
        int endAns = 0;
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < n){
            if(starts[p1] < ends[p2]){
                currMeetingNum++;
                if(currMeetingNum > maxMeetingNum){
                    maxMeetingNum = currMeetingNum;
                    startAns = starts[p1];
                    endAns = ends[p2];
                }
                p1++;
            }else{
                currMeetingNum--;
                p2++;
            }
        }
        if(maxMeetingNum == 1){
            int maxLength = 0;
            for(int[] interval : intervals){
                if(interval[1] - interval[0] > maxLength){
                    maxLength = interval[1] - interval[0];
                    startAns = interval[0];
                    endAns = interval[1];
                }
            }
        }
        return new int[]{startAns, endAns};
    }
}
