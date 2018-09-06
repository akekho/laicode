//Given a matrix, find the Kth index element.

//Example: 
//matrix:
// 1 3 4
// 5 6 7
// 8 9 10
//
//k = 4 → return: 6




// My solution
//
public class Solution {
  public int findElement(int[][] matrix, int k) {
    int col = matrix[0].length;
    return matrix[k/col][k%col];
  }
}




