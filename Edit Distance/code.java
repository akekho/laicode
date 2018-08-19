//Given two strings of alphanumeric characters, 
//determine the minimum number of Replace, Delete, and Insert operations needed to transform one string into the other.

//Assumptions
//Both strings are not null

//Examples
//string one: “sigh”, string two : “asith”
//the edit distance between one and two is 2 (one insert “a” at front then replace “g” with “t”).




// My solution
//
public class Solution {
  public int editDistance(String one, String two) {
    int lengthOne = one.length();
    int lengthTwo = two.length();    
    if (lengthOne == 0 && lengthTwo == 0) {
      return 0;
    }
    if (lengthOne == 0) {
      return lengthTwo;
    }
    if (lengthTwo == 0) {
      return lengthOne;
    }
    
    int[][] DP = new int[lengthOne + 1][lengthTwo + 1];
    DP[0][0] = 0;
    for (int i = 0; i < lengthOne + 1; i++) {
      for (int j = 0; j < lengthTwo + 1; j++) {
        if (i == 0) {
          DP[i][j] = j;
        }
        else if (j == 0) {
          DP[i][j] = i;
        }        
        else if (one.charAt(i - 1) == two.charAt(j - 1)) {
          DP[i][j] = DP[i - 1][j - 1];
        }
        else {
          DP[i][j] = getMin(DP[i - 1][j - 1], DP[i - 1][j], DP[i][j - 1]) + 1;
        }
      }
    }
    return DP[lengthOne][lengthTwo];
  }
  
  private int getMin(int a, int b, int c) {
    int temp = Math.min(a, b);
    return Math.min(temp, c);
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.t16xu0tis8j0



