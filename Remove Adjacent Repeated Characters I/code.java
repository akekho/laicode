//Remove adjacent, repeated characters in a given string, leaving only one character for each group of such characters.

//Assumptions
//
//Try to do it in place.

//Examples
//
//“aaaabbbc” is transferred to “abc”

//Corner Cases
//
//If the given string is null, we do not need to do anything.



// My solution
//
public class Solution {
  public String deDup(String input) {
    if (input == null || input.length() < 2) {
      return input;
    }
    
    char[] charArray = input.toCharArray();
    
    int slow = 0; 
    int fast = 1;
    
    while (fast < charArray.length) {
      if (charArray[slow] != charArray[fast]) {
        charArray[++slow] = charArray[fast];
      }
      fast++;
    }
    
    return new String(charArray, 0, slow + 1);
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.lc0ex4qvni22


