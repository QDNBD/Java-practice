//二叉搜索树




public class TestBinaryTree {

    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    //插入
    public boolean insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return true;
        }
        Node parent = null;
        Node cur = root;

        while (cur != null){
            if (cur.data == key ){
                return false;
            }else if(cur.data < key){
                parent = cur;
                cur = cur.right;
            }else  {
                parent = cur;
                cur = cur.left;
            }
        }
        if (key < parent.data) {
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }

    //查找key
    public Node search(int key) {
        if (root == null){
            return null;
        }
        Node cur = root;
        while (cur != null){
            if (cur.data < key ){
                cur = cur.right;
            }else if(cur.data > key){
                cur = cur.left;
            }else if (cur.data == key) {
                return cur;
            }
        }
        return null;

    }

    //中序遍历
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }

    //前序遍历
    public void preOrder(Node root) {
       if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    //删除关键字为key节点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.data == key) {
                //找到了要删除的节点
                removeNode(parent,cur);
                return;
            }else if (cur.data < key){
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }

    }

    public void removeNode(Node parent,Node cur) {

        if (cur.left == null) {
            if (cur == root){
                root = cur.right;
            }else if (cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }

        }else if (cur.right == null) {
            if (cur == root){
                root = cur.left;
            }else if (cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left ;
            }
        }else {
            Node targetParent = cur;//要删除的节点的父亲节点
            //右边找最小值
            Node target = cur.right;
            while (target != null) {
                 targetParent = target;
                 target = target.left;
            }
            cur.data = target.data;
            if (target == targetParent.left) {
                targetParent.left = target.right;
            } else {
                targetParent.right = target.right; 
            }
        }
    }


}
