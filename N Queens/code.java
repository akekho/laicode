//Get all valid ways of putting N Queens on an N * N chessboard so that no two Queens threaten each other.

//Assumptions
//N > 0

//Return
//A list of ways of putting the N Queens
//Each way is represented by a list of the Queen's y index for x indices of 0 to (N - 1)

//Example
//N = 4, there are two ways of putting 4 queens:
//[1, 3, 0, 2] --> the Queen on the first row is at y index 1, 
//the Queen on the second row is at y index 3, 
//the Queen on the third row is at y index 0 and the Queen on the fourth row is at y index 2.
//
//[2, 0, 3, 1] --> the Queen on the first row is at y index 2, 
//the Queen on the second row is at y index 0, 
//the Queen on the third row is at y index 3 and the Queen on the fourth row is at y index 1.




// My solution
//
public class Solution {
  public List<List<Integer>> nqueens(int n) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    DFS(result, res, n);
    return result;
  }
  
  private void DFS(List<List<Integer>> result, List<Integer> res, int n) {
    if (res.size() == n) {
      result.add(new ArrayList<Integer>(res));
      return;
    }
    
    for (int i = 0; i < n; i++) {
      if (valid(res, i)) {
        res.add(i);
        DFS(result, res, n);
        res.remove(res.size() - 1);
      }
    }
  }
  
  private boolean valid(List<Integer> res, int col) {
    for (int i = 0; i < res.size(); i++) {
      if (res.get(i) == col || Math.abs(res.get(i) - col) == res.size() - i) {
        return false;
      }
    }
    return true;
  }
}  




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.80ulkxvqdpe2



