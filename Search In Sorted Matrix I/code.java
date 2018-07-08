//Given a 2D matrix that contains integers only, which each row is sorted in an ascending order. 
//The first element of next row is larger than (or equal to) the last element of previous row.

//Given a target number, returning the position that the target locates within the matrix. 
//If the target number does not exist in the matrix, return {-1, -1}.

//Assumptions:
//
//The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.

//Examples:
//
//matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }
//
//target = 7, return {1, 2}
//
//target = 6, return {-1, -1} to represent the target number does not exist in the matrix.



// My solution
//
public class Solution {
  public int[] search(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return new int[] {-1, -1};
    }
    
    int row = matrix.length;
    int column = matrix[0].length;
    int left = 0;
    int right = row * column - 1;
    
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (matrix[mid / column][mid % column] == target) {
        return new int[] {mid / column, mid % column};
      }
      else if (matrix[mid / column][mid % column] > target) {
        right = mid - 1;
      }
      else {
        left = mid + 1;
      }
    }
    
    return new int[] {-1, -1};
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.oet664oqygmv

