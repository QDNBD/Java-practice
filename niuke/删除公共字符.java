import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str = scan.nextLine();
            String ant = scan.nextLine();
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>();
            for(int i = 0;i < ant.length();i++) {
                set.add(ant.charAt(i));
            }
            
            for(int i = 0;i < str.length();i++) {
                if(set.contains(str.charAt(i))) {
                    continue;
                }else {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
        scan.close();
    }
}