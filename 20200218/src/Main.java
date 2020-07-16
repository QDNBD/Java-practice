
class OuterClass {
    private int data1 = 1;
    public int data2 = 2;
    int data3 = 3;
    public static int size = 10;


    public OuterClass() {

    }

    class  InnerClass{
        public int data4 = 4;
        public static final   int size = 10;

        public InnerClass() {
            System.out.println("InnerClass()");
        }
        public void test() {
            System.out.println("InnerClass:test()");
        }


    }

}

class OuterClass2 {
    private int data1 = 1;
    public int data2 = 2;
    int data3 = 3;
    public static int size = 10;


    public OuterClass2() {
        System.out.println("OuterClass2");
    }

    /**
     * 静态内部类；
     */

    static class InnerClass2 {
        public int data4 = 4;
       // public int data1 = 7;
        public static  int size = 5;

        OuterClass2 outerClass2;

        public InnerClass2() {
            System.out.println("InnerClass2()");
        }
        public InnerClass2(OuterClass2 o) {
            this.outerClass2 = o;
            System.out.println("InnerClass2(OuterClass2 o)");
        }

        public void test() {
            System.out.println("InnerClass2:test()");
            System.out.println(this.outerClass2.data1);
        }


    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
        innerClass2.test();

        System.out.println();


    }

    public static void main1(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.data2);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.data4);
    }


}
