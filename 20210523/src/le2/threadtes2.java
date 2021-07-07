package le2;

public class threadtes2 {
    public static void main(String[] args) throws InterruptedException {
//        for(int i = 0; i < 20; i++) {
//            final int n = i;
//            Thread t = new Thread(new Runnable() {
//                @Override
//                public void run() {//内部类使用外部的变量，必须是final修饰
//
//                        System.out.println(n);
//
//                }
//            });
//            t.start();
//        }
//        System.out.println("ok");
        Thread[] threads = new Thread[20];
        for(int i = 0; i < 20; i++) {
            final int n = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {//内部类使用外部的变量，必须是final修饰

                    System.out.println(n);

                }
            });
            threads[i] = t;

        }
        for(Thread t  : threads) {
            t.start();

        }
        for(Thread t : threads) {
            t.join();
        }
//        while (Thread.activeCount() > 1) {
//            Thread.yield();
//        }
        System.out.println("ok");
    }
}
