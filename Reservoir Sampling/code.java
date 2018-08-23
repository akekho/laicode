//Consider an unlimited flow of data elements. 
//How do you sample one element from this flow, such that at any point during the processing of the flow, 
//you can return a random element from the n elements read so far.

//You will implement two methods for a sampling class:
//
//read(int value) - read one number from the flow
//sample() - return at any time the sample, 
//if n values have been read, the probability of returning any one of the n values is 1/n, 
//return null(Java)/INT_MIN(C++) if there is no value read so far
//You may need to add more fields for the class.



// My solution
//
public class Solution {
  private int counter;
  private Integer sample;
  private Random random;
  public Solution() {
    this.counter = 0;
    this.sample = null;
    this.random = new Random();
  }
  
  public void read(int value) {
    counter++;
    if (random.nextInt(counter) == 0) {
      sample = value;
    }
  }
  
  public Integer sample() {
    return sample;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.jo6hibssz2p6



