//Traverse an N N 2D array in spiral order clock-wise starting from the top left corner. 
//Return the list of traversal sequence.

//Assumptions
//
//The 2D array is not null and has size of N N where N >= 0

//Examples
//
//  { {1,  2,  3},
//    {4,  5,  6},
//    {7,  8,  9} }
//the traversal sequence is [1, 2, 3, 6, 9, 8, 7, 4, 5]



// My solution
//
public class Solution {
    public List<Integer> spiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }
        DFS(result, matrix, 0, matrix.length);
        return result;
    }

    private void DFS(List<Integer> result, int[][] matrix, int offset, int size) {
        if (size <= 1) {
            if (size == 1) {
                result.add(matrix[offset][offset]);
            }
            return;
        }

        for (int i = 0; i < size; i++) {
            result.add(matrix[offset][i + offset]);
        }
        for (int i = 1; i < size - 1; i++) {
            result.add(matrix[offset + i][offset + size - 1]);
        }
        for (int i = size - 1; i >= 0; i--) {
            result.add(matrix[offset + size - 1][i + offset]);
        }
        for (int i = size - 2; i >= 1; i--) {
            result.add(matrix[i + offset][offset]);
        }

        DFS(result, matrix, offset + 1, size - 2);
    }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.wokzl3kwdlb



