//Given a sorted integer array, remove duplicate elements. 
//For each group of elements with the same value do not keep any of them. 
//Do this in-place, using the left side of the original array 
//and and maintain the relative order of the elements of the array. 
//Return the array after deduplication.

//Assumptions
//
//The given array is not null

//Examples
//{1, 2, 2, 3, 3, 3} → {1}




// My solution
//
public class Solution {
  public int[] dedup(int[] array) {
    if (array.length <= 1) {
      return array;
    }
    
    int slow = 0;
    int end = 0;
    while (end < array.length) {
      int start = end;
      while (end < array.length && array[end] == array[start]) {
        end++;
      }
      if (end - start == 1) {
        array[slow++] = array[start];
      }
    }

    return Arrays.copyOf(array, slow);
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.10lkobgy5ewg



