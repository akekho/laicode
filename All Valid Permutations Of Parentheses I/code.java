//Given N pairs of parentheses “()”, return a list with all the valid permutations.

//Assumptions
//
//N >= 0

//Examples
//
//N = 1, all valid permutations are ["()"]
//N = 3, all valid permutations are ["((()))", "(()())", "(())()", "()(())", "()()()"]
//N = 0, all valid permutations are [""]



// My solution
//

public class Solution {
  public List<String> validParentheses(int n) {
    List<String> result = new ArrayList<>();
    
    if (n == 0) {
      return result;
    }
    
    DFS(result, 0, 0, new StringBuilder(), n);

    return result;
  }
  
  private void DFS(List<String> result, int left, int right, StringBuilder sb, int n) {
    if (left + right == 2 * n) {
      result.add(sb.toString());
      return;
    }
    
    if (left < n) {
      sb.append("(");
      DFS(result, left + 1, right, sb, n);
      sb.deleteCharAt(sb.length() - 1);
    }
    
    if (left > right) {
      sb.append(")");
      DFS(result, left, right + 1, sb, n);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.5fdgf2jmbmoo


