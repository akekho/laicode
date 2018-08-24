//Given the following definition of “Tesla”, and an integer n (n > 0). 
//Make an array of n Tesla cars whose number of wheels is 4 and who “VIN” numbers are from 0 to n-1.



// My solution
//
class Tesla {
	int numOfWheels;
	int vin;
	public Tesla(int n, int v) {
		numOfWheels = n;
		vin = v;
	}
}

class Accumulator {
	public Tesla[] make(int n) {
    Tesla[] tesla = new Tesla[n];
    for (int i = 0; i < tesla.length; i++) {
      tesla[i] = new Tesla(4, i);
    }
    return tesla;
	}
}



