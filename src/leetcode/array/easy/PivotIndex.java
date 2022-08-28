package leetcode.array.easy;

/*
724. Find Pivot Index

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
*/

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int s: nums) {
            sum += s;
        }
        int leftSum=0;
        for(int i=0; i<nums.length;i++) {
            int rightSum=sum-nums[i]-leftSum;
            if(leftSum == rightSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}