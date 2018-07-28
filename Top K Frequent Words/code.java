//Given a composition with different kinds of words, return a list of the top K most frequent words in the composition.

//Assumptions
//
//the composition is not null and is not guaranteed to be sorted
//K >= 1 and K could be larger than the number of distinct words in the composition, 
//in this case, just return all the distinct words

//Return
//
//a list of words ordered from most frequent one to least frequent one (the list could be of size K or smaller than K)

//Examples
//
//Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 2 frequent words are [“b”, “c”]
//Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 4 frequent words are [“b”, “c”, "a", "d"]
//Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 5 frequent words are [“b”, “c”, "a", "d"]



// My solution
//


public class Solution {
  public String[] topKFrequent(String[] combo, int k) {
    Map<String, Integer> hashmap = new HashMap<>();
    
    for (String string : combo) {
      if (hashmap.containsKey(string)) {
        hashmap.put(string, hashmap.get(string) + 1);
      }
      else {
        hashmap.put(string, 1);
      }
    }
    
    PriorityQueue<Map.Entry<String, Integer>> minheap 
      = new PriorityQueue<>(k, 
                            new Comparator<Map.Entry<String, Integer>>() {
                              @Override
                              public int compare (Map.Entry<String, Integer> entry1, 
                                                  Map.Entry<String, Integer> entry2) {
                                if (entry1.getValue() == entry2.getValue()) {
                                  return -entry1.getKey().compareTo(entry2.getKey());
                                }
                                
                                return entry1.getValue() < entry2.getValue() ? -1 : 1;
                              }
                            });
    
    for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
      minheap.offer(entry);
      if (minheap.size() > k) {
        minheap.poll();
      }
    }
    
    String[] result = new String[minheap.size()];
    getTopK(result, minheap);
    
    return result;
  }
  
  private void getTopK(String[] result, PriorityQueue<Map.Entry<String, Integer>> minheap) {
    for (int i = result.length - 1; i >= 0; i--) {
      result[i] = minheap.poll().getKey();
    }
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.9zp811o3wj56


