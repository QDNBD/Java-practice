import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str = scan.nextLine();
            String[] ret = str.split(";");
            int x = 0;
            int y = 0;
            for(String string : ret) {
                if(string.charAt(0) == 'D' && string.substring(1).matches("[0-9]+")) {
                    x += Integer.parseInt(string.substring(1));
                }
                if(string.charAt(0) == 'W' && string.substring(1).matches("[0-9]+")) {
                    y += Integer.parseInt(string.substring(1));
                }
                if(string.charAt(0) == 'A' && string.substring(1).matches("[0-9]+")) {
                    x -= Integer.parseInt(string.substring(1));
                }
                if(string.charAt(0) == 'S' && string.substring(1).matches("[0-9]+")) {
                    y -= Integer.parseInt(string.substring(1));
                }
            }
            System.out.println(x + "," + y);
        }
        scan.close();
    }
}