import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ant = str.split("[^a-zA-Z]");
            StringBuilder sb = new StringBuilder();
            for(int i = ant.length-1;i >= 0;i--) {
                if(ant[i].equals(" ")) {
                    continue;
                }else {
                    sb.append(ant[i] +" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
        scan.close();
    }
}