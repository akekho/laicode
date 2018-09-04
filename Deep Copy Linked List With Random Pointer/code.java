//Each of the nodes in the linked list has another pointer pointing to a random node in the list or null. 
//Make a deep copy of the original list.




// My solution
//
/**
 * class RandomListNode {
 *   public int value;
 *   public RandomListNode next;
 *   public RandomListNode random;
 *   public RandomListNode(int value) {
 *     this.value = value;
 *   }
 * }
 */
public class Solution {
  public RandomListNode copy(RandomListNode head) {
    if (head == null) {
      return null;
    }
    
    Map<RandomListNode, RandomListNode> hashmap = new HashMap<>();
    RandomListNode newHead = new RandomListNode(head.value);
    RandomListNode curr = newHead;
    hashmap.put(head, newHead);
    while (head != null) {
      if (head.next != null) {
        if (!hashmap.containsKey(head.next)) {
          hashmap.put(head.next, new RandomListNode(head.next.value));
        }
        curr.next = hashmap.get(head.next);
      }
      
      if (head.random != null) {
        if (!hashmap.containsKey(head.random)) {
          hashmap.put(head.random, new RandomListNode(head.random.value));
        }
        curr.random = hashmap.get(head.random);
      }
      head = head.next;
      curr = curr.next;
    }
    return newHead;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.j1zzuocyq3f



