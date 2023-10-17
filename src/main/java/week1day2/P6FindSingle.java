package week1day2;
/*
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
* Could you implement a solution with a linear runtime complexity and without using extra memory?
* (Hint: xor)
*
* Input: nums = [2,2,1]
* Output: 1
*
* Input: nums = [4,1,2,1,2]
* Output: 4
* */
public class P6FindSingle {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,2,1};
        System.out.println(findSingle(nums1));
        int[] nums2 = new int[]{4,1,2,1,2};
        System.out.println(findSingle(nums2));
    }

    public static int findSingle(int[] nums){
        int ans = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
