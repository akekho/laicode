//Given an unsorted integer array, find the subarray that has the greatest sum. 
//Return the sum and the indices of the left and right boundaries of the subarray. 
//If there are multiple solutions, return the leftmost subarray.

//Assumptions
//
//The given array is not null and has length of at least 1.

//Examples
//
//{2, -1, 4, -2, 1}, the largest subarray sum is 2 + (-1) + 4 = 5. 
//The indices of the left and right boundaries are 0 and 2, respectively.
//
//{-2, -1, -3}, the largest subarray sum is -1. 
//The indices of the left and right boundaries are both 1

//Return the result in a array as [sum, left, right]




// My solution
//
public class Solution {
  public int[] largestSum(int[] array) {
    // res直接初始化为{array[0], 0, 0}，省去单独赋值，
    // 同时for循环可从 i = 1 开始
	  int[] res = {array[0], 0, 0};
	  int lastmax = array[0];
	  int curr_left = 0;

  	for (int i = 1; i < array.length; i++) {
	  	if (lastmax > 0) {
		  	lastmax += array[i];
		  }
  		else {
	  		curr_left = i;
		  	lastmax = array[i];
  		}

	  	if (lastmax > res[0]) {
		  	res[0] = lastmax;
        res[1] = curr_left;
			  res[2] = i;
  		}
	  }
  	return res;    
  }
}



