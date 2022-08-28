// https://leetcode.com/problems/two-sum/
package leetcode.array.easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}