//Reorder the given singly-linked list N1 -> N2 -> N3 -> N4 -> … -> Nn -> null 
//to be N1- > Nn -> N2 -> Nn-1 -> N3 -> Nn-2 -> … -> null

//Examples
//
//L = null, is reordered to null
//L = 1 -> null, is reordered to 1 -> null
//L = 1 -> 2 -> 3 -> 4 -> null, is reordered to 1 -> 4 -> 2 -> 3 -> null
//L = 1 -> 2 -> 3 -> null, is reordred to 1 -> 3 -> 2 -> null



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
  public ListNode reorder(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    
    ListNode middle = middleNode(head);
    ListNode firstHalf = head;    
    ListNode secondHalf = middle.next;
    middle.next = null;    
    
    return merge(firstHalf, reverse(secondHalf));
  }
  
  private ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }  
  
  
  private ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode newHead = reverse(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;
  }
  
  private ListNode merge(ListNode one, ListNode two) {
    ListNode head = new ListNode(0);
    ListNode dummy = head;

    while (one != null && two != null) {
      dummy.next = one;
      one = one.next;
      dummy = dummy.next;
      dummy.next = two;
      two = two.next;
      dummy = dummy.next;
    }
    
    if (one != null) {
      dummy.next = one;     
    }
    else {
      dummy.next = two;     
    }  
    
    return head.next;
  }  
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.7ti30cg046ia


