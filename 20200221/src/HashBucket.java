import org.omg.DynamicAny.NameDynAnyPair;

/**
 *
 */

public class HashBucket {

    static class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] array = new Node[8];//存放单链表的头结点
    private int size;//当前数据的个数


    public int getValue(int key) {

        int index = key % array.length;
        //遍历array[index]下标的链表，找到值为key的数据，并且返回        Node cur = array[index];
        Node cur = array[index];
        while (cur.value != key && cur.next!=null) {
            cur = cur.next;
        }
        if(cur.value == key) {
            return cur.value;
        }
        return -1;
    }


    public void put(int key,int value){
        int index =key % array.length;

        for (Node cur = array[index];cur != null;cur = cur.next)  {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
        }

        //头插
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        this.size++;

        if (loadFactor() >= 0.75) {
            resize();
        }
    }


    private double loadFactor() {
        return this.size * 1.0 / array.length;
    }

    public void resize() {
        Node[] newArray = new Node[2*array.length];
        //重新哈希
        Node curNext = null;
        for (int i = 0; i < array.length; i++) {
            for (Node cur = array[i];cur != null;cur = curNext){
                curNext = cur.next;
                int index = cur.key % newArray.length;
                //头插插入到新的链表中
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        array = newArray;
    }
}
