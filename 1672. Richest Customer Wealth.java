// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 public class Solution {
    public int maximumWealth(int[][] accounts) {
        // Initialize a variable to store the maximum wealth
        int maxs = 0;
        
        // Iterate over each customer's accounts
        for (int i = 0; i < accounts.length; i++) {
            // Initialize a variable to store the wealth of the current customer
            int sum = 0;
            
            // Iterate over each account in the current customer's accounts
            for (int j = 0; j < accounts[i].length; j++) {
                // Calculate the total wealth of the current customer
                sum += accounts[i][j];
            }
            
            // Check if the wealth of the current customer is greater than the current maximum wealth
            if (maxs < sum) {
                // Update the maximum wealth if the condition is true
                maxs = sum;
            }
        }
        
        // Return the final maximum wealth
        return maxs;
    }
}

// Accepted
// Editorial
// Solution
// Runtime
// Details
// 0ms
// =>     Beats 100.00%of users with Java
// Memory
// Details
// 41.63MB
// Beats 59.52%of users with Java
// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
// Example 2:

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
// Example 3:

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17
 

// Constraints:
