//Merge K sorted lists into one big sorted list in ascending order.

//Assumptions
//ListOfLists is not null, and none of the lists is null.




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
    public ListNode merge(List<ListNode> listOfLists) {
        List<ListNode> result = new ArrayList<>();
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new myComparator());
        for (ListNode node : listOfLists) {
            pq.offer(node);
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }
        return dummyHead.next;
    }

    public class myComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.value - o2.value;
        }
    }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.yc15ki3a2yu5



