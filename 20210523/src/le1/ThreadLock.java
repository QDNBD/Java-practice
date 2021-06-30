package le1;

public class ThreadLock {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("jsdia");
                }
            }
        };
        //线程要启动，必须使用start（） 告诉系统要启动
        t.start();
    }
}
