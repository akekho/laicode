//Determine if a given integer is power of 2.

//Examples
//
//16 is power of 2 (2 ^ 4)
//3 is not
//0 is not
//-1 is not



// My solution
//
public class Solution {
  public boolean isPowerOfTwo(int number) {
    return (number & (number - 1)) == 0 && number > 0;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.nugiotueo183



