//Given an array of integers, sort the elements in the array in ascending order. 
//The merge sort algorithm should be used to solve this problem.

//Examples
//
//  {1} is sorted to {1}
//  {1, 2, 3} is sorted to {1, 2, 3}
//  {3, 2, 1} is sorted to {1, 2, 3}
//  {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

// Corner Cases
//
// What if the given array is null? In this case, we do not need to do anything.
// What if the given array is of length zero? In this case, we do not need to do anything.



// My solution
//
public class Solution {
  public int[] mergeSort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    
    int[] temp = new int[array.length];
    
    mergeSort(array, 0, array.length - 1, temp);
    return array;    
  }
  
  private void mergeSort(int[] array, int start, int end, int[] temp) {
    if (start >= end) {
      return;
    }
    
    int mid = start + (end - start) / 2;
    mergeSort(array, start, mid, temp);
    mergeSort(array, mid + 1, end, temp);
    merge(array, start, end, temp);
  }
  
  private void merge(int[] nums, int start, int end, int[] temp) {
    int left = start;
    int mid = start + (end - start) / 2;
    int right = mid + 1;
    int index = start;
    
    while (left <= mid && right <= end) {
      if (nums[left] < nums[right]) {
        temp[index] = nums[left];
        left++;
      }
      else {
        temp[index] = nums[right];
        right++;
      }
      index++;
    }
    
    while (left <= mid) {
      temp[index] = nums[left];
      left++; 
      index++;
    }
    while (right <= end) {
      temp[index] = nums[right];
      right++; 
      index++;
    }
    
    for (int i = start; i <= end; i++) {
      nums[i] = temp[i];
    }
  }    
}



//
