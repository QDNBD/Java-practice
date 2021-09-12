package com.DaemonTest;

public class test1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        Thread thread1 = new Thread(new MyDaemon());
        thread1.setDaemon(true);
        thread1.start();
        thread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("myThread 运行第 " + i + "次");
        }
    }
}

class MyDaemon implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("myDaemon 后台运行第 " + i + "次");
        }
    }
}