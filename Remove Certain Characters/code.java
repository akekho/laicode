//Remove given characters in input string, the relative order of other characters should be remained. 
//Return the new string after deletion.

//Assumptions
//
//The given input string is not null.
//The characters to be removed is given by another string, it is guranteed to be not null.

//Examples
//
//input = "abcd", t = "ab", delete all instances of 'a' and 'b', the result is "cd".



// My solution
//
public class Solution {
  public String remove(String input, String t) {
    if (input.length() == 0 || t.length() == 0) {
      return input;
    }
    
    char[] charArray = input.toCharArray();
    int slow = 0;
    Set<Character> charSet = getChar(t);
    
    for (int fast = 0; fast < charArray.length; fast++) {
      if (!charSet.contains(charArray[fast])) {
        charArray[slow++] = charArray[fast];
      }
    }
    
    return new String(charArray, 0, slow);
  }
  
  private Set<Character> getChar(String t) {
    Set<Character> result = new HashSet<>();
    
    for (int i = 0; i < t.length(); i++) {
      result.add(t.charAt(i));
    }
    
    return result;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.2on4bd4aj93i



