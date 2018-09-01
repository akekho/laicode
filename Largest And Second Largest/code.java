//Use the least number of comparisons to get the largest and 2nd largest number in the given integer array. 
//Return the largest number and 2nd largest number.

//Assumptions
//
//The given array is not null and has length of at least 2

//Examples
//{2, 1, 5, 4, 3}, the largest number is 5 and 2nd largest number is 4.




// My solution
//
public class Solution {
  public int[] largestAndSecond(int[] array) {
    Element[] helper = convert(array);
    int largerLength = array.length;
    while (largerLength > 1) {
      compareAndSwap(helper, largerLength);
      largerLength = (largerLength + 1) / 2;
    }
    return new int[] {helper[0].value, largest(helper[0].compared)};    
  }
  
  private Element[] convert(int[] array) {
    Element[] helper = new Element[array.length];
    for (int i = 0; i < array.length; i++) {
      helper[i] = new Element(array[i]);
    }
    return helper;
  }
  
  private void compareAndSwap(Element[] helper, int largerLength) {
    for (int i = 0; i < largerLength / 2; i++) {
      if (helper[i].value < helper[largerLength - 1 - i].value) {
        swap(helper, i, largerLength - 1 - i);
      }
      helper[i].compared.add(helper[largerLength - 1 - i].value);
    }
  }
  
  private void swap(Element[] array, int a, int b) {
    Element temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
  
  private int largest(List<Integer> list) {
    int max = list.get(0);
    for (int num : list) {
      max = Math.max(max, num);
    }
    return max;
  }
}

class Element {
  int value;
  List<Integer> compared;
  
  Element(int value) {
    this.value = value;
    this.compared = new ArrayList<>();
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.ojm29inwficr



