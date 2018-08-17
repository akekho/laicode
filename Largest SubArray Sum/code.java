//Given an unsorted integer array, find the subarray that has the greatest sum. Return the sum.

//Assumptions
//
//The given array is not null and has length of at least 1.

//Examples
//{2, -1, 4, -2, 1}, the largest subarray sum is 2 + (-1) + 4 = 5
//{-2, -1, -3}, the largest subarray sum is -1




// My solution
//
public class Solution {
  public int largestSum(int[] array) {
    if (array.length == 1) {
      return array[0];
    }
    
    int last = array[0];
    int max = array[0];
    
    for (int i = 1; i < array.length; i++) {
      last = Math.max(last + array[i], array[i]);      
      max = Math.max(max, last);
    }
    return max;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.kck1ninjs4e4



