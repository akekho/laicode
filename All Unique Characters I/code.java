//Determine if the characters of a given string are all unique.

//Assumptions
//
//The only set of possible characters used in the string are 'a' - 'z', the 26 lower case letters.
//The given string is not null.

//Examples
//
//the characters used in "abcd" are unique
//the characters used in "aba" are not unique




// My solution
//
public class Solution {
  public boolean allUnique(String word) {
    int[] bucket = new int[26];
    for (int i = 0; i < word.length(); i++) {
      int index = word.charAt(i) - 'a';
      if (bucket[index] != 0) {
        return false;
      }
      else {
        bucket[index]++;
      }
    }
    return true;
  }
}




