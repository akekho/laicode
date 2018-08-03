//Insert a value in a sorted linked list.

//Examples
//
//L = null, insert 1, return 1 -> null
//L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
//L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
//L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null
 


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

// Iterative solution
//
public class Solution {
  public ListNode insert(ListNode head, int value) {
    ListNode newNode = new ListNode(value);
    
    if (head == null || head.value >= newNode.value) {
      newNode.next = head;
      head = newNode;
      return head;
    }
    
    ListNode curr = head;
    
    while (curr.next != null && curr.next.value < value) {
      curr = curr.next;
    }
    
    ListNode next = curr.next;
    curr.next = newNode;
    newNode.next = next;
    return head;
  }
}

// Recursive solution
//
  public ListNode insert(ListNode head, int target) {
    ListNode newNode = new ListNode(target);
    return insertNode(head, newNode);  
  }
  
  private ListNode insertNode(ListNode head, ListNode target) {
    if (head == null) {
      return target;
    }
    
	   if (head.value >= target.value) {
		    target.next = head;
		    return target;
  	 }
	   else {
		    head.next = insertNode(head.next, target);
      return head;
	   }      
  }




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.3c1bfnazb51f



