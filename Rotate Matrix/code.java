//Rotate an N * N matrix clockwise 90 degrees.

//Assumptions
//
//The matrix is not null and N >= 0

//Examples
//
//  { {1,  2,  3}
//    {8,  9,  4},
//    {7,  6,  5} }
//
//after rotation is
//
//  { {7,  8,  1}
//    {6,  9,  2},
//    {5,  4,  3} }





// My solution
//
public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        helper(matrix, 0, matrix.length);
    }

    private void helper(int[][] matrix, int offset, int size) {
        if (size <= 1) {
            return;
        }
        List<Integer> topRow = getTopRow(matrix, offset, size);
        List<Integer> bottomRow = getBottomRow(matrix, offset, size);
        List<Integer> leftCol = getLeftCol(matrix, offset, size);
        List<Integer> rightCol = getRightCol(matrix, offset, size);

        copyTopRow(matrix, topRow, offset, size);
        copyBottomRow(matrix, bottomRow, offset, size);
        copyLeftCol(matrix, leftCol, offset, size);
        copyRightCol(matrix, rightCol, offset, size);
        helper(matrix, offset + 1, size - 2);
    }

    private List<Integer> getTopRow(int[][] matrix, int offset, int size) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(matrix[offset][i + offset]);
        }
        return result;
    }
    private List<Integer> getBottomRow(int[][] matrix, int offset, int size) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(matrix[offset + size - 1][i + offset]);
        }
        return result;
    }
    private List<Integer> getLeftCol(int[][] matrix, int offset, int size) {
        List<Integer> result = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            result.add(matrix[i + offset][offset]);
        }
        return result;
    }
    private List<Integer> getRightCol(int[][] matrix, int offset, int size) {
        List<Integer> result = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            result.add(matrix[offset + i][offset + size - 1]);
        }
        return result;
    }

    private void copyTopRow(int[][] matrix, List<Integer> topRow, int offset, int size) {
        for (int i = 0; i < size; i++) {
            matrix[offset + i][offset + size - 1] = topRow.get(i);
        }
    }
    private void copyRightCol(int[][] matrix, List<Integer> rightCol, int offset, int size) {
        for (int i = 0; i < size; i++) {
            matrix[offset + size - 1][i + offset] = rightCol.get(i);
        }
    }
    private void copyBottomRow(int[][] matrix, List<Integer> bottomRow, int offset, int size) {
        for (int i = 0; i < size; i++) {
            matrix[i + offset][offset] = bottomRow.get(i);
        }
    }
    private void copyLeftCol(int[][] matrix, List<Integer> leftCol, int offset, int size) {
        for (int i = 0; i < size; i++) {
            matrix[offset][i + offset] = leftCol.get(i);
        }
    }
}

  




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.uwkml9ulxi1g



