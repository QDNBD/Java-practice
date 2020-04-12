public class Test {
    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.addFirst(4);
        singleList.addFirst(5);
        singleList.addFirst(6);
        singleList.display();
        singleList.addLast(8);
        singleList.addLast(9);
        singleList.addLast(10);
        singleList.display();
        singleList.addIndex(0,99);
        singleList.addIndex(2,88);
        singleList.addIndex(0,77);
        singleList.addIndex(10,66);
        singleList.display();

    }

}
