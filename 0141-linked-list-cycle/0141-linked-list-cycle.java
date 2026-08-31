
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode prevNode = head;
        ListNode currNode = prevNode.next;
        while (currNode.next != null) {
            ListNode temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
            if (currNode == head) {
                return true;
            }
        }

        return false;
    }

}