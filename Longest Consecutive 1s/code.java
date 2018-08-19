//Given an array containing only 0s and 1s, find the length of the longest subarray of consecutive 1s.

//Assumptions
//
//The given array is not null

//Examples
//
//{0, 1, 0, 1, 1, 1, 0}, the longest consecutive 1s is 3.



// My solution
//
public class Solution {
  public int longest(int[] array) {
    if (array.length == 0) {
      return 0;
    }
    int last = array[0];
    int max = last;
    
    for (int i = 1; i < array.length; i++) {
      last = array[i] == 0 ? 0 : last + 1;
      max = Math.max(last, max);
    }
    return max;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.gh2aghg2uupx



