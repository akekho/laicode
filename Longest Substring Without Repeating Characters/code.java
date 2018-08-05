//Given a string, find the longest substring without any repeating characters and return the length of it. 
//The input string is guaranteed to be not null.

//For example, the longest substring without repeating letters for "bcdfbd" is "bcdf", we should return 4 in this case.




// My solution
//
public class Solution {
  public int longest(String input) {
    if (input.isEmpty()) {
      return 0;
    }
    
    int slow = 0; 
    int fast = 0;
    int maxLength = 0;
    Set<Character> hashset = new HashSet<>();
    
    while (fast < input.length()) {
      if (!hashset.contains(input.charAt(fast))) {
        hashset.add(input.charAt(fast++));
        maxLength = Math.max(maxLength, fast - slow);
      }
      else {
        hashset.remove(input.charAt(slow++));        
      }
    }
    
    return maxLength;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.72yqlokh2m51



