//Reverse the words in a sentence.

//Assumptions
//
//Words are separated by single space
//
//There are no heading or tailing white spaces

//Examples
//
//“I love Google” → “Google love I”

//Corner Cases
//
//If the given string is null, we do not need to do anything.



// My solution
//
public class Solution {
  public String reverseWords(String input) {
    if (input == null || input.length() == 0) {
      return input;
    }
    
    char[] charArray = input.toCharArray();
    reverse(charArray, 0, charArray.length - 1);
    
    int space = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] != ' ' && (i == 0 || charArray[i - 1] == ' ')) {
        space = i;
      }
      if (charArray[i] != ' ' && (i == charArray.length - 1 || charArray[i + 1] == ' ')) {
        reverse(charArray, space, i);
      }
    }
    
    return new String(charArray);
  }
  
  private void reverse(char[] charArray, int left, int right) {         
    while (left < right) {
      swap(charArray, left++, right--);      
    }   
  }
  
  private void swap(char[] charArray, int left, int right) {
    char temp = charArray[left];
    charArray[left] = charArray[right];
    charArray[right] = temp;
  }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.svwfieblswv0



