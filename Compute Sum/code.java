//Given an array, return sum of all elements.

//Example:
//array = [7, 3, 2], return 12

//Note: if the array is null or empty, return 0.


public class Solution {
  public int sum(int[] array) {
    int sum = 0;
    
    if (array == null || array.length == 0) {
      return sum;
    }
    
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }
}



