public class ThreadDome {
    private static class MyRunnable implements Runnable{
        public  volatile boolean isQuit = false;

        @Override
        public void run() {
            while (!isQuit) {
                System.out.println(Thread.currentThread().getName()+"忙着转账");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"差点无大事了");
        }
    }





    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target,"lisi");
        System.out.println(Thread.currentThread().getName() + "lisi开始转账");
        thread.start();
        Thread.sleep(10*1000);
        System.out.println(Thread.currentThread().getName()+"对面是骗子");
        target.isQuit = true;
    }
}
