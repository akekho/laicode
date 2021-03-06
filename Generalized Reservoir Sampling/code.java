//Consider an unlimited flow of data elements. 
//How do you sample k element from this flow, such that at any point during the processing of the flow, 
//you can return a random set of k elements from the n elements read so far. 

//Assumptions
//
//k >= 1

//You will implement two methods for a sampling class:
//
//read(int value) - read one number from the flow
//sample() - return at any time the k samples as a list, 
//return the list of all values read when the number of values read so fas <= k.
//You may need to add more fields for the class.




// My solution
//
public class Solution {
  private final int k;
  private int counter;
  private Random random;
  private List<Integer> result;
  
  public Solution(int k) {   
    this.k = k;
    this.counter = 0;
    this.random = new Random();
    this.result = new ArrayList<>();
  }
  
  public void read(int value) {    
    counter++;
    
    if (counter <= k) {
      result.add(value);
    }
    else {
      int sample = random.nextInt(counter);
      if (sample < k) {
        result.set(sample, value); 
      }      
    }       
  }
  
  public List<Integer> sample() {   
    return result;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.20d127mzk9js



