/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node head;
    Node per;

    public Node treeToDoublyList(Node root) {
        if(root == null) {
            return null;
        }
        dfs(root);
        head.left = per;
        per.right = head;
        return head;
    }
    
    private void dfs(Node cur) {
        if(cur == null) {
            return;
        }
        dfs(cur.left);
        if(per == null) {
            head = cur;
        }else if(per != null) {
            per.right = cur;
        }
        cur.left = per;
        per = cur;
        dfs(cur.right);
    }
}