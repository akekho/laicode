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
// DP: from end to start
public class Solution {
  public boolean canJump(int[] array) {
    if (array.length == 1) {
      return true;
    }
    
    boolean[] DP = new boolean[array.length];
    DP[array.length - 1] = true;
      
    for (int i = array.length - 2; i >= 0; i--) {
      if (i + array[i] >= array.length - 1) {
        DP[i] = true;
      }
      else {
        for (int j = i + 1; j <= i + array[i]; j++) {
          if (DP[j]) {
            DP[i] = true;
            break;
          }
        }
      }
    }
    return DP[0];
  }
}


// DP: from end to start
// Version 2
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


// DP: from start to end
public class Solution {
  public boolean canJump(int[] array) {
    if (array.length == 1) {
      return true;
    }

    boolean[] DP = new boolean[array.length];
    DP[0] = true;
    
    for (int i = 1; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        if (DP[j] && array[j] + j >= i) {
          DP[i] = true;
          break;
        }
      }
    }
    return DP[array.length - 1];
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.xr6u7gjqouma



