package why;

public class Case1 {
    static final int COUNT = 10;
    static final long NUMBER = 10_0000_0000;
    
    static long sum() {
        long r = 0;
        for (long i = 0; i < NUMBER; i++) {
            r += i;
        }
        return r;
    }
    static void 单线程() {
        long b = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            System.out.println(sum());
        }
        long e = System.nanoTime();
        double s = (e - b) / 1000_000_000.0;
        System.out.println("单线程，运行时间：" + s);
    }
    
    static class SumThread extends Thread{
        @Override
        public void run() {
            System.out.println(sum());
        }
    }

    static void 多线程() throws InterruptedException {
        long b = System.nanoTime();
        Thread[] threads = new Thread[COUNT - 1];
        for (int i = 0; i < COUNT - 1; i++) {
            threads[i] = new SumThread();
            threads[i].start();
        }
        System.out.println(sum());
        for (int i = 0; i < COUNT - 1; i++) {
            threads[i].join();
        }
        long e = System.nanoTime();
        double s = (e - b) / 1000_000_000.0;
        System.out.println("多线程，运行时间：" + s);
    }

    public static void main(String[] args) throws InterruptedException {
        单线程();
        System.out.println("======================");
        多线程();
    }
    
}
