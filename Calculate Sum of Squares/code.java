//Calculate the sum of all square numbers between 1 and n (inclusive).

//Example:
//n = 3. Return 1;
//n = 10. Return 14 (1 + 4 + 9);

public class Solution {
  public int sumOfSquares(int n) {
    int sum = 0;
    for (int i = 1; i * i <= n; i++) {
      sum += i * i;
    }
    return sum;
  }
}



