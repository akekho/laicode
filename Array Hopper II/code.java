//Given an array A of non-negative integers, you are initially positioned at index 0 of the array. 
//A[i] means the maximum jump distance from index i (you can only jump towards the end of the array). 
//Determine the minimum number of jumps you need to reach the end of array. 
//If you can not reach the end of the array, return -1.

//Assumptions
//The given array is not null and has length of at least 1.

//Examples
//
//{3, 3, 1, 0, 4}, the minimum jumps needed is 2 (jump to index 1 then to the end of array)
//{2, 1, 1, 0, 2}, you are not able to reach the end of array, return -1 in this case.




// My solution
//
// from end to start
//
public class Solution {       
  public int minJumpII(int[] array) {
    if (array.length == 1) {
      return 0;
    }
    
    int length = array.length;
    int[] DP = new int[length];
    DP[length - 1] = 0;
    
    for (int i = length - 2; i >= 0; i--) {
      if (array[i] + i >= length - 1) {
        DP[i] = 1;
      }
      else if (array[i] == 0) {
        DP[i] = -1;
      }
      else {
        int minhop = Integer.MAX_VALUE;
        for (int j = i + 1; j <= i + array[i]; j++) {
          if (DP[j] > -1 && DP[j] < minhop) {
            minhop = DP[j];
          }
        }
        DP[i] = minhop == Integer.MAX_VALUE ? -1 : minhop + 1;
      }
    }
    return DP[0];
  }
}




// from start to end
//
public class Solution {
    public static int minJump(int[] array) {
        int length = array.length;
        int[] minJump = new int[length];
        minJump[0] = 0;
        for (int i = 1; i < length; i++) {
            minJump[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (j + array[j] >= i && minJump[j] != -1) {
                    if (minJump[i] == -1 || minJump[i] > minJump[j] + 1) {
                        minJump[i] = minJump[j] + 1;
                    }
                }
            }
        }
        return minJump[length - 1];
    }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.m7ceihkzmgrl



