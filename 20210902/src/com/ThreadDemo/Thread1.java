package com.ThreadDemo;

public class Thread1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("这里是运行代码的地方");
    }
}