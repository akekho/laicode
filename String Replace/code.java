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
// 每次找到source的index，从那个index开始把target加到StringBuilder末尾，
// 直到再也找不到source为止，最后把剩下的部分加上即可
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



// not using any String or StringBuilder utility, 
// and using char[] to do it "in place"
public class Solution {
  public String replace(String input, String source, String target) {
    char[] charArray = input.toCharArray();
    
    if (source.length() >= target.length()) {
      return replaceShorter(charArray, source, target);
    }
    else {
      return replaceLonger(charArray, source, target);
    }
  }
  
  private String replaceShorter(char[] input, String s, String t) {
    int slow = 0;
    int fast = 0;
    while (fast < input.length) {
      if (fast <= input.length - s.length() && equalSubstring(input, fast, s)) {
        copySubstring(input, slow, t);
        slow += t.length();
        fast += s.length();
      }
      else {
        input[slow++] = input[fast++];
      }
    }
    
    return new String(input, 0, slow);   
  }
  
  private String replaceLonger(char[] input, String s, String t) {
    ArrayList<Integer> matches = getAllMatches(input, s);
    
    char[] result = new char[input.length + matches.size() * (t.length() - s.length())];
    
    int lastIndex = matches.size() - 1;
    int fast = input.length - 1;
    int slow = result.length - 1;
    
    while (fast >= 0) {
      if (lastIndex >= 0 && fast == matches.get(lastIndex)) {
        copySubstring(result, slow - t.length() + 1, t);
        slow -= t.length();
        fast -= s.length();
        lastIndex--;        
      }
      else {
        result[slow--] = input[fast--];
      }
    }
    
    return new String(result);
  }
  
  private boolean equalSubstring(char[] input, int fromIndex, String s) {
    for (int i = 0; i < s.length(); i++) {
      if (input[fromIndex + i] != s.charAt(i)) {
        return false;
      }
    }
    return true;
  }
  
  private void copySubstring(char[] result, int fromIndex, String t) {
    for (int i = 0; i < t.length(); i++) {
      result[fromIndex + i] = t.charAt(i);
    }
  }
  
  private ArrayList<Integer> getAllMatches(char[] input, String s) {
    ArrayList<Integer> matches = new ArrayList<>();
    
    int i = 0; 
    
    while (i <= input.length - s.length()) {
      if (equalSubstring(input, i, s)) {
        matches.add(i + s.length() - 1);
        i += s.length();
      }
      else {
        i++;
      }
    }
    
    return matches;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.70h4zzxhb0wk



