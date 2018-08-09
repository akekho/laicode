//Design an accumulator, which can take a new integer using function “add”, 
//and can return the sum of all taken integers up to now using function “sum”.



class Accumulator {
  private int sum = 0;
  
	public void add(int x) {
    sum += x;
	}
	public int sum() {
    return sum;
	}
}


