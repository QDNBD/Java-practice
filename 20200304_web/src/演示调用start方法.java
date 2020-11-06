public class 演示调用start方法 {
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

    public static void main(String[] args) {
        A a = new A();

        B b = new B();

        b.setPriority(Thread.MAX_PRIORITY);
        b.start();
        a.start();
        // 把 a 和 b 放入就绪队列中
        // main 线程被切换下来了(小概率事件)
        // CPU 从 a / b / main 三个线程中选
        // b 被选中了（小概率事件）
        // b 先运行，先打印
        // b 结束了，a / main 再选
        System.out.println("我是main");
    }
}
