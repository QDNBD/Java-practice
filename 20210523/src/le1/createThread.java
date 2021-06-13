package le1;

public class createThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t = new Thread(r);
        t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
