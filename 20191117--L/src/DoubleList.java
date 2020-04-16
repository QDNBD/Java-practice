class ListNode {
    public  int data;
    public ListNode prev;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
    }
}

public class DoubleList {
    public ListNode head;
    public ListNode last;//尾巴

    //头插法
    public void AddFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.head.prev = node;
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void AddLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        node.prev = this.last;
        this.last.next = node;
        this.last = node;
    }

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    private ListNode searchTndex(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }
        ListNode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if (index == 0) {
            AddFirst(data);
            return;
        }
        if (index == size()) {
            AddLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = searchTndex(index);
        if (cur == null) {
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }

    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在链表当中
    public boolean countains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次值为key的节点
    public void removeAllkey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    //中间或尾巴
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        if (cur.data == key) {
            if (cur == this.head) {
                this.head = this.head.next;
                this.head.prev = null;
            }else {
                //中间或尾巴
                cur.prev.next = cur.next;
                if (cur.next != null) {
                    cur.next.prev = cur.prev;
                }else {
                    this.last = cur.prev;
                }
            }
        }
        cur = cur.next;
    }

    public void clear() {
        while (this.head != null) {
            ListNode cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.last = null;
    }


}
