//Reverse a singly-linked list.

//Examples
//
//L = null, return null
//L = 1 -> null, return 1 -> null
//L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null



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

// Iterative solution
//
public class Solution {
  public ListNode reverse(ListNode head) {
    ListNode prev = null;
    
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
  
    return prev;
  }
}



// Recursive solution
//
  public ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
        
    ListNode newHead = reverse(head.next);        
    head.next.next = head;
    head.next = null;
    
    return newHead; 
  }
  
  
  

// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.44h0jai6bypx

