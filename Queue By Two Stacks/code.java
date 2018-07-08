//Java: Implement a queue by using two stacks. 
//The queue should provide size(), isEmpty(), offer(), poll() and peek() operations. 
//When the queue is empty, poll() and peek() should return null.

//C++: Implement a queue by using two stacks. 
//The queue should provide size(), isEmpty(), push(), front() and pop() operations. 
//When the queue is empty, front() should return -1.

//Assumptions
//
//The elements in the queue are all Integers.
//size() should return the number of elements buffered in the queue.
//isEmpty() should return true if there is no element buffered in the queue, false otherwise.



// My solution
//
public class Solution {
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;
  
  public Solution() {
    stack1 = new Stack<Integer>();
    stack2 = new Stack<Integer>();
  }
  
  public Integer poll() {
    if (!stack2.empty()) {
      return stack2.pop();
    }
    else {
      moveAll(stack1, stack2);
      return stack2.empty() ? null : stack2.pop();
    }
  }
  
  public void offer(int element) {
    stack1.push(element);
  }
  
  public Integer peek() {
    if (!stack2.empty()) {
      return stack2.peek();
    }
    else {
      moveAll(stack1, stack2);
      return stack2.empty() ? null : stack2.peek();
    }    
  }
  
  public int size() {
    return stack1.size() + stack2.size();
  }
  
  public boolean isEmpty() {
    return stack1.empty() && stack2.isEmpty();
  }
  
  private void moveAll(Stack stack1, Stack stack2) {
    while (!stack1.empty()) {
      stack2.push(stack1.pop());
    }
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.s070jvfaxyin

