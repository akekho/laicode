//Use the least number of comparisons to get the largest and smallest number in the given integer array. 
//Return the largest number and the smallest number.

//Assumptions
//
//The given array is not null and has length of at least 1

//Examples
//{2, 1, 5, 4, 3}, the largest number is 5 and smallest number is 1. return [5, 1].




// My solution
//
public class Solution {
  public int[] largestAndSmallest(int[] array) {
    int length = array.length;
    compareByTwo(array, 0, length - 1);
    int min = getSmallest(array, 0, length/2);
    int max = getLargest(array, length/2, length - 1);
    return new int[] {max, min};
  }
  
  private void compareByTwo(int[] array, int left, int right) {
    while (left < right) {
      if (array[left] > array[right]) {
        swap(array, left, right);
      }
      left++;
      right--;
    }
  }
  
  private int getSmallest(int[] array, int start, int end) {
    int global_min = array[start];
    for (int i = start; i <= end; i++) {
      if (array[i] < global_min) {
        global_min = array[i];
      }
    }
    return global_min;
  }
  
    private int getLargest(int[] array, int start, int end) {
    int global_max = array[start];
    for (int i = start; i <= end; i++) {
      if (array[i] > global_max) {
        global_max = array[i];
      }
    }
    return global_max;
  }
  
  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.118ydvwwownj



