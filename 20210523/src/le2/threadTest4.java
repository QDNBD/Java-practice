package le2;

public class threadTest4 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {//内部类使用外部的变量，必须是final修饰
                System.out.println("t");
//                try {
//                    Thread.sleep(99999999);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }});
        t.start();
        t.join();//当前线程main无条件等待，t线程执行完成后在执行main线程
        System.out.println("ok");
    }
}
