//Given a target integer T, a non-negative integer K and an integer array A sorted in ascending order, 
//find the K closest numbers to T in A.

//Assumptions
//
//A is not null
//K is guranteed to be >= 0 and K is guranteed to be <= A.length

//Return
//
//A size K integer array containing the K closest numbers(not indices) in A, 
//sorted in ascending order by the difference between the number and T. 

//Examples
//
//A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
//A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}



// My solution
//
public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    if (array == null || array.length == 0) {
      return array;
    }
    
    if (k == 0) {
      return new int[] {};
    }
    
    int left = smallerClosest(array, target, k);
    int right = left + 1;
    
    int[] result = closestHelper(array, left, right, target, k);
    
    return result;
  }
  
  private int[] closestHelper(int[] array, int left, int right, int target, int k) {
    int[] result = new int[k];
    
    for (int i = 0; i < k; i++) {
      if (right >= array.length || left >= 0 && target - array[left] <= array[right] - target) {
        result[i] = array[left];
        left--;
      }
      else {
        result[i] = array[right];
        right++;
      }
    }
    
    return result;
  }
  
  private int smallerClosest(int[] array, int target, int k) {
    int left = 0;
    int right = array.length - 1;
    
    while (left + 1 < right) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        return mid;
      }
      else if (array[mid] > target) {
        right = mid;
      }
      else {
        left = mid;
      }
    }
    
    if (array[right] < target) {
      return right;
    }
    if (array[left] < target) {
      return left;
    }    
    
    return -1;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.8bsx68esa3i

