//Given an array of integers, move all the 0s to the right end of the array.

//The relative order of the elements in the original array need to be maintained.

//Assumptions:
//The given array is not null.

//Examples:
//
//{1} --> {1}
//{1, 0, 3, 0, 1} --> {1, 3, 1, 0, 0}




// My solution
//
public class Solution {
  public int[] moveZero(int[] array) {
    if (array.length <= 1) {
      return array;
    }
    
    int slow = -1;
    int fast = 0;
    while (fast < array.length) {
      if (array[fast] != 0) {
        array[++slow] = array[fast++];
      }
      else {
        fast++;
      }
    }
    
    for (int i = slow + 1; i < array.length; i++) {
      array[i] = 0;
    }
    return array;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.6g40cr5fr0rd



