package le2;

import java.util.Scanner;

public class stoptread {
    private static volatile boolean STOP = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //执行任务时间长
                try {
                    for(int i = 0; i < 10000 && !STOP; i++) {
                    System.out.println(i);
                    Thread.sleep(1000);
                    //模拟中断阻塞，还没有进入for循环判断就一直在等待无法中断
                        // Thread.sleep(10000000);
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        System.out.println("t,start");
        //模拟thread执行了5秒，还没有结束，要中断，停止thread线程
        Thread.sleep(5000);
        //线程中断
        STOP = true;
        System.out.println("t stop");
    }
}
