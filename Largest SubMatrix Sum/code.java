//Given a matrix that contains integers, find the submatrix with the largest sum.

//Return the sum of the submatrix.

//Assumptions
//
//The given matrix is not null and has size of M * N, where M >= 1 and N >= 1

//Examples
//
//  { {1, -2, -1, 4},
//    {1, -1,  1, 1},
//    {0, -1, -1, 1},
//    {0,  0,  1, 1} }
//the largest submatrix sum is (-1) + 4 + 1 + 1 + (-1) + 1 + 1 + 1 = 7.




// My solution
//
public class Solution {
    public int largest(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int global_max = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            int[] largestSum = new int[col];

            for (int j = i; j < row; j++) {
                compression(largestSum, matrix[j]);
                global_max = Math.max(global_max, largestSum(largestSum));
            }
        }
        return global_max;
    }

    private void compression(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] += b[i];
        }
    }

    private int largestSum(int[] array) {
        int last = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            last = Math.max(last + array[i], array[i]);
            max = Math.max(max, last);
        }
        return max;
    }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.tz3644a6s78n



