//Find all occurrence of anagrams of a given string s in a given string l. Return the list of starting indices.

//Assumptions
//
//s is not null or empty.
//l is not null.

//Examples
//
//l = "abcbac", s = "ab", 
//return [0, 3] since the substring with length 2 starting from index 0/3 are all anagrams of "ab" ("ab", "ba").




// My solution
//
public class Solution {
  public List<Integer> allAnagrams(String s, String l) {
    List<Integer> result = new ArrayList<>();
    
    if (l.length() == 0 || s.length() > l.length()) {
      return result;
    }
    
    Map<Character, Integer> hashmap = getLetterFrequency(s);    
    int matches = hashmap.size();
        
    for (int i = 0; i < l.length(); i++) {
      char ch = l.charAt(i);
      Integer count = hashmap.get(ch);
      
      if (count != null) {        
        hashmap.put(ch, count - 1);
        if (count == 1) {
          matches--;
        }
      }
      
      if (i >= s.length()) {
        ch = l.charAt(i - s.length());
        count = hashmap.get(ch);
        
        if (count != null) {
          hashmap.put(ch, count + 1);
          if (count == 0) {
            matches++;
          }
        }
      }
      
      if (matches == 0) {
        result.add(i - s.length() + 1);
      }
    }
    
    return result;
  }
  
  private Map<Character, Integer> getLetterFrequency(String s) {
    Map<Character, Integer> hashmap = new HashMap<>();        
    for (int i = 0; i < s.length(); i++) {
      if (hashmap.containsKey(s.charAt(i))) {
        hashmap.put(s.charAt(i), hashmap.get(s.charAt(i)) + 1);
      }
      else {
        hashmap.put(s.charAt(i), 1);
      }
    }
    return hashmap;
  } 

}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#



