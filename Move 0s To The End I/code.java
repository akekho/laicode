//Given an array of integers, move all the 0s to the right end of the array.

//The relative order of the elements in the original array does not need to be maintained.

//Assumptions:
//
//The given array is not null.

//Examples:
//
//  {1} --> {1}
//  {1, 0, 3, 0, 1} --> {1, 3, 1, 0, 0} or {1, 1, 3, 0, 0} or {3, 1, 1, 0, 0}



// My solution
//
public class Solution {
  public int[] moveZero(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    
    int left = 0;
    int right = array.length - 1;
    
    while (left <= right) {
      if (array[left] == 0) {
        swap(array, left, right);
        right--;
      }
      else {
        left++;
      }
    }
    
    return array;
  }
  
  private void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }  
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.xr3r3nnkecas


