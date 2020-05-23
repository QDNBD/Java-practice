import java.util.ArrayList;
import java.util.Arrays;

public class TextDamo{

    public class A<T> {
        T value;
        A(T value) {
            this.value = value;
        }
        T get() {
            return value;
        }
    }

    public static void main(String[] args) {
        A<String>[] a = new ArrayList<>[];
        a.value = null;
        a.get();

    }

    public static void main4(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0,10);
        myLinkedList.addAtIndex(0,20);
        myLinkedList.addAtIndex(1,30);
        myLinkedList.display();
        System.out.println(myLinkedList.get(0));
       /* myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3,0);
        myLinkedList.display();
        System.out.println("**********");
        myLinkedList.deleteAtIndex(2);

        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        myLinkedList.display();
        System.out.println("========");

        myLinkedList.addAtHead(4);
        myLinkedList.addAtIndex(5,0);
        myLinkedList.addAtHead(6);
        myLinkedList.display();
*/

//        myLinkedList.deleteAtIndex(1);
//        myLinkedList.display();
//        System.out.println("******");
//
//        System.out.println(myLinkedList.get(1));
//        System.out.println();
//        myLinkedList.display();

    }
    public static void main1(String[] args) {
        MyListQueue myListQueue = new MyListQueue();
        myListQueue.isEmpty();
    }

}
