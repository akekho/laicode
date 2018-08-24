//Given a list of integers representing the lengths of urls, 
//find the 95 percentile of all lengths (95% of the urls have lengths <= returned length).

//Assumptions
//
//The maximum length of valid url is 4096
//The list is not null and is not empty and does not contain null

//Examples
//
//[1, 2, 3, ..., 95, 96, 97, 98, 99, 100], 95 percentile of all lengths is 95.




// My solution
//
public class Solution {
  public int percentile95(List<Integer> lengths) {
    int[] bucket = new int[4097];
    for (Integer length : lengths) {
      bucket[length]++;
    }
    
    double total_so_far = 0;
    int percent = 0;
    while (percent < 4097) {
      total_so_far += bucket[percent];
      if (total_so_far >= 0.95 * lengths.size()) {
        break;
      }
      percent++;
    }
    return percent;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.16lzzivt015c



