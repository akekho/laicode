//Given an array of integers, sort the elements in the array in ascending order. 
//The selection sort algorithm should be used to solve this problem.

//Examples
//
//  {1} is sorted to {1}
//  {1, 2, 3} is sorted to {1, 2, 3}
//  {3, 2, 1} is sorted to {1, 2, 3}
//  {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

//Corner Cases
//
//  What if the given array is null? In this case, we do not need to do anything.
//  What if the given array is of length zero? In this case, we do not need to do anything.



// My solution
//
public class Solution {
  public int[] solve(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    
    int min = 0;
    
    for (int i = 0; i < array.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      swap(array, i, min);
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
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.cs7x4uoo5vx4


