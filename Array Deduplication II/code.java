//Given a sorted integer array, remove duplicate elements. 
//For each group of elements with the same value keep at most two of them. 
//Do this in-place, using the left side of the original array and maintain the relative order of the elements of the array. 
//Return the array after deduplication.

//Assumptions
//
//The given array is not null

//Examples
//
//{1, 2, 2, 3, 3, 3} → {1, 2, 2, 3, 3}



// My solution
//
public class Solution {
  public int[] dedup(int[] array) {
    if (array.length < 3) {
      return array;
    }
    
    int slow = 1;
    for (int fast = 2; fast < array.length; fast++) {
      if (array[fast] != array[slow - 1]) {
        array[++slow] = array[fast];
      }
    }
    
    int[] result = new int[slow + 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = array[i];
    }
    return result;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.3u24nh47lufp



