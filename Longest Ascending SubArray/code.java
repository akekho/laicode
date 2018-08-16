//Given an unsorted array, find the length of the longest subarray in which the numbers are in ascending order.

//Assumptions
//The given array is not null

//Examples
//
//{7, 2, 3, 1, 5, 8, 9, 6}, longest ascending subarray is {1, 5, 8, 9}, length is 4.
//{1, 2, 3, 3, 4, 4, 5}, longest ascending subarray is {1, 2, 3}, length is 3.




// My solution
//
public class Solution {
  public int longest(int[] array) {
    if (array.length == 0) {
      return 0;
    }
    
    int curr = 1;
    int global_max = 1;
    
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i - 1]) {
        curr++;
      }
      else {
        curr = 1;
      }
      
      global_max = Math.max(global_max, curr);
    }
    
    return global_max;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.5qwg8iei641



