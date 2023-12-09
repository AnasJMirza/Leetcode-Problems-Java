import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/


public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
