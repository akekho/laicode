//Given a string with possible duplicate characters, return a list with all permutations of the characters.

//Examples
//
//Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
//Set = "aba", all permutations are ["aab", "aba", "baa"]
//Set = "", all permutations are [""]
//Set = null, all permutations are []



// My solution
//
public class Solution {
  public List<String> permutations(String set) {
    List<String> result = new ArrayList<>();
    
    if (set == null) {
      return result;
    }
    
    if (set.isEmpty()) {
      result.add(set);
      return result;
    }
    
    char[] charArray = set.toCharArray();
    
    DFS(charArray, result, 0);
    
    return result;    
  }
  
  private void DFS(char[] charArray, List<String> result, int index) {
    if (index == charArray.length) {
      result.add(new String(charArray));
      return;
    }
    Set<Character> hashset = new HashSet<>();
    for (int i = index; i < charArray.length; i++) {
      if (!hashset.contains(charArray[i])) {
        hashset.add(charArray[i]);
        swap(charArray, i, index);
        DFS(charArray, result, index + 1);
        swap(charArray, i, index);      
      }
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
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.xpv1udxj3e8x


