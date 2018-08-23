//Given an unlimited flow of numbers, keep track of the median of all elements seen so far.

//You will have to implement the following two methods for the class

//read(int value) - read one value from the flow
//median() - return the median at any time, return null if there is no value read so far

//Examples
//
//read(1), median is 1
//read(2), median is 1.5
//read(3), median is 2
//read(10), median is 2.5
//......




// My solution
//
public class Solution {
  private PriorityQueue<Integer> smallHalf;
  private PriorityQueue<Integer> largeHalf;  
  private int size;
  public Solution() {
    this.smallHalf = new PriorityQueue<>(Collections.reverseOrder());
    this.largeHalf = new PriorityQueue<>();    
    this.size = 0;
  }
  
  public void read(int value) {
    size++;
    if (smallHalf.isEmpty() || value <= smallHalf.peek()) {
      smallHalf.offer(value);
      if (smallHalf.size() > largeHalf.size() + 1) {
        largeHalf.offer(smallHalf.poll());
      }
    }
    else {
      largeHalf.offer(value);
      if (smallHalf.size() < largeHalf.size()) {
        smallHalf.offer(largeHalf.poll());
      }      
    }    
  }
  
  public Double median() {
    if (size == 0) {
      return null;
    }
    if (size % 2 == 0) {
      return (smallHalf.peek() + largeHalf.peek()) / 2.0;
    }
    else {
      return (double) smallHalf.peek();
    }
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.2qhhwtjxztyg



