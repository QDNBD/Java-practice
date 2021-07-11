//public class thread extends Thread{
//    @Override
//    public void run() {
//        System.out.println("hello");
//    }
//
//    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            Thread t1 = new thread();
//            t1.start();
//        }
//    }
//}
public class thread implements Runnable {
    @Override
    public void run() {
        System.out.println("111");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(new thread());
            thread1.start();
        }
    }
}