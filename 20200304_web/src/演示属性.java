public class 演示属性 {
    private static void printFields() {
        Thread t = Thread.currentThread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getState());
        System.out.println(t.getPriority());
        System.out.println(t.isDaemon());
        System.out.println(t.isAlive());
        System.out.println(t.isInterrupted());
    }

    public static  void  main(String[] args) {
        Thread t = new Thread(() -> {
            printFields();
            try{
                Thread.sleep(1000000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        } ,"我的名字是小陈");
        t.start();
        printFields();
        System.out.println("==============");
        try {
            Thread.sleep(1000000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
