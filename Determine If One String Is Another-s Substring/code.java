//Determine if a small string is a substring of another large string.

//Return the index of the first occurrence of the small string in the large string.

//Return -1 if the small string is not a substring of the large string.

//Assumptions
//
//Both large and small are not null
//If small is empty string, return 0

//Examples
//
//“ab” is a substring of “bcabc”, return 2
//“bcd” is not a substring of “bcabc”, return -1
//"" is substring of "abc", return 0




// My solution
//

// Naive solution
//
// Time complexity: O(m * n)
// Space complexity: O(1)
  public int strstr(String large, String small) {
    if (small.isEmpty()) {
      return 0;
    }
    
    if (large.length() < small.length()) {
      return -1;
    }
    
    for (int i = 0; i <= large.length() - small.length(); i++) {
      if (equal(large, small, i)) {
        return i;
      }
    }
    
    return -1;
  }
  
  private boolean equal(String large, String small, int i) {
    for (int j = 0; j < small.length(); j++) {
      if (large.charAt(i + j) == small.charAt(j)) {
        continue;
      }
      else {
        return false;
      }
    }
    
    return true;
  }
  




// Rabin-Karp
//
// Time complexity: O(m + n)
// Space complexity: O(1)
public class Solution {
  public int strstr(String large, String small) {
    if (small.isEmpty()) {
      return 0;
    }
    
    if (large.length() < small.length()) {
      return -1;
    }
    
    // We need a large prime as module end
    int largePrime = 101;
    
    // We also need a small prime to calculate the hash value
    // since the char set would be very large, e.g. 1,112,064 for using UTF,
    // we cannot use that number
    int prime = 31;
    int seed = 1;
    // hash value is calculated using the small prime 
    // and taken the module operation on large prime
    // hash = ( s0*smallP^k + s1*smallP^(k-1) + ... + sk*smallP^0 ) % largeP
    
    int targetHash = small.charAt(0) % largePrime;
    
    for (int i = 1; i < small.length(); i++) {
      seed = moduleHash(seed, 0, prime, largePrime);
      targetHash = moduleHash(targetHash, small.charAt(i), prime, largePrime);
    }
    
    int hash = 0;
    
    for (int i = 0; i < small.length(); i++) {
      hash = moduleHash(hash, large.charAt(i), prime, largePrime);
    }
    if (hash == targetHash && equals(large, 0, small)) {
      return 0;
    }
    
    for (int i = 1; i <= large.length() - small.length(); i++) {
      // we need to make sure the module number is non-negative
      hash = nonNegative(hash - seed * large.charAt(i - 1) % largePrime, largePrime);
      hash = moduleHash(hash, large.charAt(i + small.length() - 1), prime, largePrime);
      // If the hash matches, it does not mean we really find a substring match
      // Because there is collision, 
      // we need to check if the substring really matches the small string
      // On average, this will not increase the time complexity,
      // the probability of collision is O(1) so we still have O(N + M)
      
      if (hash == targetHash && equals(large, i, small)) {
        return i;
      }
    }    
    
    return -1;
  }
  
  private boolean equals(String large, int i, String small) {
    for (int j = 0; j < small.length(); j++) {
      if (large.charAt(i + j) != small.charAt(j)) {
        return false;
      }
    }    
    return true;
  }
  
  private int moduleHash(int hash, int addition, int prime, int largePrime) {
    return (hash * prime % largePrime + addition) % largePrime;
  }
  
  private int nonNegative(int hash, int largePrime) {
    if (hash < 0) {
      hash += largePrime;      
    }
    return hash;
  }
}

  
  
// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.hlcsrjrmaqg



