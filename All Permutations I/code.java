//Given a string with no duplicate characters, return a list with all permutations of the characters.

//Examples
//
//Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
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
    
    char[] array = set.toCharArray();
    helper(array, result, 0);
    return result;
  }
  
  private void helper(char[] array, List<String> result, int index) {
    if (index == array.length) {
      result.add(new String(array));
      return;
    }
    
    for (int i = index; i < array.length; i++) {
      swap(array, i, index);
      helper(array, result, index + 1);
      swap(array, i, index);
    }
  }
  
  private void swap(char[] array, int a, int b) {
    char temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.8eywnv3wp206


