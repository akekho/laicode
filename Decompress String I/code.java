//Given a string in compressed form, decompress it to the original string. 
//The adjacent repeated characters in the original string are compressed to 
//have the character followed by the number of repeated occurrences. 
//If the character does not have any adjacent repeated occurrences, it is not compressed.

//Assumptions
//
//The string is not null
//
//The characters used in the original string are guaranteed to be ‘a’ - ‘z’
//
//There are no adjacent repeated characters with length > 9

//Examples
//
//“acb2c4” → “acbbcccc”



// My solution
//
// not using any String/StringBuilder utility
// and using char array to do it "in place"
//
public class Solution {
    public String decompress(String input) {
        if (input.isEmpty()) {
            return input;
        }

        char[] charArray = input.toCharArray();
        int getLonger = 0;

        for (int i = 0; i < charArray.length; i++) {
            int digit = getNumber(charArray[i]);
            if (Character.isDigit(charArray[i]) && digit > 2) {
                getLonger += digit - 2;
            }
        }

        char[] result = new char[charArray.length + getLonger];
        int index = result.length - 1;

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (Character.isDigit(charArray[i])) {
                int digit = getNumber(charArray[i]);
                for (int j = 0; j < digit; j++) {
                    result[index--] = charArray[i - 1];
                }
                i--;
            }
            else {
                result[index--] = charArray[i];
            }
        }

        return new String(result);
    }

    private int getNumber(char digit) {
        return digit - '0';
    }
}




// use StringBuilder
//
public class Solution {  
    public String decompress(String input) {
        if (input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                for (int j = 0; j <= getNumber(input.charAt(i)) - 2; j++) {
                    sb.append(input.charAt(i - 1));
                }
            }
            else {
                sb.append(input.charAt(i));
            }
        }

        return new String(sb);
    }

    private int getNumber(char digit) {
        return digit - '0';
    }
}




