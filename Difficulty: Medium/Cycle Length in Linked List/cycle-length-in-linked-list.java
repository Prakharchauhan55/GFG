class Solution {

    public int lengthOfLoop(Node head) {

        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Cycle detected
                int length = 1;
                Node temp = slow.next;

                while (temp != slow) {
                    temp = temp.next;
                    length++;
                }

                return length;
            }
        }

        // No cycle
        return 0;
    }
}