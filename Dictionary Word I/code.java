//Given a word and a dictionary, determine if it can be composed by concatenating words from the given dictionary.

//Assumptions
//
//The given word is not null and is not empty
//The given dictionary is not null and is not empty and all the words in the dictionary are not null or empty

//Examples
//Dictionary: {“bob”, “cat”, “rob”}
//Word: “robob” return false
//Word: “robcatbob” return true since it can be composed by "rob", "cat", "bob"




// My solution
//
public class Solution {
  public boolean canBreak(String input, String[] dict) {
    // boolean[] 的长度定为input.length() + 1，
    // 省一个corner case同时方便后续思考
    boolean[] DP = new boolean[input.length() + 1];
    Set<String> hashset = makeDict(dict);
    
    // i 是从1到input.length() + 1，而不是从0到input.length()
    // 因为boolean[]的长度为input.length() + 1
    for (int i = 1; i < input.length() + 1; i++) {
      if (hashset.contains(input.substring(0,i))) {
        DP[i] = true;
        continue;
      }
      
      // j相当于从1到i之间每一个能切的位置，只要有任何一个case满足条件，
      // DP[i]就返回true
      for (int j = 1; j < i; j++) {
        if (DP[j] && hashset.contains(input.substring(j,i))) {
          DP[i] = true;
          continue;
        }
      }
    }
    return DP[input.length()];
  }
  
  private Set<String> makeDict(String[] dict) {
    Set<String> hashset = new HashSet<>();
    for (String word : dict) {
      hashset.add(word);
    }
    return hashset;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.r0yk25cgddh3



