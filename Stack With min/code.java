//Enhance the stack implementation to support min() operation. 
//min() should return the current minimum value in the stack. 
//If the stack is empty, min() should return -1.

//pop() - remove and return the top element, if the stack is empty, return -1

//push(int element) - push the element to top
//top() - return the top element without remove it, if the stack is empty, return -1
//min() - return the current min value in the stack.




// My solution
//
public class Solution {
  
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;
  
  public Solution() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();    
  }
  
  public int pop() { 
    if (stack1.empty()) {
      return -1;
    }
    else {
        int result = stack1.pop();
        if (result == stack2.peek()) {
            stack2.pop();
        }
        return result;
    }
  }
  
  public void push(int element) {
    if (stack2.empty() || element <= stack2.peek()) {
      stack2.push(element);
    }
    stack1.push(element);
  }
  
  public int top() {        
    return stack1.empty() ? -1 : stack1.peek();
  }
  
  public int min() {
    return stack2.empty() ? -1 : stack2.peek();
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.npw38aqbqa6e

