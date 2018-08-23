//Given a random generator random5(), the return value of random5() is 0 - 4 with equal probability. 
//Use random5() to implement random1000()



// My solution
//
public class Solution {
  public int random1000() {
    // 5 ^ 5 = 3125
    while (true) {
      int value = 0;
      for (int i = 0; i < 5; i++) {
        value = value * 5 + RandomFive.random5();
      }      
      if (value < 3000) {
        return value % 1000;
      }
    }
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.o2mkzv3t9fm9



