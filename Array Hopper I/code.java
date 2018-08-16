//Given an array A of non-negative integers, you are initially positioned at index 0 of the array. 
//A[i] means the maximum jump distance from that position (you can only jump towards the end of the array). 
//Determine if you are able to reach the last index.

//Assumptions
//The given array is not null and has length of at least 1.

//Examples
//{1, 3, 2, 0, 3}, we are able to reach the end of array(jump to index 1 then reach the end of the array)
//{2, 1, 1, 0, 2}, we are not able to reach the end of array




// My solution
//
public class Solution {
  public boolean canJump(int[] array) {
    boolean[] DP = new boolean[array.length];
    DP[array.length - 1] = true;
      
    for (int i = array.length - 1; i >= 0; i--) {
      for (int j = i + 1; j <= i + array[i]; j++) {
        DP[i] = DP[i] || DP[j];
      }
    }
    return DP[0];
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.xr6u7gjqouma



