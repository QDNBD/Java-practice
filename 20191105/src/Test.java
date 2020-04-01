public class Test {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(1);
        mySingleList.addFirst(2);
        mySingleList.addFirst(3);
        mySingleList.addFirst(4);
        mySingleList.addFirst(5);
        mySingleList.display();
        mySingleList.display2(mySingleList.midleNode1());
        mySingleList.display2(mySingleList.midleNode2());
        mySingleList.display2(mySingleList.reverseList());
        mySingleList.display();
        mySingleList.display2(mySingleList.indexNode(3));

    }
}
