//Find all numbers that appear in both of two sorted arrays (the two arrays are all sorted in ascending order).

//Assumptions
//
//In each of the two sorted arrays, there could be duplicate numbers.
//Both two arrays are not null.

//Examples
//
//A = {1, 1, 2, 2, 3}, B = {1, 1, 2, 5, 6}, common numbers are [1, 1, 2]



// My solution
//

public class Solution {
  public List<Integer> common(List<Integer> A, List<Integer> B) {
    List<Integer> result = new ArrayList<>();
    
    int pointA = 0;
    int pointB = 0;
    
    while (pointA < A.size() && pointB < B.size()) {
      if (A.get(pointA) < B.get(pointB)) {
        pointA++;
      }
      else if (A.get(pointA) > B.get(pointB)) {
        pointB++;
      }
      else {
        result.add(A.get(pointA));
        pointA++;
        pointB++;
      }
    }
    
    return result;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.uav128cpcizh


