//Given a linked list and a target value T, 
//partition it such that all nodes less than T are listed before the nodes larger than or equal to target value T. 
//The original relative order of the nodes in each of the two partitions should be preserved.

//Examples
//
//L = 2 -> 4 -> 3 -> 5 -> 1 -> null, T = 3, is partitioned to 2 -> 1 -> 4 -> 3 -> 5 -> null



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
  public ListNode partition(ListNode head, int target) {
    if (head == null || head.next == null) {
      return head;
    }
    
    ListNode curr = head;
    ListNode dummySmall = new ListNode(0);
    ListNode small = dummySmall;
    
    ListNode dummyLarge = new ListNode(0);
    ListNode large = dummyLarge;
    
    while (curr != null) {
      if (curr.value < target) {
        small.next = new ListNode(curr.value);
        small = small.next;
      }
      else {
        large.next = new ListNode(curr.value);
        large = large.next;
      }
      curr = curr.next;
    }
    
    small.next = dummyLarge.next;
    large.next = null;
    
    return dummySmall.next;
  }  
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.i22jhq1twuv8


