//Repeatedly remove all adjacent, repeated characters in a given string from left to right.

//No adjacent characters should be identified in the final string.

//Examples
//
//"abbbaaccz" → "aaaccz" → "ccz" → "z"
//"aabccdc" → "bccdc" → "bdc"



// My solution
//
  public String deDup(String input) {
    if (input == null || input.length() < 2) {
      return input;
    }
    
    char[] charArray = input.toCharArray();
    int slow = -1;

    for (int fast = 0; fast < charArray.length; fast++) {
      if (slow == -1 || charArray[slow] != charArray[fast]) {
        charArray[++slow] = charArray[fast];
      }
      else {
        //这里要判断fast和fast+1，而不是fast-1和fast，
        //因为一轮for循环结束之后fast自动++，如果是fast-1和fast的话，
        //while结束时fast如果在最后一个字母，到了for循环末尾，fast++之后会跳出for循环
        //这样最后一个字母没有经过判断就被跳过了
        while (fast + 1 < charArray.length && charArray[fast] == charArray[fast + 1]) {
          fast++;
        }
        slow--;
      }
    }
    
    return new String(charArray, 0, slow + 1);
  }
  
  
  
  // Professional solution
  //
  https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.cmbo1c6438c0
  
  
  
