/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = middle(head);
        Node right = mid.next;
        mid.next = null;

        Node left = segregate(head);
        right = segregate(right);

        return merge(left, right);
    }
    
    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public static Node merge(Node left, Node right){
        Node dummy = new Node(-1);
        Node current = dummy;
        Node p1 = left;
        Node p2 = right;
        while(p1 != null && p2 != null){
            if(p1.data <= p2.data){
                current.next = p1;
                p1 = p1.next;
            }
            else{
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        if(p1 != null){
            current.next = p1;
        }
        else{
            current.next = p2;
        }
        return dummy.next;
    }

}