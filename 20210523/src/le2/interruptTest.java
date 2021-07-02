package le2;

public class interruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    for(int i = 0; i < 10000 && !Thread.currentThread().isInterrupted(); i++) {
//                        System.out.println(i);
//                        Thread.sleep(1000);
//                        //模拟中断阻塞，还没有进入for循环判断就一直在等待无法中断
//                        //Thread.sleep(10000000);
//                    }
//                }catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

//                for(int i = 0; i < 10000 && !Thread.currentThread().isInterrupted(); i++) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    //模拟中断阻塞，还没有进入for循环判断就一直在等待无法中断
//                    //Thread.sleep(10000000);
//                }



//                thread.start();
//                System.out.println("t,start");
//                //模拟thread执行了5秒，还没有结束，要中断，停止thread线程
//                Thread.sleep(5000);
//                //线程中断
//
//                //告诉thread线程（设置thread线程的中断标志位），自行决定是否中断
//                //如果中断会抛异常，并且重置中断标志位
//                thread.interrupt();
//                System.out.println("t stop");

//                Thread.interrupted();返回当前线程中断标志位，然后重置中断标志位
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + ": " +  Thread.interrupted());

                }

            }
        });
        thread.start();
        System.out.println("t,start");
        //模拟thread执行了5秒，还没有结束，要中断，停止thread线程
       // Thread.sleep(5000);
        //线程中断

        //告诉thread线程（设置thread线程的中断标志位），自行决定是否中断
        //如果中断会抛异常，并且重置中断标志位
        thread.interrupt();
        System.out.println("t stop");
    }
}
