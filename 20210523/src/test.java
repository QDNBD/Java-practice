public class test {
//    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            Thread t1 = new Thread() {
//                @Override
//                public void run(){
//                    System.out.println("hello");
//                }
//            };
//            t1.start();
//        }
//    }
//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        };
//        for(int i = 0; i < 10; i++) {
//            Thread thread  = new Thread(runnable);
//            thread.start();
//        }
//
//    }
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("dcods");
            }
        };
        for(int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(thread);
            thread1.start();
        }
    }
}
