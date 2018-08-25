//Generate an M  N 2D array in spiral order clock-wise starting from the top left corner, 
//using the numbers of 1, 2, 3, …, M  N in increasing order.

//Assumptions
//M >= 0, N >= 0

//Examples
//M = 3, N = 4, the generated matrix is
//  { {1,  2,  3,  4}
//    {10, 11, 12, 5},
//    {9,  8,  7,  6} }



// My solution 
//
public class Solution {
    public int[][] spiralGenerate(int m, int n) {
        int[][] matrix = new int[m][n];
        if (m == 0 || n == 0) {
            return matrix;
        }

        int endRow = m - 1;
        int endCol = n - 1;
        int startRow = 0;
        int startCol = 0;
        int counter = 1;

        while (startRow < endRow && startCol < endCol) {
            // left to right
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = counter++;
            }
            // top to bottom
            for (int i = startRow + 1; i <= endRow - 1; i++) {
                matrix[i][endCol] = counter++;
            }
            // right to left
            for (int i = endCol; i >= startCol; i--) {
                matrix[endRow][i] = counter++;
            }
            // bottom to top
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                matrix[i][startRow] = counter++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        if (startRow > endRow || startCol > endCol) {
            return matrix;
        }
        // one row left
        if (startRow == endRow) {
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = counter++;
            }
        }
        // one col left
        else {
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = counter++;
            }
        }
        return matrix;
    }
}




// Professional solution 
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.pw48r1i4d47x



