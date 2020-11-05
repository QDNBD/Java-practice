import java.util.concurrent.BrokenBarrierException;

public class 演示调用run方法 {
    private static class A extends Thread{
        @Override
        public void run() {
            System.out.println("我是A");
        }
    }
    private static class B extends Thread{
        @Override
        public void run() {
            System.out.println("我是B");
        }
    }
    // 因为没有调用 start，所以 a，b 两个线程根本不会被调度
    // 完全是单线程的
    // 必须按照顺序执行
    public static void main(String[] args) {
        A a = new A();
        a.run();
        B b =new B();
        b.run();
        b.setPriority(Thread.MAX_PRIORITY);// 优先级只是个建议，不是强制



        System.out.println("我是main");
    }
}
