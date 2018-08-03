//Right shift a given string by n characters.

//Assumptions
//
//The given string is not null.
//n >= 0.



// My solution
//
public class Solution {
  public String rightShift(String input, int n) {
    if (input.length() < 2 || n == 0) {
      return input;
    }
    
    char[] charArray = input.toCharArray();
    n %= charArray.length;
    reverse(charArray, 0, charArray.length - 1 - n);
    reverse(charArray, charArray.length - n, charArray.length - 1);
    reverse(charArray, 0, charArray.length - 1);
    
    return new String(charArray);
  }
  
  private void reverse(char[] charArray, int left, int right) {
    while (left < right) {
      swap(charArray, left++, right--);
    }
  }
  
  private void swap(char[] charArray, int i, int j) {
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.5gc03yz4c7yv



