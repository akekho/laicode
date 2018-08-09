//求n的阶乘. Assumption, n > 1.

//Example:
//n = 3, return 6
//n = 4, return 24
//n = 5, return 120

public class Solution {
  public int factorial(int n) {
    int fac = 1;
    for (int i = 1; i <= n; i++) {
      fac *= i;
    }
    return fac;
  }
}



