// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Get the middle element (majority element)
        int n = nums.length / 2;

        // Return the majority element
        return nums[n];
    }
}


// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
