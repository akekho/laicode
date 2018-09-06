//Calculate the factorial of n using recursion.

//Assumption: n >= 1.

//Example:
//n = 1 ⇒ return 1
//n = 3 ⇒ return 6
//n = 5 ⇒ return 120



// My solution
//
public class Solution {
  public long factorial(int n) {
    long fac = 1;
    for (int i = 1; i <= n; i++) {
      fac *= i;
    }
    return fac;
  }
}




