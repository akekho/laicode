//Given a set of characters represented by a String, return a list containing all subsets of the characters.

//Assumptions
//There are no duplicate characters in the original set.

//Examples
//
//Set = "abc", all the subsets are [“”, “a”, “ab”, “abc”, “ac”, “b”, “bc”, “c”]
//Set = "", all the subsets are [""]
//Set = null, all the subsets are []



// My solution
//

public class Solution {
  public List<String> subSets(String set) {
    List<String> result = new ArrayList<>();
    
    if (set == null) {
      return result;
    }
    
    char[] charArray = set.toCharArray();
    helper(result, new StringBuilder(), charArray, 0);
    
    return result;
  }
  
  private void helper(List<String> result, StringBuilder sb, char[] charArray, int index) {
    if(index == charArray.length) {
      result.add(sb.toString());
      return;
    }
    
    sb.append(charArray[index]);
    helper(result, sb, charArray, index + 1);
    sb.deleteCharAt(sb.length() - 1);
    helper(result, sb, charArray, index + 1);
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.960jm31sqeo9


