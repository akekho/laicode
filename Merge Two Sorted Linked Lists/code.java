//Merge two sorted lists into one large sorted list.

//Examples
//
//L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
//L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
//L1 = null, L2 = null, merge L1 and L2 to null



// My solution
//

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  
  public ListNode merge(ListNode one, ListNode two) {
    ListNode head = new ListNode(0);
    ListNode dummy = head;
    if (one == null) {
      dummy.next = two;
      return head.next;
    }
    else if (two == null) {
      dummy.next = one;
      return head.next;      
    }
    
    ListNode nodeOne = one;
    ListNode nodeTwo = two;
    
    while (nodeOne != null && nodeTwo != null) {
      if (nodeOne.value < nodeTwo.value) {
        dummy.next = nodeOne;
        nodeOne = nodeOne.next;
      }
      else {
        dummy.next = nodeTwo;
        nodeTwo = nodeTwo.next;            
      }
      dummy = dummy.next;          
    }
    
    while (nodeOne != null) {
      dummy.next = nodeOne;
      nodeOne = nodeOne.next;      
      dummy = dummy.next;      
    }
    while (nodeTwo != null) {
      dummy.next = nodeTwo;
      nodeTwo = nodeTwo.next;      
      dummy = dummy.next;      
    }  
    
    return head.next;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.yrk5azeji7p5


