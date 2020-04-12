import java.util.List;

//节点类
class ListNode {
    public int date;
    public ListNode next;
    public ListNode (int date) {
        this.date = date;
        this.next = null;
    }
}
class SingleList {
    public ListNode hade;//标志头
    public SingleList() {
        this.hade = null;
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.hade == null) {
            this.hade = node;
            return;
        }
        node.next = this.hade;
        this.hade = node;
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.hade;
        if (this.hade == null) {
            this.hade = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
        }
        cur.next = node;
    }

    public int getListLength() {
        int count = 0;
        ListNode cur = this.hade;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        if (index < 0 || index > getListLength()) {
            return false;
        }
        ListNode cur = this.hade;
        if(index == 0) {
            addFirst(data);
            return true;
        }
        int count = 0;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
        return false;
    }


    public void display() {
        if (this.hade == null) {
            return;
        }
        ListNode cur = this.hade;
        while (cur != null) {
            System.out.println(cur.date + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public ListNode searchPrve(int key) {
        ListNode cur = this.hade;
        while (cur.next != null) {
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        //删除的节点如果是头结点
        if (this.hade.date == key ) {
            this.hade = this.hade.next;
            return;
        }
        //找前驱，找不到返回null
        ListNode prve = searchPrve(key);


    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.hade;
        ListNode prev = this.hade.next;
        while (prev != null) {
            if (cur.next.date == key) {
                cur.next = prev.next;
                prev =prev.next;
            } else {
                cur = prev;
                prev = prev.next;
            }
        }
    }


    public void clear() {
        this.hade = null;
    }

}
