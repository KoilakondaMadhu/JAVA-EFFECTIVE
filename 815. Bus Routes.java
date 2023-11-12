class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        // Base case: If the source and target stops are the same, no buses are needed.
        if (source == target) {
            return 0;
        }

        // Find the maximum stop number among all bus routes.
        int maxStop = -1;
        for (int[] route : routes) {
            for (int stop : route) {
                maxStop = Math.max(maxStop, stop);
            }
        }

        // If the target stop is not reachable by any bus, return -1.
        if (maxStop < target) {
            return -1;
        }

        int n = routes.length;
        int[] minBusesToReach = new int[maxStop + 1];
        Arrays.fill(minBusesToReach, n + 1); // Initialize with a value greater than n.
        minBusesToReach[source] = 0; // The source stop requires 0 buses.

        boolean flag = true;

        // Continue the loop until no further updates can be made.
        while (flag) {
            flag = false;

            // Iterate through each bus route.
            for (int[] route : routes) {
                int min = n + 1;

                // Find the minimum number of buses needed to reach any stop on the route.
                for (int stop : route) {
                    min = Math.min(min, minBusesToReach[stop]);
                }

                // Increment the minimum count.
                min++;

                // Update the minimum count for each stop on the route.
                for (int stop : route) {
                    if (minBusesToReach[stop] > min) {
                        minBusesToReach[stop] = min;
                        flag = true; // Set the flag to true to indicate that an update occurred.
                    }
                }
            }
        }

        // Return the result: minimum number of buses needed to reach the target or -1 if not reachable.
        return (minBusesToReach[target] < n + 1 ? minBusesToReach[target] : -1);
    }
}






// Accepted
// Runtime: 0 ms
// Case 1
// Case 2
// Input
// routes =
// [[1,2,7],[3,6,7]]
// source =
// 1
// target =
// 6
// Output
// 2
// Expected
// 2



// You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats forever.

// For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... forever.
// You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target. You can travel between bus stops by buses only.

// Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.

 

// Example 1:

// Input: routes = [[1,2,7],[3,6,7]], source = 1, target = 6
// Output: 2
// Explanation: The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
// Example 2:

// Input: routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
// Output: -1
 

// Constraints:

// 1 <= routes.length <= 500.
// 1 <= routes[i].length <= 105
// All the values of routes[i] are unique.
// sum(routes[i].length) <= 105
// 0 <= routes[i][j] < 106
// 0 <= source, target < 106
