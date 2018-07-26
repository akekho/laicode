//Given a matrix of size N x M. For each row the elements are sorted in ascending order, 
//and for each column the elements are also sorted in ascending order. Find the Kth smallest number in it.

//Assumptions
//
//the matrix is not null, N > 0 and M > 0
//K > 0 and K <= N * M

//Examples
//
//{ {1,  3,   5,  7},
//  {2,  4,   8,   9},
//  {3,  5, 11, 15},
//  {6,  8, 13, 18} }
//
//the 5th smallest number is 4
//the 8th smallest number is 6



// My solution
//

public class Solution {
  public int kthSmallest(int[][] matrix, int k) {
    int row = matrix.length;
    int column = matrix[0].length;
    boolean[][] visited = new boolean[row][column];

    PriorityQueue<Cell> minheap = new PriorityQueue<>(k, new Comparator<Cell>() {
      @Override
      public int compare(Cell c1, Cell c2) {
        if (c1.val == c2.val) {
          return 0;
        }
        else {
          return c1.val < c2.val ? -1 : 1;
        }
      }
    });
    
    minheap.offer(new Cell(0, 0, matrix[0][0]));
    
    for (int i = 0; i < k - 1; i++) {
      Cell cell = minheap.poll();
      if (cell.row + 1 < row && !visited[cell.row + 1][cell.col]) {
        minheap.offer(new Cell(cell.row + 1, cell.col, matrix[cell.row + 1][cell.col]));
        visited[cell.row + 1][cell.col] = true;
      }
      
      if (cell.col + 1 < column && !visited[cell.row][cell.col + 1]) {
        minheap.offer(new Cell(cell.row, cell.col + 1, matrix[cell.row][cell.col + 1]));
        visited[cell.row][cell.col + 1] = true;        
      }
    }
    
    return minheap.poll().val;
  }
  
  class Cell {
    int row;
    int col;
    int val;
    
    Cell(int row, int col, int val) {
      this.row = row;
      this.col = col;
      this.val = val;
    }
  }
}


// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.5y1gu9kvqg7q


