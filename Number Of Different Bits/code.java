//Determine the number of bits that are different for two given integers.

//Examples
//
//5(“0101”) and 8(“1000”) has 3 different bits




// My solution
//
public class Solution {
  public int diffBits(int a, int b) {
    int bit = 0;
    // 注意increment条件要用>>>而不是>>，当a^b为负数时，首位为1，用>>会一直在左侧补1导致死循环    
    for (int c = a ^ b; c != 0; c >>>= 1) {
      bit += c & 1;
    }    
    return bit;
  }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.vtjq7ro1u9m



