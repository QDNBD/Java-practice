
    class MyLinkedList {

        private class ListNode {
            public int val;
            public ListNode next;
            public ListNode(int val) {
                this.val = val;
            }
        }

        private ListNode head;
        public int size;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            this.head = null;
            size = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if(index < 0|| index > size) {
                return -1;
            }
            ListNode cur = this.head;
            for(int i = 0; i < index ;i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            ListNode node = new ListNode(val);
            if(this.head == null) {
                this.head = node;
            }else {
                node.next = this.head;
                this.head = node;
            }
            size++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            ListNode node = new ListNode(val);
            ListNode cur = this.head;
            //0、判断是否是第一次插入
            if(this.head == null) {
                this.head = node;
            }else {
                //1、找尾巴
                while (cur.next != null) {
                    cur = cur.next;
                }
                //2、进行插入
                cur.next = node;
            }
            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if(index > size) {
                return ;
            }
            if(index <= 0) {
                addAtHead(val);
            }

            ListNode cur = this.head;
            for (int i = 0; index < i;i++) {
                cur = cur.next;
            }
            ListNode node = new ListNode(val);
            node.next = cur.next;
            cur.next = node;
            size++;

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if(index < 0 || index > size) {
                return;
            }
            if(index == 0) {
                this.head = head.next;
                return;
            }
            ListNode cur = this.head;
            for(int i = 0; i < index-1; i++) {
                cur = cur.next;
            }
            ListNode reNode = cur.next;
            if (cur.next == null) {
                this.head = null;
                return;
            }
            cur.next = reNode.next;
            reNode.next = null;
            size--;
        }

        public void display() {
            ListNode cur = this.head;
            while (cur != null) {
                System.out.print(cur.val +" ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

