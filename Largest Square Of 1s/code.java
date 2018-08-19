//Determine the largest square of 1s in a binary matrix (a binary matrix only contains 0 and 1), 
//return the length of the largest square.

//Assumptions
//
//The given matrix is not null and guaranteed to be of size N * N, N >= 0

//Examples
//
//  { {0, 0, 0, 0},
//    {1, 1, 1, 1},
//    {0, 1, 1, 1},
//    {1, 0, 1, 1} }
//
//the largest square of 1s has length of 2



// My solution
//
public class Solution {
  public int largest(int[][] matrix) {
    if (matrix.length == 0) {
      return 0;
    }
    
    int max = 0;
    int[][] DP = new int[matrix.length][matrix[0].length];
    
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == 0 || j == 0) {
          DP[i][j] = matrix[i][j] == 0 ? 0 : 1;
        }
        else if (matrix[i][j] == 1) {
          DP[i][j] = getMin(DP[i - 1][j - 1], DP[i - 1][j], DP[i][j - 1]) + 1;
        }
        max = Math.max(max, DP[i][j]);        
      }
    }
    return max;
  }
  
  private int getMin(int a, int b, int c) {
    int temp = Math.min(a, b);
    return Math.min(temp, c);
  }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.2kj7goqntnn



