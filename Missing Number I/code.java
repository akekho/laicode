//Given an integer array of size N - 1, containing all the numbers from 1 to N except one, find the missing number.

//Assumptions
//
//The given array is not null, and N >= 1

//Examples
//
//A = {2, 1, 4}, the missing number is 3
//A = {1, 2, 3}, the missing number is 4
//A = {}, the missing number is 1




// My solution
//

public class Solution {
  public int missing(int[] array) {
    int andAll = 0;
    for (int i = 1; i <= array.length + 1; i++) {
      andAll ^= i;
    }
    
    for (int i = 0; i < array.length; i++) {
      andAll ^= array[i];
    }
    
    return andAll;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.4qh37p2j7ovz


