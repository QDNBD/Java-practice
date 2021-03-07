import java.util.*;

public class Main {
    public static int days(int year,int mouth,int day) {
        int toDay = 0;
        if((year % 100 != 0 && year % 4 == 0 ) || year % 400 == 0) {
            toDay = 1;
        }
        if(mouth <= 2) {
            if(mouth == 1) {
                return day;
            }
            return 31+day;
        }
        int count = 0;
        if(mouth <= 8) {
            for(int i = 1; i < mouth;i++) {
                if(i % 2 == 0) {
                    count += 30;
                }else {
                    count += 31;
                }
            }
            return count+day+toDay-2;
        }
        count = 212+toDay;
        if(mouth <= 12) {
            for(int i = 8; i < mouth;i++) {
                if(i % 2 == 0) {
                    count += 31;
                }else {
                    count += 30;
                }
            }
            return count+day;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
             int year = scan.nextInt();
        int mouth = scan.nextInt();
        int day = scan.nextInt();
        
        System.out.println(days(year,mouth,day));
        }
       
        scan.close();
        }
    
}