package com;

public class Text {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        // System.out.println(demo1.value);
    }
    public static void main1(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(99);
        doubleList.addFirst(2);
        doubleList.addFirst(3);
        doubleList.addFirst(99);
        doubleList.addFirst(5);
        doubleList.addIndex(0,99);
        doubleList.addIndex(6,99);
        doubleList.addIndex(2,888);
        doubleList.display();
        doubleList.clear();
        System.out.println("fadsafs");
        /*doubleList.removeAllKey(99);
        doubleList.display();*/
    }
}
