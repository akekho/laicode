//Given a string, remove all leading/trailing/duplicated empty spaces.

//Assumptions:
//
//The given string is not null.

//Examples:
//
//“  a” --> “a”
//“   I     love MTV ” --> “I love MTV”



// My solution
//
// Time complexity: O(n)
// Space complexity: O(n)
  public String removeSpaces(String input) {
    if (input.isEmpty()) {
      return input;
    }
    
    char[] charArray = input.toCharArray();
    int slow = 0;

    for (int fast = 0; fast < charArray.length; fast++) {
      // 碰到空格时，有2种情况不需要拷贝：
      // 1. charArray首位的空格
      // 2. 每两个连续空格的第二个空格
      if (charArray[fast] == ' ' && (fast == 0 || charArray[fast - 1] == ' ')) {
        continue;
      }
      charArray[slow++] = charArray[fast];     
    }
    
    // 有可能输入最后有连续空格，跳出循环时最后的连续空格是拷贝了一个的
    // 因此需要判断一下 slow - 1 对应的位置是否是空格
    if (slow > 0 && charArray[slow - 1] == ' ') {
      return new String(charArray, 0, slow - 1);
    }
    
    return new String(charArray, 0, slow);
  }
  
  
  
  
// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.tf114xp47p67


