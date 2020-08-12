import java.util.*;

public class 创建线程对象示例 {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                System.out.println(i);
            };
        }
    }

    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 100; i < 110; i++) {
                System.out.println(i);
            }
        }
    }


    public static void main1(String[] args) throws InterruptedException {
        Thread a = new MyThread();
        a.start();
        a.join();
        System.out.println("a 一定结束了");

        Runnable target = new MyRunnable();
        Thread b = new Thread(target);
        b.start();
        b.join();
        System.out.println("b 一定结束了");

        Thread target2 = new MyThread();
        Thread c = new Thread(target2);
        c.start();
        c.join();
        System.out.println("c 一定结束了");

    }

    private static void 了解即可_使用匿名类创建线程对象(){
        // 等同于直接创建线程对象
        Thread a = new Thread(){
            @Override
            public void run() {
                //这里指定线程要干的活儿
            }
        };

        // 等同于先创建目标对象，再创建线程对象
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                //这里指定线程要干的活儿
            }
        });
        // b 的变形，使用 lambda 表达式
        // 完全等于 b 的写法
        Thread c = new Thread(() ->{
           // 这里指定线程要干的活儿
        });

    }



}
