//Determine if a small string is a substring of another large string.

//Return the index of the first occurrence of the small string in the large string.

//Return -1 if the small string is not a substring of the large string.

//Assumptions
//
//Both large and small are not null
//If small is empty string, return 0

//Examples
//
//“ab” is a substring of “bcabc”, return 2
//“bcd” is not a substring of “bcabc”, return -1
//"" is substring of "abc", return 0




// My solution
//

// Naive solution
//
// Time complexity: O(m * n)
// Space complexity: O(1)
  public int strstr(String large, String small) {
    if (small.isEmpty()) {
      return 0;
    }
    
    if (large.length() < small.length()) {
      return -1;
    }
    
    for (int i = 0; i <= large.length() - small.length(); i++) {
      if (equal(large, small, i)) {
        return i;
      }
    }
    
    return -1;
  }
  
  private boolean equal(String large, String small, int i) {
    for (int j = 0; j < small.length(); j++) {
      if (large.charAt(i + j) == small.charAt(j)) {
        continue;
      }
      else {
        return false;
      }
    }
    
    return true;
  }
  
  
  
// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.hlcsrjrmaqg



