//Given an unsorted integer array, find the subarray that has the greatest sum. Return the sum.

//Assumptions
//
//The given array is not null and has length of at least 1.

//Examples
//{2, -1, 4, -2, 1}, the largest subarray sum is 2 + (-1) + 4 = 5
//{-2, -1, -3}, the largest subarray sum is -1




// My solution
//
public class Solution {
  public int largestSum(int[] array) {
    if (array.length == 1) {
      return array[0];
    }
    
    int last = array[0];
    int max = array[0];
    
    for (int i = 1; i < array.length; i++) {
      last = Math.max(last + array[i], array[i]);      
      max = Math.max(max, last);
    }
    return max;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.kck1ninjs4e4




Follow up: how to return the left-right border of the solution?

//Use temporary variables to store: global_start, global_end, curr_start, curr_end
//其实curr_end是不必要的，因为curr_end永远等于i，因此只需要3个变量即可
  
    public int largestSum(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        int last = array[0];
        int global_max = array[0];
        int g_start = 0;
        int g_end = 0;
        int curr_start = 0;

        for (int i = 1; i < array.length; i++) {
            // 如果last < 0，需要抛弃之前记录的结果，start重新开始记录
            // 否则更新last
            if (last < 0) {
                curr_start = i;
                last = array[i];
            }
            else {
                last += array[i];
            }

            // 如果global_max需要更新，那么同时更新g_start和g_end
            if (last > global_max) {
                g_start = curr_start;
                g_end = i;
                global_max = last;
            }
        }

        System.out.println("start: " + g_start + ", end: " + g_end);
        return global_max;
    }



