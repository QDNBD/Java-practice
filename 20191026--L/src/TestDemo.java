public class TestDemo {

}

class Student {
    private String name;//null
    private int age;

    public static int count = 100;
    public final int size = 10;
    public static final int size2 = 20;


    public void eat() {
        System.out.println("吃饭");
    }



    public static void func1() {
        count = 111;
        System.out.println("static func1");
    }




}
