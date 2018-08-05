//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
//determine if the input string is valid. The brackets must close in the correct order.

//Examples
//
//"()" and "()[]{}", "[{()}()]" are all valid but "(]" and "([)]" are not.




// My solution
//
public class Solution {
  public boolean isValid(String input) {
    if (input == null || input.length() == 0) {
      return true;
    }
    
    Deque<Character> stack = new ArrayDeque<>();
    
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      
      if (ch == '(') {
        stack.push(')');
      }
      else if (ch == '[') {
        stack.push(']');
      }
      else if (ch == '{') {
        stack.push('}');
      }
      else {
        if (stack.isEmpty() || stack.pop() != ch) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}



