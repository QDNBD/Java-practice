public class TestDamo1 {

    public class MyException extends Exception {
        public  MyException() {
            super();
        }
        public MyException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {

    }

    public static void main3(String[] args) {
        char[] array = {1,2,3,4};
        try{
            System.out.println(array[100]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("越界异常");
        }
    }

    public static void main2(String[] args) {
        String[] str = null;
        try{
            System.out.println(str[0]);
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("空指针异常");
        }
    }

    public static void main1(String[] args) {
        try{
            int a = 10/0;
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常了");
        }finally {
            System.out.println("执行了finally");
        }
    }
}
