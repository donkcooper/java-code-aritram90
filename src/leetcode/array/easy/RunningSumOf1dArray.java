package leetcode.array.easy;

/*
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int []results = new int[nums.length];
        results[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            results[i] = results[i-1] + nums[i];
        }
        return results;
    }
}