//Given two sorted arrays, merge them into one sorted array.

//Assumption: the two arrays are not null or empty.

//Example:
//array1 = {3,7}
//array2 = {1,6,8,9}
//answer = {1,3,6,7,8,9}




// My solution
//
public class Solution {
  public int[] merge(int[] one, int[] two) {
    int[] result = new int[one.length + two.length];
    int left = 0;
    int right = 0;
    int index = 0;
    
    while (left < one.length && right < two.length) {
      if (one[left] < two[right]) {
        result[index++] = one[left++];
      }
      else {
        result[index++] = two[right++];
      }
    }
    
    while (left < one.length) {
      result[index++] = one[left++];
    }
    while (right < two.length) {
      result[index++] = two[right++];
    }
    
    return result;
  }
}




