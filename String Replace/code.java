//Given an original string input, and two strings S and T, replace all occurrences of S in input with T.

//Assumptions
//
//input, S and T are not null, S is not empty string

//Examples
//
//input = "appledogapple", S = "apple", T = "cat", input becomes "catdogcat"
//input = "dodododo", S = "dod", T = "a", input becomes "aoao"



// My solution
//
// use StringBuilder
//
public class Solution {
  public String replace(String input, String source, String target) {
    StringBuilder sb = new StringBuilder();
    
    int fromIndex = 0;    
    int matchIndex = input.indexOf(source, fromIndex);
    
    while (matchIndex != -1) {
      sb.append(input, fromIndex, matchIndex); 
      sb.append(target);
      fromIndex = matchIndex + source.length();
      matchIndex = input.indexOf(source, fromIndex);
    }
    
    sb.append(input, fromIndex, input.length());
    
    return sb.toString();
  }
}
