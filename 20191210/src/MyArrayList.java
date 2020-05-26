public class MyArrayList<T> {

    public T[] elem;
    public int usedSize;
    public MyArrayList() {
        this.elem = (T[])new Object[10];
        this.usedSize = 0;
    }

    public void add(T data){
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    public T get() {
        return  this.elem[this.usedSize-1];
    }

    public  T get(int index) {
        if (index >= this.usedSize || index < 0)
            return null;
        return  this.elem[index];
    }

    public void clear() {
        this.usedSize = 0;
    }
}
