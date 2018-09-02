//Write a function that returns a random number within the range of [a, b] with equal probabilities.

//Note: you can use Java’s Random class.



// My solution
//
class Solution {
	public int random(int a, int b) {
    Random rand = new Random();
    return rand.nextInt(b - a + 1) + a;
	}
}



