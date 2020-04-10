class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MySingleList {
    public ListNode head;

    public MySingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //打印
    public void disPlay() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data +" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含该key节点
    public boolean searchKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //在任意位置index插入，第一个节点为0
    public boolean addIndex(int x,int data) {
        ListNode node = new ListNode(data);
        if (x < 0 || x > size()) {
            System.out.println("下标不合法");
            return false;
        }
        if (x == 0) {
            addFirst(data);
            return true;
        }
        ListNode cur = this.head;
        while (x-1 > 0) {
            cur = cur.next;
            if (cur == null) {
                System.out.println("下标没找到");
                return false;
            }
        }
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public ListNode searchprve(int key) {
        ListNode prve = this.head;
        while (prve.next != null) {
            if (prve.next.data == key) {
                return prve;
            }
        }
        return null;
    }
    //删除第一次值为key的节点
    public void removeKey(int key) {
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找前驱
        ListNode prve = searchprve(key);
        if (prve == null) {
            System.out.println("木有找到该值");
        }
        prve.next = prve.next.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key ) {
            this.head = this.head.next;
        }
    }

    //清除
    public void clear() {
        ListNode cur = this.head.next;
        while (cur.next != null) {
            this.head.next = cur.next;
        }
        this.head = null;
    }

    //反转单链表
    public ListNode reverseList() {
        ListNode cur = this.head;
        ListNode prev = null;
        ListNode newHead = null;
        while (cur != null) {
            ListNode curNest = cur.next;
            if (curNest == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNest;
        }
        return newHead;
    }

    //以x为分界线小于x放前面，大的在后面，并且不能改变链表顺序
    public ListNode partition(int x) {
        if (this.head == null || this.head.next == null) {
            return this.head;
        }
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;

        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                if (bs == null) {
                    bs = cur;
                    be = bs;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = as;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
        }
        if (bs == null) {
            return as;
        }
        be.next = as;
        if (as != null) {
            ae.next = null;
        }
        return bs;
    }

    //删除重复节点重复节点不保留
    public ListNode deleteDuplication() {
        if (this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        ListNode newhead = new ListNode(-1);
        ListNode tmp = newhead;
        while (cur != null) {
            //重复节点
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newhead.next;
    }

    //输入两个链表，找出它们的第一个公共结点
    public boolean chkPalindrome() {
        if (this.head == null) {
            return false;
        }
        if (this.head.next == null) {
            return true;
        }
        //找出中间节点
        ListNode slow = this.head;
        ListNode fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //反转
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //fast/slow向前 head往后走
        while (slow != this.head) {
            if (slow.data != this.head.data) {
                return false;
            }
            if (this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }


    //判断是否有环
    public boolean hasCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return false;
        }
        return true;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast != null || fast.next != null) {
            return  null;
        }
        slow = this.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //




}
