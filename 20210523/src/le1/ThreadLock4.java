package le1;

public class ThreadLock4 {
    public static void main(String[] args) {
        //同时启动20个线程，每个线程从0 加到9999
        for (int i = 0; i < 20; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    int sum = 0;
                    while (sum <= 9999) {
                        sum++;
                        if(sum == 9999) {
                            System.out.println(sum);
                        }
                    }
                }
            };
            t.start();
            System.out.println(i);
        }

    }
}
