//Given a string with no duplicate characters, return a list with all permutations of the characters.

//Examples
//
//Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
//Set = "", all permutations are [""]
//Set = null, all permutations are []



// My solution
//
// Time complexity: O(n!) （严格来说是O(n * n!)，因为总共有n!的可能性，
//                          每种可能性加入到result当中时调用new String(array)的时间是O(n)）
// Space complexity: O(n) (输入无重复)
//                   O(n^2) (输入有重复) 
// 输入有重复: recursion tree第一层的hashset最多有n个元素，第二层为n-1，第三层n-2......
// 总空间复杂度：O(n^2) = n + n-1 + n-2 + ... + 1
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
  
  // 为什么用DFS？
  // 这是一个探索所有可能性的问题
  // 一共多少层；每层做什么；base case
  private void helper(char[] array, List<String> result, int index) {
    if (index == array.length) {
      result.add(new String(array));
      return;
    }
    
    for (int i = index; i < array.length; i++) {
      // 如果输入允许重复，那么需要用hashset去重
      swap(array, i, index);
      helper(array, result, index + 1);
      swap(array, i, index);
    }
  }
  
//  如果输入允许重复，那么需要用hashset去重
//  需要去重的写法  
//   private static void helper(char[] charArray, int index) {
//       if (index == charArray.length) {
//           System.out.println(new String(charArray));
//           return;
//       }
  
//       这里的hashset处理的是每一层的重复，因此不能作为参数从主函数传入
//       Set<Character> hashset = new HashSet<>();
//       for (int i = index; i < charArray.length; i++) {
//           if (!hashset.contains(charArray[i])) {
//               swap(charArray, index, i);
//               hashset.add(charArray[i]);
//               helper(charArray, index + 1);
//               swap(charArray, index, i);
//           }
//       }
//   }  
  
  private void swap(char[] array, int a, int b) {
    char temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.8eywnv3wp206



