import java.util.*;
public class text {
}


 class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String ip = scan.nextLine();
            String ten = scan.nextLine();
            System.out.println(ipToTen(ip));
            tenToIp(ten);
        }
        scan.close();
    }

    public static long ipToTen(String ip) {
        String[] arr = ip.split("\\.");
        long sum = Long.parseLong(arr[0]);
        for(int i = 1; i < arr.length;i++) {
            sum = sum<<8;
            sum += Long.parseLong(arr[i]);
        }
        return sum;
    }

    public static void tenToIp(String ten) {
        String ip = Long.toBinaryString(Long.parseLong(ten));
        StringBuilder sb = new StringBuilder();
        if(ip.length() < 32){
            for (int i = 0; i < 32-ip.length(); i++) {
                sb.append(0);
            }
            sb.append(ip);
        }else if(ip.length() == 32) {
            sb.append(ip);
        }
        
        for(int i = 0;i < sb.length() - 8;i+=8) {
            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
        }
        System.out.println(Integer.parseInt(sb.substring(sb.length() - 8,sb.length()),2));
    }
}