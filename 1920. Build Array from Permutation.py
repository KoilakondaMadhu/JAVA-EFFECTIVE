class Solution {
    public int[] buildArray(int[] nums) {
        // Create a new array with the same length as nums
        int[] result = new int[nums.length];

        // Populate the result array
        for (int i = 0; i < nums.length; i++) {
            // Set each element in result to nums[nums[i]]
            result[i] = nums[nums[i]];
        }

        // Return the resulting array
        return result;
    }
}



# Example 1:

# Input: nums = [0,2,1,5,3,4]
# Output: [0,1,2,4,5,3]
# Explanation: The array ans is built as follows: 
# ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
#     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
#     = [0,1,2,4,5,3]
# Example 2:

# Input: nums = [5,0,1,2,3,4]
# Output: [4,5,0,1,2,3]
# Explanation: The array ans is built as follows:
# ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
#     = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
#     = [4,5,0,1,2,3]
 

# Constraints:

# 1 <= nums.length <= 1000
