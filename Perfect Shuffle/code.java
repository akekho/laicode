//Given an array of integers (without any duplicates), 
//shuffle the array such that all permutations are equally likely to be generated.

//Assumptions
//
//The given array is not null




// My solution
//
public class Solution {
  public void shuffle(int[] array) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      int num = random.nextInt(array.length - i) + i;
      swap(array, num, i);
    }
  }
  
  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.ab6oezpm35nw



