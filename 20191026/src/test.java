import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,3);
        myArrayList.add(1,34);
        myArrayList.add(2,344);
        myArrayList.add(2,3444);
        myArrayList.add(2,34444);
        myArrayList.display();
        System.out.println(myArrayList.contains(30));
        System.out.println(myArrayList.search(30));
        System.out.println(myArrayList.getPos(3));
        myArrayList.setPos(3,5);
        System.out.println("#########################");
        myArrayList.remove(3);
        myArrayList.display();
        System.out.println("#########################");
        System.out.println(myArrayList.size());
        System.out.println("#########################");
        myArrayList.clear();
        System.out.println("#########################");
        myArrayList.display();
    }
}

class MyArrayList {
    private int[] elem;
    private int usedSize;
    private final int CAPACLTY = 10;

    public MyArrayList() {
        this.elem = new int[CAPACLTY];
        this.usedSize = 0;
    }
//打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.println(this.elem[i] + " ");
        }
    }
    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }
// 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        if (pos < 0||pos > usedSize) {
            System.out.println("新增错误");
            return;
        } else {
            for (int i = this.usedSize - 1; i >= pos ; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }
// 判定是否包含某个元素
        public boolean contains(int toFind) {
            for (int i = 0; i < this.elem.length ; i++) {
                if(elem[i] == toFind){
                    return  true;
                }
            }
            return false;
        }
// 查找某个元素对应的位置
        public int search(int toFind) {
            if(contains(toFind)) {
                for (int i = 0; i < this.elem.length ; i++) {
                    if(elem[i] == toFind){
                        return  i+1;
                    }
                }
            }
            return -1;
        }
// 获取 pos 位置的元素
        public int getPos(int pos) {
            if(pos < usedSize && pos >= 0) {
                return this.elem[pos];
            }
            return -1;
        }
// 给 pos 位置的元素设为 value
        public void setPos(int pos, int value) {
            if(pos < usedSize && pos >= 0) {
                this.elem[pos] = value;
            }
        }
//删除第一次出现的关键字key
        public void remove(int toRemove) {
            int index = search(toRemove);
            if(index == -1) {
                System.out.println("未找到该关键字");
                return;
            }
            for (int i = index; i < usedSize-1 ; i++) {
                elem[i] = elem[i+1];
            }
        }
// 获取顺序表长度
        public int size() {
            return this.elem.length;
        }
// 清空顺序表
        public void clear() {
            usedSize = 0;
        }
}

