//Given a two-dimensional array, calculate the sum of all its elements

//Example:
//array = {{ 2, 3}, {4, 5}, {1, 0}}
//Return 15

//Assumption: The 2D array is not null or empty. The 2D array is rectangular shape.



public class Solution {
  public int sum(int[][] array) {
    int row = array.length;
    int col = array[0].length;
    int sum = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j ++) {
        sum += array[i][j];
      }
    }
    return sum;
  }
}



