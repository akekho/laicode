//Given a rope with positive integer-length n, 
//how to cut the rope into m integer-length parts with length p[0], p[1], ...,p[m-1], 
//in order to get the maximal product of p[0]p[1] ... p[m-1]? 
//m is determined by you and must be greater than 0 (at least one cut must be made). 
//Return the max product you can have.

//Assumptions
//n >= 2

//Examples
//n = 12, the max product is 3 3 3 3 = 81(cut the rope into 4 pieces with length of each is 3).




// My solution
//

// DP
public class Solution {
    public int maxProduct(int length) {
        int[] M = new int[length + 1];
        M[0] = 0;
        M[1] = 0;

        for (int i = 2; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                int best = Math.max(j, M[j]);
                M[i] = Math.max(M[i], best * (i - j));
            }
        }
        return M[length];
    }
}



// recursion
public class Solution {
    public int maxProduct(int length) {
        if (length <= 1) {
            return 0;
        }

        int result = 0;
        for (int i = 1; i < length; i++) {
            int best = Math.max(i, maxProduct(i));
            result = Math.max(result, best * (length - i));
        }

        return result;
    }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.ug2l8q524wv9



