//Given a queue of integers, find the maximum number in it.

//Assumption: the queue is not null or empty.

//Example:
//Queue contains 5,8,3,2,7
//Answer: 8.




// My solution
//
class Solution {
	public int maxInQueue(Queue<Integer> queue) {
    int max = Integer.MIN_VALUE;
    for (int num : queue) {
      max = Math.max(max, num);
    }
    return max;
	}
}



