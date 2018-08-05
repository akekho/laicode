//Given an array of elements, reorder it as follow:
//
//{ N1, N2, N3, …, N2k } → { N1, Nk+1, N2, Nk+2, N3, Nk+3, … , Nk, N2k }
//
//{ N1, N2, N3, …, N2k+1 } → { N1, Nk+1, N2, Nk+2, N3, Nk+3, … , Nk, N2k, N2k+1 }
//
//Try to do it in place.

//Assumptions
//
//The given array is not null

//Examples
//
//{ 1, 2, 3, 4, 5, 6} → { 1, 4, 2, 5, 3, 6 }
//
//{ 1, 2, 3, 4, 5, 6, 7, 8 } → { 1, 5, 2, 6, 3, 7, 4, 8 }
//
//{ 1, 2, 3, 4, 5, 6, 7 } → { 1, 4, 2, 5, 3, 6, 7 }




// My solution
//
public class Solution {
  public int[] reorder(int[] array) {
    if (array.length == 0) {
      return array;
    }
    
    if (array.length % 2 == 0) {
      convert(array, 0, array.length - 1);      
    }
    else {
      convert(array, 0, array.length - 2);
    }
    
    return array;    
  }
  
  private void convert(int[] array, int left, int right) {
    if (right <= left + 1) {
      return;
    }
    
    int size = right - left + 1;
    int mid = left + size / 2;
    int leftMid = left + size / 4;
    int rightMid = left + size * 3 / 4;
    
    reverse(array, leftMid, mid - 1);
    reverse(array, mid, rightMid - 1);
    reverse(array, leftMid, rightMid - 1);
    
    convert(array, left, left + 2 * (leftMid - left) - 1);
    convert(array, left + 2 * (leftMid - left), right);
  }
  
  private void reverse(int[] array, int left, int right) {
    while (left < right) {
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.khlia22y7pu9



