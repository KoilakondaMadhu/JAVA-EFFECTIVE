import java.util.Arrays;

public class Solution {
    public void rotate(int[][] matrix) {
        // Transpose the matrix (swap rows and columns)
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Transpose the matrix by swapping rows and columns
                temp[i][j] = matrix[j][i];
            }
        }

        // Reverse each row in the transposed matrix
        for (int i = 0; i < temp.length; i++) {
            // Iterate only half of the row to avoid re-reversing elements
            for (int j = 0; j < temp[i].length / 2; j++) {
                // Swap elements symmetrically across the middle of the row
                int tempVal = temp[i][j];
                temp[i][j] = temp[i][temp[i].length - 1 - j];
                temp[i][temp[i].length - 1 - j] = tempVal;
            }
        }

        // Update the original matrix with the rotated values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Copy the rotated values back to the original matrix
                matrix[i][j] = temp[i][j];
            }
        }
    }
}


// Input: matrix = 
//   [
//           [1,2,3],
//           [4,5,6],
//           [7,8,9]]
// Output: [ [7,4,1], 
//           [8,5,2],
          // [9,6,3]]





