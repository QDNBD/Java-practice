public class DoubleListTest {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.display();
        doubleList.addIndex(2,99);
        doubleList.addIndex(0,99);
        doubleList.display();

    }
}
