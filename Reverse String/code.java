//Reverse a given string.

//Assumptions
//
//The given string is not null.



// My solution
//
public class Solution {
  public String reverse(String input) {
    if (input.isEmpty()) {
      return input;
    }
    
    char[] charArray = input.toCharArray();    
    int left = 0; 
    int right = charArray.length - 1;
    
    while (left < right) {
      swap(charArray, left++, right--);      
    }
    
    return new String(charArray);
  }
  
  private void swap(char[] charArray, int left, int right) {
    char temp = charArray[left];
    charArray[left] = charArray[right];
    charArray[right] = temp;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.zhx07dy8an4e



