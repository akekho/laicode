//There is a wooden stick with length L >= 1, we need to cut it into pieces, 
//where the cutting positions are defined in an int array A. 
//The positions are guaranteed to be in ascending order in the range of [1, L - 1]. 
//The cost of each cut is the length of the stick segment being cut. 
//Determine the minimum total cost to cut the stick into the defined pieces.

//Examples
//L = 10, A = {2, 4, 7}, the minimum total cost is 10 + 4 + 6 = 20 (cut at 4 first then cut at 2 and cut at 7)




// My solution
//
public class Solution {
  public int minCost(int[] cuts, int length) {
    if (length == 1 || cuts == null || cuts.length == 0) {
      return 0;
    }
    
    int[] helper = new int[cuts.length + 2];
    helper[0] = 0;
    for (int i = 0; i < cuts.length; i++) {
      helper[i + 1] = cuts[i];
    }
    helper[helper.length - 1] = length;
    
    int[][] minCost = new int[helper.length][helper.length];
    for (int i = 1; i < helper.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (j + 1 == i) {
          minCost[j][i] = 0;
        }
        else {
          minCost[j][i] = Integer.MAX_VALUE;
          for (int k = j + 1; k <= i - 1; k++) {
            minCost[j][i] = Math.min(minCost[j][i], minCost[j][k] + minCost[k][i]);
          }
          minCost[j][i] += helper[i] - helper[j];
        }
      }
    }
    return minCost[0][helper.length - 1];
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.9e9drztl94vl



