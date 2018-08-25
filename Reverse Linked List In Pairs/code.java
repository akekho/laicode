//Reverse pairs of elements in a singly-linked list.

//Examples
//
//L = null, after reverse is null
//L = 1 -> null, after reverse is 1 -> null
//L = 1 -> 2 -> null, after reverse is 2 -> 1 -> null
//L = 1 -> 2 -> 3 -> null, after reverse is 2 -> 1 -> 3 -> null



// My solution
//
public class Solution {
    public ListNode reverseInPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode next = curr.next;
        curr.next = reverseInPairs(curr.next.next);
        next.next = curr;
        return next;
    }  
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.a2s3o7hg0n2l



