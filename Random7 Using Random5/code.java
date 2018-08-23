//Given a random generator random5(), the return value of random5() is 0 - 4 with equal probability. 
//Use random5() to implement random7().



// My solution
//
public class Solution {
  public int random7() {
    while (true) {
      int random = 5* RandomFive.random5() + RandomFive.random5();
      if (random < 21) {
        return random % 7;
      }
    }    
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.g0gnzfm2pwn



