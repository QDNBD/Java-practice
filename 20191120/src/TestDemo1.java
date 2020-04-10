public class TestDemo1 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(3);
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList.disPlay();
        mySingleList.addIndex(0,99);
        mySingleList.addIndex(2,99);
        mySingleList.disPlay();
    }
}
