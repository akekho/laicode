//Given an array, return its minimum value

//Example:
//array = [7, 3, 2], return 2

//Note: if the array is null or empty, return 0.

public class Solution {
  public int min(int[] array) {
    if (array == null || array.length == 0) {
      return 0;
    }
    
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < array.length; i++) {
      min = Math.min(min, array[i]);
    }
    return min;
  }
}



