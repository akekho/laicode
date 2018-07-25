//Find the K smallest numbers in an unsorted integer array A. The returned numbers should be in ascending order.

//Assumptions
//
//A is not null
//K is >= 0 and smaller than or equal to size of A
//Return an array with size K containing the K smallest numbers in ascending order

//Examples
//
//A = {3, 4, 1, 2, 5}, K = 3, the 3 smallest numbers are {1, 2, 3}



// My solution
//

public class Solution {
  public int[] kSmallest(int[] array, int k) {
    if (k == 0) {
      return new int[0];
    }
    
    int[] result = new int[k];
    if (array == null || array.length == 0) {
      return result;
    }
    
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(k, Collections.reverseOrder());
    
    for (int i = 0; i < array.length; i++) {
      if (maxheap.size() < k) {
        maxheap.offer(array[i]);
      }
      else {
        if (maxheap.peek() > array[i]) {
          maxheap.poll();
          maxheap.offer(array[i]);
        }
      }
    }
    
    for (int j = k - 1; j >= 0; j--) {
      result[j] = maxheap.poll();
    }
    
    return result;        
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.5y1gu9kvqg7q


