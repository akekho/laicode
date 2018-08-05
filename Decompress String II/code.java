//Given a string in compressed form, decompress it to the original string. 
//The adjacent repeated characters in the original string are compressed to 
//have the character followed by the number of repeated occurrences.

//Assumptions
//
//The string is not null
//
//The characters used in the original string are guaranteed to be ‘a’ - ‘z’
//
//There are no adjacent repeated characters with length > 9

//Examples
//
//“a1c0b2c4” → “abbcccc”




// My solution
//
// use StringBuilder
//
public class Solution {
    public String decompress(String input) {
        if (input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            for (int j = 0; j < getNumber(input.charAt(i + 1)); j++) {
                sb.append(input.charAt(i));
            }
        }

        return new String(sb);
    }

    private int getNumber(char digit) {
        return digit - '0';
    }
}







// not using any String/StringBuilder utility
// and using char array to do it "in place"
//
public class Solution {
    public String decompress(String input) {
        if (input.isEmpty()) {
            return input;
        }

        char[] charArray = input.toCharArray();

        return decodeLong(decodeShort(charArray));
    }

    private String decodeLong(String input) {
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
    private String decodeShort(char[] charArray) {
        int end = 0;

        for (int i = 0; i < charArray.length; i += 2) {
            int digit = getNumber(charArray[i + 1]);

            if (digit >= 0 && digit <= 2) {
                for (int j = 0; j < digit; j++) {
                    charArray[end++] = charArray[i];
                }
            }
            else {
                charArray[end++] = charArray[i];
                charArray[end++] = charArray[i + 1];
            }
        }

        return new String(charArray, 0, end);
    }

    private int getNumber(char digit) {
        return digit - '0';
    }
}





// another version
//
public class Solution {
    public String decompress(String input) {
        if (input.isEmpty()) {
            return input;
        }

        char[] charArray = input.toCharArray();

        return decodeLong(charArray, decodeShort(charArray));
    }

    private int decodeShort(char[] charArray) {
        int end = 0;

        for (int i = 0; i < charArray.length; i += 2) {
            int digit = getNumber(charArray[i + 1]);

            if (digit >= 0 && digit <= 2) {
                for (int j = 0; j < digit; j++) {
                    charArray[end++] = charArray[i];
                }
            }
            else {
                charArray[end++] = charArray[i];
                charArray[end++] = charArray[i + 1];
            }
        }

        return end;
    }

    private String decodeLong(char[] charArray, int length) {
        int newLength = length;

        for (int i = 0; i < length; i++) {
            int digit = getNumber(charArray[i]);
            if (digit > 2 && digit <= 9) {
                newLength += digit - 2;
            }
        }

        char[] result = new char[newLength];
        int end = newLength - 1;

        for (int i = length - 1; i >= 0; i--) {
            int digit = getNumber(charArray[i]);
            if (digit > 2 && digit <= 9) {
                i--;
                for (int j = 0; j < digit; j++) {
                    result[end--] = charArray[i];
                }
            }
            else {
                result[end--] = charArray[i];
            }
        }

        return new String(result);
    }

    private int getNumber(char digit) {
        return digit - '0';
    }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.1nbrfxx5wzw9



