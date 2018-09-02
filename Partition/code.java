//Given an array, and a pivotIndex. 
//Rearrange the array so that the numbers smaller than array[pivotIndex] are on the left side of array[pivotIndex] 
//and numbers larger than array[pivotIndex] are on the right side of array[pivotIndex].

//Assumption:
//The array is not null or empty. pivotIndex is within the boundary of the array.

//Example:
//array = {9,4,6,2,0,1,7}
//pivotIndex = 2
//Result: {1, 4, 0, 2, 6, 9, 7} 




// My solution
//
class Solution {
	public void partition(int[] array, int pivotIndex) {    
    int pivot = array[pivotIndex];
    swap(array, array.length - 1, pivotIndex);
    int left = 0; 
    int right = array.length - 2;
    while (left <= right) {
      if (array[left] < pivot){
        left++;
      }
      else if (array[right] > pivot) {
        right--;
      }
      else {
        swap(array, left++, right--);
      }
    }
    swap(array, array.length - 1, left);
  }
  
  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}



