//Given an unsorted integer array, remove adjacent duplicate elements repeatedly, from left to right. 
//For each group of elements with the same value do not keep any of them.

//Do this in-place, using the left side of the original array. Return the array after deduplication.

//Assumptions
//
//The given array is not null

//Examples
//{1, 2, 3, 3, 3, 2, 2} → {1, 2, 2, 2} → {1}, return {1}




// My solution
//
public class Solution {
  public int[] dedup(int[] array) {
    if (array.length <= 1) {
      return array;
    }
    
    int slow = -1;
    int fast = 0;
    while (fast < array.length) {
      if (slow == -1 || array[fast] != array[slow]) {
        array[++slow] = array[fast++];
      }
      else if (array[fast] == array[slow]) {
        while (fast < array.length && array[fast] == array[slow]) {
          fast++;
        }
        slow--;
      }
    }
    return Arrays.copyOf(array, slow + 1);
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.17a319kakljx



