public class MyListQueue {
    static class List {
        public int val;
        public List next;
        public List(int val) {
            this.val = val;
        }
    }

    public List front;
    public List rear;
    public int usedSize;

    public  boolean isEmpty() {
        return this.usedSize == 0;
    }
    //入队
    public void offer(int val) {
        List node = new List(val);
        if (isEmpty()) {
            this.front = node;
            this.rear = front;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        usedSize++;
    }

    //出队
    public int poll() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("队列为空");
        }
        int data = this.rear.val;
        this.rear = this.rear.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("队列为空");
        }
        return this.front.val;
    }
}
