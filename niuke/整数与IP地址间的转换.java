import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String ip = sc.nextLine();
            String num = sc.nextLine();
            System.out.println(ipToTen(ip));
            numToIp(num);
        }
        sc.close();
    }
    
    public static long ipToTen(String ip) {
        String[] nums = ip.split("\\.");
        long add =  Long.parseLong(nums[0]);
        for(int i = 1;i < nums.length;i++) {
            add = add << 8;
            add += Long.parseLong(nums[i]);
        }
        return add;
    }
    
    public static void numToIp(String ten) {
        String ip = Long.toBinaryString(Long.parseLong(ten));
        StringBuilder sb = new StringBuilder();
        if(ip.length() < 32) {
            int count = 32-ip.length();
            while(count-- > 0) {
                sb.append(0);
            }
        }
        sb.append(ip);
        for(int i = 0; i < sb.length() -8;i += 8) {
            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
        }
        System.out.println(Integer.parseInt(sb.substring(sb.length() - 8,sb.length()),2));
    }
}