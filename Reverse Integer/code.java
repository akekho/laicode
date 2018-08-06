//Reverse digits of an integer.

//Assumptions
//If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
//Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, 
//then the reverse of 1000000003 overflows. How should you handle such cases?
//For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

//Examples
//Input:    23
//Output:   32
//
//Input:   -14
//Output:  -41




// My solution
//
public class Solution {
  public int reverse(int x) {
    int reverse = 0;
    
    while (x != 0) {
      int temp = reverse * 10 + x % 10;
      x /= 10;
      if (temp / 10 != reverse) {
        reverse = 0;
        break;
      }      
      reverse = temp;
    }
    
    return reverse;
  }
}




