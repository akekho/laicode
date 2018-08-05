//Given two strings s and t, write a function to determine if t is an anagram of s.

//For example,
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.

//Note:
//You may assume the string contains only lowercase alphabets.

//Follow up:
//What if the inputs contain unicode characters? How would you adapt your solution to such case?



// My solution
//
public class Solution {
    public boolean isAnagram(String l, String s) {        
        if (l == null || s == null || s.length() != l.length()) {
            return false;
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
        }

        return matches == 0;
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



