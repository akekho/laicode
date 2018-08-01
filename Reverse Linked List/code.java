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
// Time complexity: O(n)
// Space complexity: O(1)
public class Solution {
  public ListNode reverse(ListNode head) {
    ListNode prev = null;
    
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }  
    // 跳出while循环时，head走到末尾的null，此时reverse list的head是prev
    return prev;
  }
}



// Recursive solution
//
// Time complexity: O(n)
// Space complexity: O(n)
  public ListNode reverse(ListNode head) {
    // head == null处理的时刚传进来的head是否为null，处理的是corner case
    // head.next == null处理的是recursion的base case
    // 二者虽然写在一起，但意义完全不同    
    if (head == null || head.next == null) {
        return head;
    }
        
    // 每次用相同的逻辑解决小一号的问题
    // sub-problem：去掉head的sublist
    // recursion rule: 每次将下一个点的指向反向并清空next指针防止形成环
    // base case：最后一个点
    ListNode newHead = reverse(head.next);        
    head.next.next = head;
    head.next = null;
    
    return newHead; 
  }
  
  
  

// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.44h0jai6bypx


