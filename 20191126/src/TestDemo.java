import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {

        String str = "1a23456" ;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < '0'||array[i] > '9'
                    ) {
                System.out.println("不全是数字组成");
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
