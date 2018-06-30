//Given an array of integers, sort the elements in the array in ascending order. 
//The quick sort algorithm should be used to solve this problem.

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
  public int[] quickSort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    
    quickSort(array, 0, array.length - 1);
    
    return array;
  }
  
  private void quickSort(int[] A, int start, int end){
      if (start >= end){
          return;
      }
        
      int left = start;
      int right = end;
      int pivot = A[(left + right) / 2];

      while (left <= right){
          while (left <= right && A[left] < pivot){
              left++;
          }

          while (left <= right && A[right] > pivot){
              right--;
          }

          if (left <= right){
              swap(A, left, right);
              left++;
              right--;
          }
      }
       
      quickSort(A, start, right);
      quickSort(A, left, end);
  }
  
  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.vmhi904d8so4


