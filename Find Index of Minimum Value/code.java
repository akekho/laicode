//Given an array, and a starting index “i”. 
//Find the index of the smallest value from index i (inclusive) to the end of the array.

//Example:
//array = {1, 9, 6, 8, 7}, i = 1 ⇒ return 2
//
//array = {0, 3, 9, 8, 5, 4}, i = 2 ⇒ return 5

//Assumption:
//The array is not null or empty. i is within the boundary of the array.




// My solution
//
public class Solution {
  public int minIndex(int[] array, int i) {
    int min = array[i];
    int result = i;
    for (int index = i; index < array.length; index++) {
      if (array[index] < min) {
        min = array[index];
        result = index;
      }
    }
    return result;
  }
}



