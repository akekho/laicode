//Given a string, 
//a partitioning of the string is a palindrome partitioning if every substring of the partition is a palindrome. 
//Determine the fewest cuts needed for a palindrome partitioning of a given string.

//Assumptions
//The given string is not null

//Examples
//
//“a | babbbab | bab | aba” is a palindrome partitioning of “ababbbabbababa”.
//The minimum number of cuts needed is 3.




// My solution
//
public class Solution {
    public int minCuts(String input) {
        if (input.length() <= 1) {
            return 0;
        }
        char[] array = input.toCharArray();
        int[] dp = new int[array.length];
        for (int i = 0; i < dp.length; i++) {
            if (isPalindrome(array, 0, i)) {
                dp[i] = 0;
            }
            else {
                dp[i] = i;
                for (int j = 1; j <= i; j++) {
                    if (isPalindrome(array, j, i)) {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }

    private boolean isPalindrome(char[] input, int left, int right) {
        while (left < right) {
            if (input[left] != input[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.4ey90yr8y6al



