//Example: 

//a = 3, b = 4  Return 81
//a = 4, b = 2  Return 16

//Assumption: a > 0, b > 0

//Note: don’t worry about time complexity for now.



public class Solution {
  public int power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    
    int half = power(a, b / 2);
    if (b % 2 == 0) {
      return half * half;
    }
    else {
      return half * half * a;
    }
  }
}



