//Given a matrix that contains only 1s and 0s, 
//find the largest cross which contains only 1s, 
//with the same arm lengths and the four arms joining at the central point.
//Return the arm length of the largest cross.

//Assumptions
//
//The given matrix is not null, has size of N * M, N >= 0 and M >= 0.

//Examples
//
//  { {0, 0, 0, 0},
//    {1, 1, 1, 1},
//    {0, 1, 1, 1},
//    {1, 0, 1, 1} }
//the largest cross of 1s has arm length 2.




// My solution
//
public class Solution {
    public int largest(int[][] matrix) {
        int[][] dp1 = leftToRight(matrix);
        int[][] dp2 = rightToLeft(matrix);
        int[][] dp3 = topToBottom(matrix);
        int[][] dp4 = bottomToTop(matrix);
        int max = 0;
        int consecutive = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                consecutive = getMin(dp1[i][j], dp2[i][j], dp3[i][j], dp4[i][j]);
                max = Math.max(max, consecutive);
            }
        }
        return max;
    }

    private int[][] leftToRight(int[][] array) {
        int[][] dp = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == 0) {
                    dp[i][j] = array[i][j];
                }
                else {
                    dp[i][j] = array[i][j] == 0 ? 0 : dp[i][j - 1] + 1;
                }
            }
        }
        return dp;
    }

    private int[][] rightToLeft(int[][] array) {
        int[][] dp = new int[array.length][array[0].length];

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[0].length - 1; j >= 0; j--) {
                if (j == array[0].length - 1) {
                    dp[i][j] = array[i][j];
                }
                else {
                    dp[i][j] = array[i][j] == 0 ? 0 : dp[i][j + 1] + 1;
                }
            }
        }
        return dp;
    }

    private int[][] topToBottom(int[][] array) {
        int[][] dp = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = array[i][j];
                }
                else {
                    dp[i][j] = array[i][j] == 0 ? 0 : dp[i - 1][j] + 1;
                }
            }
        }
        return dp;
    }

    private int[][] bottomToTop(int[][] array) {
        int[][] dp = new int[array.length][array[0].length];

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[0].length - 1; j >= 0; j--) {
                if (i == array.length - 1) {
                    dp[i][j] = array[i][j];
                }
                else {
                    dp[i][j] = array[i][j] == 0 ? 0 : dp[i + 1][j] + 1;
                }
            }
        }
        return dp;
    }

    private int getMin(int a, int b, int c, int d) {
        int temp = Math.min(a, b);
        temp = Math.min(temp, c);
        return Math.min(temp, d);
    }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.24pau7m7zlua



