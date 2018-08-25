//Word “book” can be abbreviated to 4, b3, b2k, etc. 
//Given a string and an abbreviation, return if the string matches the abbreviation.

//Assumptions:
//
//The original string only contains alphabetic characters.
//Both input and pattern are not null.

//Examples:
//
//pattern “s11d” matches input “sophisticated” since “11” matches eleven chars “ophisticate”.



// My solution
//
public class Solution {
    public boolean match(String input, String pattern) {
        if (input.length() == 0 && pattern.length() == 0) {
            return true;
        }
        else if (input.length() == 0 || pattern.length() == 0) {
            return false;
        }
        return helper(input, pattern, 0, 0);
    }

    private boolean helper(String input, String pattern, int inputStart, int patternStart) {
        if (inputStart == input.length() && patternStart == pattern.length()) {
            return true;
        }
        else if (inputStart >= input.length() || patternStart >= pattern.length()) {
            return false;
        }
        // if (pattern.charAt(patternStart) < '0' || pattern.charAt(patternStart) > '9')
        // if (isLetter(pattern.charAt(patternStart)))
        // 上面两个if是等价的
        if (pattern.charAt(patternStart) < '0' || pattern.charAt(patternStart) > '9') {
            if (input.charAt(inputStart) == pattern.charAt(patternStart)) {
                return helper(input, pattern, inputStart + 1, patternStart + 1);
            }
            else {
                return false;
            }
        }
        else {
            int num = 0;
            // pattern.charAt(patternStart) >= '0' && pattern.charAt(patternStart) <= '9'
            // isDigit(pattern.charAt(patternStart))
            // 上面两行是等价的
            while (patternStart < pattern.length() && pattern.charAt(patternStart) >= '0' && pattern.charAt(patternStart) <= '9') {
                num = num * 10 + pattern.charAt(patternStart++) - '0';
            }
            return helper(input, pattern, inputStart + num, patternStart);
        }
    }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.y5i6r7jmdied



