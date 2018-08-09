//Given an array, reverse all its elements.

//Example:
//array = [2, 3, 5, 7, 11]
//result: [11, 7, 5, 3, 2]

//Assumption: The array is not null or empty.



class Solution {
	public void reverse(int[] array) {
    int left = 0;
    int right = array.length - 1;
    
    while (left < right) {
      swap(array, left++, right--);
    }
	}
  
  private void swap(int[] array, int left, int right) {
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
  }
}


