/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return head;
        }
        Node cur = head;
        while(cur != null) {
            Node cloneNode = new Node(cur.val);
            cloneNode.next = cur.next;
            cur.next = cloneNode;
            cur = cur.next.next;
        }
        cur = head;
        while(cur != null) {
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        cur = head;
        Node newHead = head.next;
        Node cloneNode = head.next;
        while(cur != null) {
            cur.next = cur.next.next;
            cur = cur.next;
            if(cloneNode.next != null) {
                cloneNode.next = cloneNode.next.next;
                cloneNode = cloneNode.next;
            }
        }
        return newHead;
    }
}