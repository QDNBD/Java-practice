import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ant = str.split("_");
            StringBuilder sb = new StringBuilder();
            sb.append(ant[0]);
            for(int i = 1;i < ant.length;i++) {
                String tem = ant[i];
                sb.append((char)(tem.charAt(0)-'a'+'A'));
                for(int j = 1;j < tem.length();j++){
                    sb.append(tem.charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
        scan.close();
    }
}