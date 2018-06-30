//Given an array of balls, where the color of the balls can only be Red, Green or Blue, 
//sort the balls such that all the Red balls are grouped on the left side, 
//all the Green balls are grouped in the middle and all the Blue balls are grouped on the right side. 
//(Red is denoted by -1, Green is denoted by 0, and Blue is denoted by 1).

//Examples
//
//  {0} is sorted to {0}
//  {1, 0} is sorted to {0, 1}
//  {1, 0, 1, -1, 0} is sorted to {-1, 0, 0, 1, 1}

//Assumptions
//
//The input array is not null.

//Corner Cases
//
//What if the input array is of length zero? In this case, we should not do anything as well.



// My solution
//
public class Solution {
  public int[] rainbowSort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    
    int left = 0;
    int pointer = 0;
    int right = array.length - 1;
    
    while (pointer <= right) {
      if (array[pointer] == -1) {
        swap(array, pointer, left);
        left++;
        pointer++;
      }
      else if (array[pointer] == 0) {
        pointer++;
      }
      else {
        swap(array, pointer, right);
        right--;
      }
    }
    
    return array;
  }
  
  private void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.87oymy8qgiat


